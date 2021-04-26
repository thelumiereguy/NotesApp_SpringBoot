package com.thelumiereguy.notesapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotesappApplication

fun main(args: Array<String>) {
    runApplication<NotesappApplication>(*args)
}
