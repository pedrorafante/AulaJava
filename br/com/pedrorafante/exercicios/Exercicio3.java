package br.com.pedrorafante.exercicios;

public class Exercicio3 {

    /*
    Informar um saldo e imprimir o saldo com reajuste de 1%.

     */
    public static void main(String[] args) {
        float saldo = (int) Math.round(Math.round(10)*100);
        saldo = (float) (saldo + (saldo*0.01));
        System.out.println(saldo);
    }
}
