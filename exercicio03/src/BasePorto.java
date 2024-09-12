package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    String nome;
    List<Barco> barcosAtracados = new ArrayList<>();


    public void atracarBarco (Barco barco){
        barcosAtracados.add(barco);
        System.out.println(barco.nome + " atracado no " + nome);
    }

    public void desatracarBarco (Barco barco){
        barcosAtracados.remove(barco);
        System.out.println(barco.nome + " desatracou do " + nome);
    }
}
