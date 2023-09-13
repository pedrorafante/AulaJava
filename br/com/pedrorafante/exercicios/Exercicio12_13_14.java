package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio12_13_14 {

    /*
        12. Leia a idade de 20 pessoas e exiba a soma das idades.
        13. Leia a idade de 20 pessoas e exiba a média das idades.
        14. Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a idade de 20 pessoas: ");
        int idade = 0;
        int soma = 0;
        int qtdMaioresIdade = 0;
        for (int i = 0; i < 20; i++) {
            idade = in.nextInt();
            soma += idade;
            if (idade >= 18) {
                qtdMaioresIdade++;
            }
        }
        float media = soma / 20;

        System.out.println("A soma das idades " + soma);
        System.out.println("A média das idades " + media);
        System.out.println("A quantidade maiores de idade " + qtdMaioresIdade);
    }
}
