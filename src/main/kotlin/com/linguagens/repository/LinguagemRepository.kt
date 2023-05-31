package com.linguagens.repository

import com.linguagens.model.LinguagemModel
import org.springframework.data.repository.CrudRepository

interface LinguagemRepository : CrudRepository<LinguagemModel, Int> {
}