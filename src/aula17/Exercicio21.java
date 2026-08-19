package aula17;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de números primos");
        System.out.println("Informe um número: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("ERRO: números negativos não podem ser primos!");
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("ERRO: Esse número NÃO é primo!");
            } else {
                System.out.println("Esse número é primo!");
            }
        }

    }
}
