package aula17;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("-Digite cinco números-");
        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Terceiro número: ");
        int num3 = scanner.nextInt();
        System.out.println("Quarto número: ");
        int num4 = scanner.nextInt();
        System.out.println("Quinto número: ");
        int num5 = scanner.nextInt();

        int numeromaior = Math.max(num1,Math.max(num2,Math.max(num3,Math.max(num4,num5))));
        System.out.println("O maior numero é: " + numeromaior);
    }
}
