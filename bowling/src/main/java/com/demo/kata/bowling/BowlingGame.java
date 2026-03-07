package com.demo.kata.bowling;

public class BowlingGame {
  private final BowlingScore score;
  private final BowlingLineWriter lineWriter;
  private int attempts;

  public BowlingGame(BowlingLineReader lineReader, BowlingLineWriter lineWriter, String... players) {
    this.score = lineReader.read(players);
    this.lineWriter = lineWriter;
    attempts = 0;
  }

  public BowlingScore getScore() {
    return score;
  }
  
  public BowlingLine getCurrentLine(String player) {
    return score.get(player);
  }

  public void pinsDown(String player, int numberOfDownPins) {
    if (numberOfDownPins == 10) {
      attempts++;
    }
    int currentTurn = attempts / 2;
    score.get(player).pinsDown(currentTurn, numberOfDownPins);
    attempts++;
    lineWriter.write(score);
  }
}
