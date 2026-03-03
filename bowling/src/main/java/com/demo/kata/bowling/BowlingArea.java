package com.demo.kata.bowling;

public class BowlingArea {
  private final BowlingScoreReader scoreReader;
  private final BowlingScoreWriter scoreWriter;

  public BowlingArea(BowlingScoreReader scoreReader, BowlingScoreWriter scoreWriter) {
    this.scoreReader = scoreReader;
    this.scoreWriter = scoreWriter;
  }

  public BowlingGame start() {
    return new BowlingGame(scoreReader, scoreWriter);
  }
}
