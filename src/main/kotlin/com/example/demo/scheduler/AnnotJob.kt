package com.example.demo.scheduler

import io.micronaut.scheduling.annotation.Scheduled
import jakarta.inject.Singleton

@Singleton
class AnnotJob {

    @Scheduled(initialDelay = "1s", fixedDelay = "1m")
    //@Scheduled(cron = "0 15 10 ? * MON")
    internal fun oneSecAfterLastExecution() {
        println("Executing oneSecAfterLastExecution()")
    }
}