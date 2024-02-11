package com.example.demo

import org.springframework.stereotype.Service
import kotlin.jvm.optionals.toList

@Service
class MessageService(val messageRepository: MessageRepository) {

    fun findMessages(): List<Message> = messageRepository.findAll().toList()

    fun findMessageById(id: String): List<Message> = messageRepository.findById(id).toList()

    fun save(message: Message) {
        messageRepository.save(message)
    }
}