package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio10 {

    /*
    Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite a quantidade de vezes para exibir: ");
        int i = in.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.println(nome);
        }

    }
}
