package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio6 {
/*
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero inteiro:");
        int numero = in.nextInt();

        System.out.println("Antecessor: " + (numero-1));
        System.out.println("Sucessor: " + (numero+1));
    }
}
