package aula15;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número( positivo ou negativo): ");
        double num = scanner.nextDouble();

        String resultado = (num >0) ? "Positivo" : "Negativo";
        System.out.println("O número é: " + resultado);
    }
}
