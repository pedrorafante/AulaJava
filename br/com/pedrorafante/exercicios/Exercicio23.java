package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio23 {

    /*
    Crie um programa que imprima a sequência de Fibonacci até um número específico de termos inserido pelo usuário.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de sequencia Fibonacci:");
        int qtd = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        System.out.print("| ");
        for (int i = qtd; i > 0; i--) {
            System.out.print(+num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.print(" |");
        //0 1 1 2 3 5 8 13

    }
}
