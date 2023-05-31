package com.linguagens.model

import javax.persistence.*

@Entity(name = "linguagem")
data class LinguagemModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    val nome: String
)