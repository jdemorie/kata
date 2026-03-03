package com.demo.kata.bowling;

public class FakeScoreReader implements BowlingScoreReader {
  @Override
  public BowlingScore read() {
    return new BowlingScore(new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0),
                            new BowlingTurnScore(0, 0));
  }
}
