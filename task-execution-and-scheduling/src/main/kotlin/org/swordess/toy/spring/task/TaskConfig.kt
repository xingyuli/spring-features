package org.swordess.toy.spring.task

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.scheduling.annotation.SchedulingConfigurer
import org.springframework.scheduling.config.ScheduledTaskRegistrar
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

@Configuration
@EnableScheduling
open class TaskConfig : SchedulingConfigurer {

    private val counter = AtomicInteger()

    override fun configureTasks(taskRegistrar: ScheduledTaskRegistrar) {
        taskRegistrar.setScheduler(taskScheduler())
    }

    @Scheduled(fixedDelay = 1000)
    fun workA() {
        val taskNum = counter.incrementAndGet()
        for (round in 1..5) {
            println("Thread(name=${Thread.currentThread().name}) Task#$taskNum round#$round - working on ${myBean()}")
            Thread.sleep(400)
        }
    }

    @Scheduled(fixedDelay = 1000)
    fun workB() {
        val taskNum = counter.incrementAndGet()
        for (round in 1..5) {
            println("Thread(name=${Thread.currentThread().name}) Task#$taskNum round#$round - working on ${myBean()}")
            Thread.sleep(400)
        }
    }

    @Bean(destroyMethod = "shutdown")
    open fun taskScheduler(): Executor = Executors.newScheduledThreadPool(4)

    @Bean
    open fun myBean() = Object()

}

fun main(args: Array<String>) {
    ClassPathXmlApplicationContext("task-scheduling.xml")
}