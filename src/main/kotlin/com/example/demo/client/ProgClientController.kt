package com.example.demo.client

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.HttpClient
import org.reactivestreams.Publisher

@Controller("/p-client")
class ProgClientController(
    private val httpClient: HttpClient
) {

    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun get(): Publisher<String>? {
        return httpClient.retrieve("https://6125402e07ac87001795b7ef.mockapi.io/users")
    }
}
