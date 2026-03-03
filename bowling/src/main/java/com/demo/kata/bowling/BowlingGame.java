package com.demo.kata.bowling;

public class BowlingGame {
  private final BowlingScore score;
  private final BowlingScoreWriter scoreWriter;
  private int attempts;

  public BowlingGame(BowlingScoreReader scoreReader, BowlingScoreWriter scoreWriter) {
    this.score = scoreReader.read();
    this.scoreWriter = scoreWriter;
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
    scoreWriter.write(score);
  }
}
