package com.demo.kata.bowling;

public class BowlingGame {
  private final BowlingLine line;
  private final BowlingLineWriter lineWriter;
  private int attempts;

  public BowlingGame(BowlingLineReader lineReader, BowlingLineWriter lineWriter) {
    this.line = lineReader.read();
    this.lineWriter = lineWriter;
    attempts = 0;
  }

  public BowlingLine getCurrentLine() {
    return line;
  }

  public void pinsDown(int numberOfDownPins) {
    if (numberOfDownPins == 10) {
      attempts++;
    }
    int currentTurn = attempts / 2;
    line.pinsDown(currentTurn, numberOfDownPins);
    attempts++;
    lineWriter.write(line);
  }
}
