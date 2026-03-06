package com.demo.server.controller;

import com.demo.server.api.DefaultApi;
import com.demo.server.model.PlayerBean;
import com.demo.server.model.ResponseBean;
import com.demo.server.model.ScoreBean;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Controller("/server")
public class BowlingApplicationController implements DefaultApi {

  @Get("/score")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Override
  public Mono<@NotNull List<@Valid ScoreBean>> getScore() {
    List<ScoreBean> scoreBeanList = new ArrayList<>();
    scoreBeanList.add(new ScoreBean("", 0));
    return Mono.just(scoreBeanList);
  }

  @Post("/play")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Override
  public Mono<@Valid ResponseBean> play(@Body @NotNull @Valid PlayerBean playerBean) {
    return Mono.just(new ResponseBean("Player " + playerBean.getName() + " played"));
  }

  @Post("/start")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Override
  public Mono<@Valid ResponseBean> start(List<@Valid PlayerBean> playerBeans) {
    return Mono.just(new ResponseBean("Game started"));
  }
}
