package com.paulo.exercicio12.mapper;

import com.paulo.exercicio12.dto.ContaDTO;
import com.paulo.exercicio12.model.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getNome());
    }
}
