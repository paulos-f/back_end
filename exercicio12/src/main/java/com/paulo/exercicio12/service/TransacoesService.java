package com.paulo.exercicio12.service;

import com.paulo.exercicio12.model.Conta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {

    private List<Conta> contas = new ArrayList<>();

    public TransacoesService() {
        contas.add(new Conta().builder().nome("Fulano").codigo("500-1").build());
        contas.add(new Conta().builder().nome("Ciclano").codigo("320-2").build());
    }

    public Conta getContaByCodigo(String codigo) {
        return contas
                .stream()
                .filter( conta -> conta.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }

}
