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
    int firstDownPins = turn.getFirstDownPins();
    if (turn.isSpare()) {
      return firstDownPins + "/";
    }
    int secondDownPins = turn.getSecondDownPins();
    if (turn.isComplete()) {
      return getPinsOrMissed(firstDownPins) + getPinsOrMissed(secondDownPins);
    }
    return firstDownPins + "" + secondDownPins;
  }

  private String getPinsOrMissed(int numberOfPins) {
    return numberOfPins == 0 ? "-" : String.valueOf(numberOfPins);
  }
}
