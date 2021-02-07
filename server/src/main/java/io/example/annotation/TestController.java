package io.example.annotation;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/rest")
public class TestController {

    @Get("/")
    String get() {
        return "hello";
    }

}
