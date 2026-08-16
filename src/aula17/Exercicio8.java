package aula17;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double num3 = scanner.nextDouble();
        System.out.println("Informe o quarto número: ");
        double num4 = scanner.nextDouble();
        System.out.println("Informe o quinto número: ");
        double num5 = scanner.nextDouble();
        double soma = num1 + num2 + num3 + num4 +num5;
        double media = (num1 + num2 + num3 + num4 +num5)/ 5;

        System.out.println( "A soma é: " + soma + ", a média é: " + media);
    }

}
