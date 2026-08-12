package aula15;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double num3 = scanner.nextDouble();

        double maior = Math.max(num1,Math.max(num2,num3));
        double menor = Math.min(num1, Math.min(num2, num3));

        System.out.println("O maior número é: " +maior + " e o menor é: " + menor);
    }
}
