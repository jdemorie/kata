package com.demo.kata.bowling;

import java.util.Objects;

public final class BowlingTurnScore {
  private int first;
  private int second;
  private int attempts = 0;
  private int bonus = 0;

  public BowlingTurnScore(int first, int second) {
    this.first = first;
    this.second = second;
  }

  public void pinsDown(int numberOfDownPins, boolean spare) {
    if (attempts == 0) {
      if (spare) {
        bonus = numberOfDownPins;
      }
      first = numberOfDownPins;
    } else {
      second = numberOfDownPins;
    }
    attempts++;
  }

  public boolean isSpare() {
    return second != 0 && first + second == 10;
  }

  public int getScore() {
    return first + second + bonus;
  }

  public String getOutputLine() {
    if (first + second == 10) {
      return first + "/";
    }
    return first + "" + second;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BowlingTurnScore that = (BowlingTurnScore) o;
    return Objects.equals(first, that.first) && Objects.equals(second, that.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }

  @Override
  public String toString() {
    return "BowlingTurnScore{" +
           "first='" + first + '\'' +
           ", second='" + second + '\'' +
           '}';
  }
}
