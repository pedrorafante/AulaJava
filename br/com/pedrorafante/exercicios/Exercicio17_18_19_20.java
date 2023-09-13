package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio17_18_19_20 {
    /*        17. Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.
              18. Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares
              19. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
              20. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int quantidade = 0;
        int quantidadePares = 0;
        int quantidade0e100 = 0;
        int quantidade101e200 = 0;
        int quantidadeAcima200 = 0;
        for (int i = 0; i < 20; i++) {
            num = in.nextInt();
            if (num > 8) {
                quantidade++;
            }
            if (num % 2 == 0) {
                quantidadePares++;
            }
            if (num >= 0 && num <= 100) {
                quantidade0e100++;
            } else if (num > 100 && num <= 200) {
                quantidade101e200++;
            } else if (num > 200) {
                quantidadeAcima200++;
            }
        }
    }
}
