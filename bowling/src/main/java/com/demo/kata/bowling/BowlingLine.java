package com.demo.kata.bowling;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class BowlingLine {
  private final BowlingTurn[] turns;

  public BowlingLine(BowlingTurn... turns) {
    this.turns = turns;
  }

  public void pinsDown(int turnNumber, int numberOfDownPins) {
    BowlingTurn turn = turns[turnNumber];
    turn.pinsDown(numberOfDownPins);
  }

  public List<BowlingTurn> getTurns() {
    return List.of(turns);
  }

  public BowlingTurn getTurn(int turnIndex) {
    return turns[turnIndex];
  }

  public BowlingTurn getPreviousTurn(int turnIndex, int decrement) {
    if (turnIndex - decrement < 0) {
      return null;
    }
    return turns[turnIndex - decrement];
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BowlingLine that = (BowlingLine) o;
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
