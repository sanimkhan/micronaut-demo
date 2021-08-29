package com.example.demo.controller

import com.example.demo.service.SimpleService
import com.example.demo.ResponseModel
import com.example.demo.advice.NotNull
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller("/advice")
open class AdviceController(
    private val simpleService: SimpleService,
) {

    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun get(
        @QueryValue
        name: String?
    ): ResponseModel {
        return simpleService.getData(1, getMessage(name))
    }

    @NotNull
    open fun getMessage(taskName: String?): String {
        return "Micronaut demo by $taskName"
    }
}
