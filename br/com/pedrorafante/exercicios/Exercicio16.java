package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio16 {
    /*  16. Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero");
        int num = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }

    }
}
