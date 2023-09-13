package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio21 {
    /*
    Escreva um algoritmo que leia uma sequência de números do usuário e realize a
    soma desses números. Encerre a execução quando um número negativo for
    digitado.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = 0;
        int soma = 0;
        do {
            num = in.nextInt();
            if (num > 0) {
                soma += num;
            }
        } while (num > 0);
        System.out.println("Soma: " + soma);
        System.out.println("FIM");
    }
}
