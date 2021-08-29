package com.example.demo.scheduler

import com.example.demo.ResponseModel
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.TaskScheduler
import io.micronaut.scheduling.annotation.Scheduled
import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import java.util.concurrent.Callable

@Singleton
class ProgJob {

    @Inject
    @Named(TaskExecutors.SCHEDULED)
    lateinit var taskScheduler: TaskScheduler

    fun createJob() {
        taskScheduler.schedule("1s", Callable { doSomething() })
    }

    private fun doSomething() {
        TODO("Not yet implemented")
    }
}