package br.com.pedrorafante.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    /*
    Escrever um algoritmo que lê:
    - a porcentagem do IPI a ser acrescido no valor das peças OK
    - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 OK
    - o código da peça 2, valor unitário da peça 2, quantidade de peças 2. OK
    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do IPI");
        int valorIPI = in.nextInt();
        System.out.println("==== PEÇA 1 ====");
        System.out.println("Informe o codigo, quantidade e valor");
        int codigoPeca1 = in.nextInt();
        int qtdPeca1 = in.nextInt();
        float valorPeca1 = in.nextFloat();

        System.out.println("==== PEÇA 2 ====");
        System.out.println("Informe o codigo, quantidade e valor");
        int codigoPeca2 = in.nextInt();
        int qtdPeca2 = in.nextInt();
        float valorPeca2 = in.nextFloat();

        float valorTotal = ((valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2)) * (valorIPI / 100 + 1);

        System.out.println("O valor total é: " + valorTotal);

    }
}
