package com.example.demo.advice

import io.micronaut.aop.InterceptorBean
import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import java.util.Objects
import jakarta.inject.Singleton

@Singleton
@InterceptorBean(NotNull::class)
class NotNullInterceptor : MethodInterceptor<Any, Any> {
    override fun intercept(context: MethodInvocationContext<Any, Any>): Any? {
        val nullParam = context.parameters
            .entries
            .stream()
            .filter { entry ->
                val argumentValue = entry.value
                Objects.isNull(argumentValue.value)
            }
            .findFirst()
        return if (nullParam.isPresent) {
            throw IllegalArgumentException("Null parameter [${nullParam.get().key}] not allowed")
        } else {
            context.proceed()
        }
    }
}
