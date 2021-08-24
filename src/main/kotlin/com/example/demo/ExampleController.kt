package com.example.demo

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class ExampleController() {
    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun get(): ResponseModel {
        return ResponseModel(1, "Micronaut demo")
    }
}
