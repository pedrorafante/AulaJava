package br.com.pedrorafante.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio22 {

    /*
        Implemente um jogo de adivinhação em que o computador escolhe um número
        aleatório e o jogador tenta adivinhá-lo. Use um loop do-while.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAle = new Random().nextInt();
        int num = 0;
        do {
            System.out.println("Digite um número:");
            num = in.nextInt();

            if (num != numAle) {
                System.err.println("ERROUUUU - Tente novamente");
            }

        } while (numAle != num);

        System.out.println("ACERTOUUUU");
    }
}
