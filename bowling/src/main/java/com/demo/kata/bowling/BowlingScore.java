package com.demo.kata.bowling;

import java.util.Arrays;
import java.util.Objects;

public final class BowlingScore {
  private final BowlingTurnScore[] turns;

  public BowlingScore(BowlingTurnScore... turns) {
    this.turns = turns;
  }

  public void pinsDown(int turnNumber, int numberOfDownPins) {
    if (turnNumber > 0) {
      boolean spare = turns[turnNumber - 1].isSpare();
      if (spare) {
        turns[turnNumber].pinsDownWithSpare(numberOfDownPins);
        return;
      }
      if (turnNumber > 1) {
        boolean strike = turns[turnNumber - 2].isStrike();
        if (strike) {
          int score = turns[turnNumber - 1].getScore();
          turns[turnNumber].pinsDownWithStrike(numberOfDownPins, score);
          return;
        }
      }
    }
    turns[turnNumber].pinsDown(numberOfDownPins);
  }

  public int getScore() {
    int score = 0;
    for (BowlingTurnScore turn : turns) {
      score += turn.getScore();
    }
    return score;
  }

  public String getOutputLine() {
    StringBuilder builder = new StringBuilder();
    for (BowlingTurnScore turn : turns) {
      builder.append(turn.getOutputLine()).append(" ");
    }
    return builder.toString().trim();
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BowlingScore that = (BowlingScore) o;
    return Objects.deepEquals(turns, that.turns);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(turns);
  }

  @Override
  public String toString() {
    return "BowlingScore{" +
           "turns=" + Arrays.toString(turns) +
           '}';
  }

}
