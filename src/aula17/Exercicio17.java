package aula17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para ser fatorado: ");
        int numero = scanner.nextInt();
        long resultado = 1;

        for (int i = 1; i <= numero ; i++) {
            resultado *= i;
        }
        System.out.println("O fatorial é: " + resultado);
    }
}
