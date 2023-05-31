package com.linguagens.service.impl

import com.linguagens.model.LinguagemModel
import com.linguagens.repository.LinguagemRepository
import com.linguagens.service.LinguagemService
import org.springframework.stereotype.Service

@Service
class LinguagemServiceImpl(
    private val linguagemRepository: LinguagemRepository
): LinguagemService {

    override fun getLinguagens(): List<LinguagemModel> {
        return linguagemRepository.findAll().toList()
    }
}