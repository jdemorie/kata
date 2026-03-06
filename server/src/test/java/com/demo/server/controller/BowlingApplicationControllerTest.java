package com.demo.server.controller;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
public class BowlingApplicationControllerTest {
  @Inject
  EmbeddedApplication<?> application;
  @Inject
  @Client("/")
  HttpClient client;

  @Test
  void givenABowlingAreaWhenIStartGameThenTheScoreShouldBe() {
    BowlingApplicationScenario scenario = new BowlingApplicationScenario(client, application);
    scenario.givenABowlingServer()
        .whenIStartGame("John")
        .thenTheScoreShouldBe("[{\"score\":0}]");
  }
}
