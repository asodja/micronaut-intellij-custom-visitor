package io.example.annotation;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
class TestControllerTest {

    @Inject
    @Client("/rest")
    RxHttpClient client;

    @Test
    void shouldNotRun() {
        client.toBlocking().retrieve("/");
    }

}