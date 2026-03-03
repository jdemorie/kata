package com.demo.kata.bowling;

public class BowlingBonusCalculator {
  private int spares = 0;
  private int strikes = 0;
  private int bonus;

  public int getBonus() {
    return bonus;
  }

  public void pushSpare() {
    spares++;
  }

  public void pushStrike() {
    strikes++;
  }

  public void computeBonusForTurn(BowlingTurn turn) {
    if (spares == 0 && strikes == 0) {
      return;
    }
    if (spares > 0) {
      bonus += turn.getFirstDownPins();
      spares--;
    }
    if (strikes > 0) {
      if (turn.isStrike()) {
        return;
      }
      if (turn.isComplete()) {
        if (strikes == 2) {
          bonus += turn.getFirstDownPins() + 10;
          strikes--;
          bonus += turn.getFirstDownPins() + turn.getSecondDownPins();
          strikes--;
        } else {
          bonus += turn.getFirstDownPins() + turn.getSecondDownPins();
          strikes--;
        }
      }
    }
  }
}
