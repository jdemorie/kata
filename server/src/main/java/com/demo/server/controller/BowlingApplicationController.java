package com.demo.server.controller;

import com.demo.kata.bowling.*;
import com.demo.server.api.DefaultApi;
import com.demo.server.model.PlayerBean;
import com.demo.server.model.ResponseBean;
import com.demo.server.model.ScoreBean;
import com.demo.server.model.TurnBean;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.http.annotation.Error;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller("/server")
public class BowlingApplicationController implements DefaultApi {
  private BowlingGame bowlingGame;
  private BowlingArea bowlingArea;

  @Get("/score")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Override
  public Mono<@NotNull List<@Valid ScoreBean>> getScore() {
    List<ScoreBean> scoreBeanList = new ArrayList<>();
    BowlingScore score = bowlingGame.getScore();
    score.forEach((player, currentLine) -> {
      BowlingLineOutputFormatter formatter = new BowlingLineOutputFormatter();
      List<String> outputLine = formatter.getOutputLine(currentLine);
      List<TurnBean> turnBeans = new ArrayList<>();
      for (String turn : outputLine) {
        turnBeans.add(new TurnBean(turn));
      }
      ScoreBean scoreBean = new ScoreBean(player, bowlingArea.computeScore(currentLine));
      scoreBean.turns(turnBeans);
      scoreBeanList.add(scoreBean);
    });
    return Mono.just(scoreBeanList);
  }

  @Post("/play")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Override
  public Mono<@Valid ResponseBean> play(@Body @NotNull @Valid PlayerBean playerBean) {
    int remainingPins = bowlingGame.getRemainingPins(playerBean.getName());
    int pinsDowns = new Random().nextInt(remainingPins) + 1;
    bowlingGame.pinsDown(playerBean.getName(), pinsDowns);
    return Mono.delay(Duration.ofSeconds(3))
        .then(Mono.just(new ResponseBean("Player " + playerBean.getName() + "  hits " + pinsDowns + " pins")));
  }

  @Post("/start")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Override
  public Mono<@Valid ResponseBean> start(List<@Valid PlayerBean> playerBeans) {
    bowlingArea = new BowlingArea(new MemoryBowlingLineReader(), new MemoryBowlingLineWriter());
    bowlingGame = bowlingArea.start(playerBeans.stream().map(PlayerBean::getName).toArray(String[]::new));
    return Mono.just(new ResponseBean("Game started"));
  }
}
