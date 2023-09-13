package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio15 {

    /*  15. Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeMaisNova = "";
        int idadeMenor = -1;
        String nome = "";
        int idade = 0;
        System.out.println("Digite o nome e a idade de 10 pessoas: ");
        for (int i = 0; i < 10; i++) {
            nome = in.nextLine();
            idade = in.nextInt();
            in.nextLine();
            if (idadeMenor == -1) {
                idadeMenor = idade;
                nomeMaisNova = nome;
            }

            if (idade <= idadeMenor) {
                idadeMenor = idade;
                nomeMaisNova = nome;
            }
        }

        System.out.println(nomeMaisNova);
    }
}
