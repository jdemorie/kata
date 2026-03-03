package com.demo.kata.bowling;

public class BowlingArea {
  private final BowlingLineReader scoreReader;
  private final BowlingLineWriter scoreWriter;

  public BowlingArea(BowlingLineReader scoreReader, BowlingLineWriter scoreWriter) {
    this.scoreReader = scoreReader;
    this.scoreWriter = scoreWriter;
  }

  public BowlingGame start() {
    return new BowlingGame(scoreReader, scoreWriter);
  }

  public int computeScore(BowlingLine currentLine) {
    BowlingScoreComputer scoreComputer = new BowlingScoreComputer();
    return scoreComputer.computeScore(currentLine);
  }

  public String getOutputLine(BowlingLine currentLine) {
    BowlingLineOutputFormatter outputFormatter = new BowlingLineOutputFormatter();
    return outputFormatter.getOutputLine(currentLine);
  }
}
