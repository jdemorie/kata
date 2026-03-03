package com.demo.kata.bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingScenario {
  private BowlingArea bowlingArea;
  private BowlingGame bowlingGame;

  public BowlingScenario givenABowlingArea() {
    bowlingArea = new BowlingArea(new FakeScoreReader(), new FakeScoreWriter());
    return this;
  }

  public BowlingScenario whenIStartAGame() {
    bowlingGame = bowlingArea.start();
    return this;
  }

  public BowlingScenario thenTheTurnScoresShouldBe(BowlingScore expectedScore) {
    BowlingScore currentScore = bowlingGame.getCurrentScore();
    assertEquals(expectedScore, currentScore);
    return this;
  }

  public BowlingScenario whenIDownPins(int numberOfDownPins) {
    bowlingGame.pinsDown(numberOfDownPins);
    return this;
  }

  public BowlingScenario thenTheTotalScoreShouldBe(int expectedScore) {
    assertEquals(expectedScore, bowlingGame.getCurrentScore().getScore());
    return this;
  }

  public BowlingScenario thenTheOutputLineShouldBe(String expectedLine) {
    assertEquals(expectedLine, bowlingGame.getCurrentScore().getOutputLine());
    return this;
  }
}
