package com.demo.server.controller;

import com.demo.kata.bowling.BowlingLine;
import com.demo.kata.bowling.BowlingLineReader;
import com.demo.kata.bowling.BowlingTurn;

public class MemoryBowlingLineReader implements BowlingLineReader {
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
