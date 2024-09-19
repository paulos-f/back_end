package com.example.exercicio07.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendacaoFilmeController {

    @GetMapping("/recomendar")
    public String recomendarFilme(@RequestParam String genero, @RequestParam String ambiente) {
        // Lógica para retornar uma recomendação com base no gênero e ambiente
        if (genero.equalsIgnoreCase("acao") && ambiente.equalsIgnoreCase("futurista")) {
            return "Homens de Preto";
        } else if (genero.equalsIgnoreCase("drama") && ambiente.equalsIgnoreCase("futurista")) {
            return "Arrival";
        } else if (genero.equalsIgnoreCase("comedia") && ambiente.equalsIgnoreCase("medieval")) {
            return "Shrek";
        } else if (genero.equalsIgnoreCase("drama") && ambiente.equalsIgnoreCase("medieval")) {
            return "Gladiador";
        } else {
            return "Nenhuma recomendação encontrada para esses parâmetros.";
        }
    }
}
