package com.demo.kata.bowling;

public class FakeLineReader implements BowlingLineReader {
  @Override
  public BowlingLine read() {
    return new BowlingLine(new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0),
                           new BowlingTurn(0, 0));
  }
}
