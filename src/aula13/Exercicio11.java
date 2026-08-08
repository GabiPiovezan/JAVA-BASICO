package aula13;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite um numero real: ");
        double real = scanner.nextDouble();
        double a = (num1 + num1) * (num2/2);
        double b = (num1 * 3) + real;
        double c = Math.pow(real, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
