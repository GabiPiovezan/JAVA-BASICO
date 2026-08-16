package aula15;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---Caixa eletrônico---");
        System.out.println("--Faça seu saque--");
        System.out.println("-Notas disponiveis: 1, 5, 10, 50 e 100 reais.");
        System.out.println("Informe o valor desejado: ");
        double valor = scanner.nextDouble();

        if (valor == 256.00){
            System.out.println("Serâo utilizadas duas notas de 100, uma de 50, uma de 5 e uma moeda de 1");

        } else if (valor == 399.00) {
            System.out.println("Serâo utilizadas três notas de 100, uma de 50, quatro de 10, uma de 5 e quatro moedas de 1");

        }

    }
}
