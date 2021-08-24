package com.example.demo.client

import com.example.demo.service.SimpleService
import com.example.demo.ResponseModel
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/d-client")
class DecClientController(
    private val userClient: UserClient
) {

    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun get(): List<Any> {
        return userClient.getUsers()
    }
}
