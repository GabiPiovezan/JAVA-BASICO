package aula17;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        for (int i = inicio +1; i < fim; i++){
            System.out.println(i + " ");
        }

    }
}
