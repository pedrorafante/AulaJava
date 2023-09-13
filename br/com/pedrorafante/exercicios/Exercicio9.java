package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    /*
    Leia o nome do usuário e escreva o nome dele na tela 10 vezes
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        int i = 0;
        while (i < 10) {
            System.out.println(nome);
            i++;
        }
    }
}
