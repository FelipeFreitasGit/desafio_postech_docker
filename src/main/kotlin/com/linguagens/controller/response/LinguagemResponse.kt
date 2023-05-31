package com.linguagens.controller.response

import com.linguagens.model.LinguagemModel

data class LinguagemResponse (
    var nome: String
)

fun LinguagemModel.toResponse(): LinguagemResponse {
    return LinguagemResponse(
        nome = this.nome
    )
}