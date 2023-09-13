package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    /*
    Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 10 numeros: ");
        int i = 0, soma = 0, num = 0;
        do {
            num = in.nextInt();
            soma += num;
            i++;
        } while (i < 10);
        System.out.println("Soma é " + soma);
    }
}
