package org.example;

public class PortoPequeno  extends  BasePorto{

    @Override
    public void atracarBarco(Barco barco){
        if (barco.tamanho <= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println(barco.nome + " não pode atracar no " + nome + " (tamanho maior que 10)");
        }
    }
}
