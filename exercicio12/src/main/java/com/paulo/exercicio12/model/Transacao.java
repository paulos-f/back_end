package com.paulo.exercicio12.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transacao {

    private Conta contaOrigem;
    private Conta contaDestino;
    private Double valor;

}
