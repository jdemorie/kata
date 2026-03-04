package com.demo.kata.bowling;

import org.junit.jupiter.api.Test;

public class BowlingTest {
  @Test
  void givenABowlingAreaWhenIStartAGameThenTheScoreShouldBeZero() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("00 00 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(0);
  }

  @Test
  void givenABowlingAreaWhenIDown4PinsThenTheScoreShouldBe4() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("40 00 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(4);
  }

  @Test
  void givenABowlingAreaWhenIDown4PinsThen5PinsThenTheScoreShouldBe9() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(5)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 5),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("45 00 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(9);
  }

  @Test
  void givenABowlingAreaWhenIDown3PinsOnSecondTurnThenTheScoreShouldBe9() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(5)
        .whenIDownPins(3)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 5),
                                             new BowlingTurn(3, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("45 30 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(12);
  }

  @Test
  void givenABowlingAreaWhenIMissedPinsOnSecondTurnThenTheScoreShouldBe9() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(0)
        .whenIDownPins(3)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 0),
                                             new BowlingTurn(3, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("4- 30 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(7);
  }

  @Test
  void givenABowlingAreaWhenIDown4PinsThen6PinsThenTheScoreShouldBeSpare() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(6)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 6),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("4/ 00 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(10);
  }

  @Test
  void givenABowlingAreaWhenIMakeSpareAndDown5PinsAfterThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(4)
        .whenIDownPins(6)
        .whenIDownPins(5)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 6),
                                             new BowlingTurn(5, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("4/ 50 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(20);
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
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 6),
                                             new BowlingTurn(5, 3),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("4/ 53 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(23);
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
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 6),
                                             new BowlingTurn(5, 5),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("4/ 5/ 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(25);
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
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(4, 6),
                                             new BowlingTurn(5, 5),
                                             new BowlingTurn(4, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("4/ 5/ 40 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(33);
  }

  @Test
  void givenABowlingAreaWhenIDoAStrikeThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X 00 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(10);
  }

  @Test
  void givenABowlingAreaWhenIDoAStrikeAfterPinsDownThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(1)
        .whenIDownPins(2)
        .whenIDownPins(10)
        .whenIDownPins(7)
        .whenIDownPins(1)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(1, 2),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(7, 1),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("12 X 71 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(29);
  }

  @Test
  void givenABowlingAreaWhenIDoAStrikeAndIDown4PinsThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(4)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(4, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X 40 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(14);
  }

  @Test
  void givenABowlingAreaWhenIDoAStrikeAndIDown4And2PinsThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(4)
        .whenIDownPins(2)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(4, 2),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X 42 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(22);
  }

  @Test
  void givenABowlingAreaWhenIDoAStrikeAndIDownPinsOnNext2TurnsThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(4)
        .whenIDownPins(2)
        .whenIDownPins(6)
        .whenIDownPins(2)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(4, 2),
                                             new BowlingTurn(6, 2),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X 42 62 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(30);
  }

  @Test
  void givenABowlingAreaWhenIDoTwoConsecutiveStrikesThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(10)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X X 00 00 00 00 00 00 00 00")
        .thenTheScoreShouldBe(20);
  }

  @Test
  void givenABowlingAreaWhenIDoTwoConsecutiveStrikesAndIDownPinsOnNext2TurnsThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(3)
        .whenIDownPins(2)
        .whenIDownPins(4)
        .whenIDownPins(1)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(3, 2),
                                             new BowlingTurn(4, 1),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X X 32 41 00 00 00 00 00 00")
        .thenTheScoreShouldBe(48);
  }

  @Test
  void givenABowlingAreaWhenIDoThreeConsecutiveStrikesAndIDownPinsOnNext2TurnsThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(3)
        .whenIDownPins(2)
        .whenIDownPins(4)
        .whenIDownPins(1)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(3, 2),
                                             new BowlingTurn(4, 1),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X X X 32 41 00 00 00 00 00")
        .thenTheScoreShouldBe(78);
  }

  @Test
  void givenABowlingAreaWhenIDoFourConsecutiveStrikesAndIDownPinsOnNext2TurnsThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(3)
        .whenIDownPins(2)
        .whenIDownPins(4)
        .whenIDownPins(1)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(3, 2),
                                             new BowlingTurn(4, 1),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X X X X 32 41 00 00 00 00")
        .thenTheScoreShouldBe(108);
  }

  @Test
  void givenABowlingAreaWhenIDoNineConsecutiveStrikesThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(0, 0),
                                             new BowlingTurn(0, 0)))
        .thenTheOutputLineShouldBe("X X X X X X X X 00 00")
        .thenTheScoreShouldBe(200);
  }

  @Test
  void givenABowlingAreaWhenIDoTenConsecutiveStrikesThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0)))
        .thenTheOutputLineShouldBe("X X X X X X X X X X")
        .thenTheScoreShouldBe(260);
  }

  @Test
  void givenABowlingAreaWhenIDoAllStrikesThenTheScoreShouldBe() {
    BowlingScenario bowlingScenario = new BowlingScenario();
    bowlingScenario.givenABowlingArea()
        .whenIStartAGame()
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .whenIDownPins(10)
        .thenTheTurnShouldBe(new BowlingLine(new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0),
                                             new BowlingTurn(10, 0)))
        .thenTheOutputLineShouldBe("X X X X X X X X X X X X")
        .thenTheScoreShouldBe(300);
  }
}
