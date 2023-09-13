package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    /*
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
    e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês
    com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a sua idade ( Ano, mes, dias)");
        int ano = in.nextInt(); //365 dias
        int mes = in.nextInt(); // 30 dias
        int dias = in.nextInt();

        int quantidadeDias = (ano * 365) + (mes * 30) + dias;
        System.out.println("A quantidade de dia é " + quantidadeDias + "dias!");

        in.close();
    }
}
