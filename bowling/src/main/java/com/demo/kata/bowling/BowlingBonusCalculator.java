package com.demo.kata.bowling;

public class BowlingBonusCalculator {
  private final BowlingLine line;
  private int bonus;

  public BowlingBonusCalculator(BowlingLine line) {
    this.line = line;
  }

  public int getBonus() {
    return bonus;
  }

  public void computeBonusForTurn(int turnIndex) {
    BowlingTurn turn = line.getTurn(turnIndex);
    BowlingTurn previousTurn = line.getPreviousTurn(turnIndex, 1);
    if (previousTurn == null) {
      return;
    }
    if (previousTurn.isSpare()) {
      bonus += turn.getFirstDownPins();
      return;
    }
    if (previousTurn.isStrike()) {
      if (turn.isStrike()) {
        return;
      }
      BowlingTurn previousAfterPreviousTurn = line.getPreviousTurn(turnIndex, 2);
      if (turn.isComplete()) {
        bonus += turn.getFirstDownPins() + turn.getSecondDownPins();
        if (previousAfterPreviousTurn == null) {
          return;
        }
        if (previousAfterPreviousTurn.isStrike()) {
          bonus += turn.getFirstDownPins() + previousTurn.getFirstDownPins();
        }
        return;
      }
      if (previousAfterPreviousTurn == null) {
        return;
      }
      if (previousAfterPreviousTurn.isStrike()) {
        bonus += turn.getFirstDownPins();
      }
    }
  }
}
