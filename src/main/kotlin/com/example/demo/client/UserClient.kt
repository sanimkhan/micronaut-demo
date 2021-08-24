package com.example.demo.client

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client(id = "https://6125402e07ac87001795b7ef.mockapi.io")
interface UserClient {
    @Get(
        value = "/users",
        consumes = [MediaType.APPLICATION_JSON],
        produces = [MediaType.APPLICATION_JSON]
    )
    fun getUsers(
//        @Header("api")
//        api: String,
//        @QueryValue("include")
//        include: String? = "country_areas"
    ): List<Any>
}
