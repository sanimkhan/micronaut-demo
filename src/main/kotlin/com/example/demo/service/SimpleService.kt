package com.example.demo.service

import com.example.demo.ResponseModel
import io.micronaut.context.annotation.Primary
import jakarta.inject.Singleton

//@Primary
//@Requires(property = "enabled")
@Singleton
class SimpleService {
    fun getData(id: Int, message: String): ResponseModel {
        return ResponseModel(id, message)
    }

}
