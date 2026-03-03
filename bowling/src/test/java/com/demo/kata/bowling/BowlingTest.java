package com.demo.kata.bowling;

import org.junit.jupiter.api.Test;

public class BowlingTest {
  @Test
  void givenABowlingAreaWhenIStartAGameThenTheScoreShouldBeZero() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("00 00 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(0);
  }

  @Test
  void givenABowlingAreaWhenIDown4PinsThenTheScoreShouldBe4() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("40 00 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(4);
  }

  @Test
  void givenABowlingAreaWhenIDown4PinsThen5PinsThenTheScoreShouldBe9() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(5)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 5),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("45 00 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(9);
  }

  @Test
  void givenABowlingAreaWhenIDown3PinsOnSecondTurnThenTheScoreShouldBe9() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(5)
        .whenIDownPins(3)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 5),
                                                    new BowlingTurnScore(3, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("45 30 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(12);
  }

  @Test
  void givenABowlingAreaWhenIDown4PinsThen6PinsThenTheScoreShouldBeSpare() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(6)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 6),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("4/ 00 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(10);
  }

  @Test
  void givenABowlingAreaWhenIMakeSpareAndDown5PinsAfterThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(6)
        .whenIDownPins(5)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 6),
                                                    new BowlingTurnScore(5, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("4/ 50 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(20);
  }

  @Test
  void givenABowlingAreaWhenIMakeSpareAndDown5And3PinsAfterThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(6)
        .whenIDownPins(5)
        .whenIDownPins(3)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 6),
                                                    new BowlingTurnScore(5, 3),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("4/ 53 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(23);
  }

  @Test
  void givenABowlingAreaWhenIMakeSpareAndDoAnotherSpareAfterThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(6)
        .whenIDownPins(5)
        .whenIDownPins(5)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 6),
                                                    new BowlingTurnScore(5, 5),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("4/ 5/ 00 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(25);
  }

  @Test
  void givenABowlingAreaWhenIMakeTwoConsecutiveSparesAndDown4PinsAfterThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(6)
        .whenIDownPins(5)
        .whenIDownPins(5)
        .whenIDownPins(4)
        .thenTheTurnScoresShouldBe(new BowlingScore(new BowlingTurnScore(4, 6),
                                                    new BowlingTurnScore(5, 5),
                                                    new BowlingTurnScore(4, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0),
                                                    new BowlingTurnScore(0, 0)))
        .thenTheOutputLineShouldBe("4/ 5/ 40 00 00 00 00 00 00 00")
        .thenTheTotalScoreShouldBe(33);
  }
}
