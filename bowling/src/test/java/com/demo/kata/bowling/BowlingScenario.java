package com.demo.kata.bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingScenario {
  private BowlingArea bowlingArea;
  private BowlingGame bowlingGame;

  public BowlingScenario givenABowlingArea() {
    bowlingArea = new BowlingArea(new FakeLineReader(), new FakeLineWriter());
    return this;
  }

  public BowlingScenario whenIStartAGame() {
    bowlingGame = bowlingArea.start();
    return this;
  }

  public BowlingScenario thenTheTurnShouldBe(BowlingLine expectedScore) {
    BowlingLine currentScore = bowlingGame.getCurrentLine();
    assertEquals(expectedScore, currentScore);
    return this;
  }

  public BowlingScenario whenIDownPins(int numberOfDownPins) {
    bowlingGame.pinsDown(numberOfDownPins);
    return this;
  }

  public BowlingScenario thenTheScoreShouldBe(int expectedScore) {
    assertEquals(expectedScore, bowlingArea.computeScore(bowlingGame.getCurrentLine()));
    return this;
  }

  public BowlingScenario thenTheOutputLineShouldBe(String expectedLine) {
    assertEquals(expectedLine, bowlingArea.getOutputLine(bowlingGame.getCurrentLine()));
    return this;
  }
}
