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

  public void pinsDown(int numberOfDownPins) {
    if (attempts == 0) {
      first = numberOfDownPins;
    } else {
      second = numberOfDownPins;
    }
    attempts++;
  }

  public void pinsDownWithSpare(int numberOfDownPins) {
    if (attempts == 0) {
      bonus = numberOfDownPins;
      first = numberOfDownPins;
    } else {
      second = numberOfDownPins;
    }
    attempts++;
  }

  public void pinsDownWithStrike(int numberOfDownPins, boolean doubleStrike) {
    if (attempts == 0) {
      first = numberOfDownPins;
      if (numberOfDownPins == 10) {
        bonus = numberOfDownPins;
      }
      if (doubleStrike) {
        bonus = numberOfDownPins;
      }
    } else {
      second = numberOfDownPins;
      bonus += numberOfDownPins + first;
    }
    attempts++;
  }

  public boolean isSpare() {
    return second != 0 && first + second == 10;
  }

  public boolean isStrike() {
    return second == 0 && first == 10;
  }

  public int getScore() {
    return first + second + bonus;
  }

  public int getAttempts() {
    return attempts;
  }

  public String getOutputLine() {
    if (first == 10) {
      return "X";
    }
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
