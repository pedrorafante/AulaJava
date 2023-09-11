package br.com.pedrorafante.exercicios;

public class Exercicio2 {

    /*
    Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média
    dos números 4, 5 e 6. A soma das duas médias. A média das médias.
     */
    public static void main(String[] args) {
        float media1 = (8 + 9 + 7)/3;
        float media2 = (4 + 5 + 6)/3;
        float soma = media2 + media1;
        float media3 = soma/2;

        System.out.println("Media 1: " + media1);
        System.out.println("Media 2: " + media2);
        System.out.println("Soma das medias: " + soma);
        System.out.println("Media 3: " + media3);
    }
}
