package com.example.demo.controller

import com.example.demo.service.SimpleService
import com.example.demo.ResponseModel
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class SimpleController(
    private val simpleService: SimpleService
) {

    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun get(): ResponseModel {
        return simpleService.getData(1, "Micronaut demo")
    }
}
