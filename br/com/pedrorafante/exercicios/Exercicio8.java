package br.com.pedrorafante.exercicios;

public class Exercicio8 {

    /*Escreva um algoritmo que calcule a soma dos números de 1 a 15. */
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        do {
            soma += i;
            i++;
        } while (i <= 15);

        System.out.println("A soma de 1 a 15 é: " + soma);
    }
}
