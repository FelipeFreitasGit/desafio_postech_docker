package com.linguagens.controller

import com.linguagens.controller.response.LinguagemResponse
import com.linguagens.controller.response.toResponse
import com.linguagens.service.LinguagemService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("linguagens")
class LinguagemController(
    private val linguagemService: LinguagemService,
) {

    @GetMapping
    fun getLinguagens(): List<LinguagemResponse> {
        return linguagemService.getLinguagens().map { it.toResponse() }
    }
}