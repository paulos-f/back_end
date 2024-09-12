package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Barco barco1 = new Barco();
        barco1.nome = "Barco 1";
        barco1.tamanho = 2;

        Barco barco2 = new Barco();
        barco2.nome = "Barco 2";
        barco2.tamanho = 5;

        Barco barco3 = new Barco();
        barco3.nome = "Barco 3";
        barco3.tamanho = 7;

        Barco barco4 = new Barco();
        barco4.nome = "Barco 4";
        barco4.tamanho = 12;

        Barco barco5 = new Barco();
        barco5.nome = "Barco 5";
        barco5.tamanho = 20;

        PortoPequeno portoPequeno = new PortoPequeno();
        portoPequeno.nome = "Porto pequeno";

        PortoGrande portoGrande = new PortoGrande();
        portoGrande.nome = "Porto Grande";

        List<Barco> Barcos = List.of(barco1,barco2, barco3, barco4, barco5);

        for (Barco barco : Barcos){
            if (barco.tamanho <= 10){
                portoPequeno.atracarBarco(barco);
            }else {
                portoGrande.atracarBarco(barco);
            }
        }

    }
}