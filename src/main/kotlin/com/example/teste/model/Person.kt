package com.example.teste.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Person(
    @Id
    val id: String,
    val name: String,
    val lastName: String,
    val age: Int,
    val cep: String,
    val cpfOrCnpj: String,
    val email: String
)
