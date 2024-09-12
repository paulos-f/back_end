package org.example;

public class PortoGrande extends BasePorto{

    @Override
    public void atracarBarco (Barco barco){
        if (barco.tamanho > 10){
            super.atracarBarco(barco);
        }else {
            System.out.println(barco.nome + " não pode atracar no " + nome + " (tamanho menor que 10)");
        }

    }
}
