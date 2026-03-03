package com.demo.kata.bowling;

public class BowlingGame {
  private final BowlingScore score = new BowlingScore(new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0),
                                                      new BowlingTurnScore(0, 0));
  private int attempts;

  public BowlingGame() {
    attempts = 0;
  }

  public BowlingScore getCurrentScore() {
    return score;
  }

  public void pinsDown(int numberOfDownPins) {
    if (numberOfDownPins == 10) {
      attempts++;
    }
    int currentTurn = attempts / 2;
    score.pinsDown(currentTurn, numberOfDownPins);
    attempts++;
  }
}
