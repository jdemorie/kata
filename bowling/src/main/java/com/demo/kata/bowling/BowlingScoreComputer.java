package com.demo.kata.bowling;

import java.util.List;

public class BowlingScoreComputer {
  public int computeScore(BowlingLine line) {
    int score = 0;
    BowlingBonusCalculator bonusCalculator = new BowlingBonusCalculator();
    List<BowlingTurn> turns = line.getTurns();
    for (BowlingTurn turn : turns) {
      bonusCalculator.computeBonusForTurn(turn);
      if (turn.isSpare()) {
        bonusCalculator.pushSpare();
      }
      if (turn.isStrike()) {
        bonusCalculator.pushStrike();
      }
      score += turn.getFirstDownPins() + turn.getSecondDownPins();
    }
    return score + bonusCalculator.getBonus();
  }
}
