package com.example.demo.controller

import com.example.demo.service.SimpleService
import com.example.demo.ResponseModel
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@Controller("/inject")
class InjectController() {

    @Inject
    lateinit var simpleService: SimpleService

    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun get(): ResponseModel {
        return simpleService.getData(1, "Micronaut demo by @inject")
    }
}
