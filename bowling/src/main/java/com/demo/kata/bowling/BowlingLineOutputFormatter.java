package com.demo.kata.bowling;

import java.util.List;

public class BowlingLineOutputFormatter {
  public String getOutputLine(BowlingLine line) {
    StringBuilder builder = new StringBuilder();
    List<BowlingTurn> turnList = line.getTurns();
    for (BowlingTurn turn : turnList) {
      builder.append(getOutputLine(turn)).append(" ");
    }
    return builder.toString().trim();
  }

  private String getOutputLine(BowlingTurn turn) {
    if (turn.isStrike()) {
      return "X";
    }
    if (turn.isSpare()) {
      return turn.getFirstDownPins() + "/";
    }
    return turn.getFirstDownPins() + "" + turn.getSecondDownPins();
  }
}
