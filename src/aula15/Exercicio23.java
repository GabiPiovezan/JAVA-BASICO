package aula15;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = scanner.nextDouble();
        double form = Math.round(numero);

        System.out.println("O numero escolhido é: " + form);
    }
}
