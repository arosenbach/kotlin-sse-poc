package com.example.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.integration.dsl.MessageChannels
import org.springframework.messaging.SubscribableChannel


@Configuration
class Configuration {

    @Bean
    fun jobDataChannel(): SubscribableChannel {
        return MessageChannels.publishSubscribe().getObject()
    }

}