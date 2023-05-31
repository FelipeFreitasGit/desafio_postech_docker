package com.linguagens.service

import com.linguagens.model.LinguagemModel

interface LinguagemService {

    fun getLinguagens(): List<LinguagemModel>
}