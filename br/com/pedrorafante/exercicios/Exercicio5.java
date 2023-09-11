package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    /*
    Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um
    usuário, calcule a quantidade de salários mínimos que esse usuário ganha e
    imprima o resultado. (1SM=R$788,00)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do salario minino:");
        float salarioMinimo = in.nextFloat();
        System.out.println("Informe o valor do salario do usuário:");
        float salarioUsuario = in.nextFloat();

        float qtdSalarios = salarioUsuario/salarioMinimo;

        System.out.println("A quantidade de salario que o usuario ganha referente ao salario minimo é:" + qtdSalarios);
    }
}
