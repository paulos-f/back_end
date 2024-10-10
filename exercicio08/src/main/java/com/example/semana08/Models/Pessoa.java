package com.example.semana08.Models;

import org.springframework.stereotype.Component;

@Component
public class Pessoa {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
