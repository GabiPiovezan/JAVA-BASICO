package aula17;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número base: ");
        int numB = scanner.nextInt();
        System.out.println("Digite o número expoênte: ");
        int numEx = scanner.nextInt();
        int resultado = 1;
        for (int i = 0; i < numEx; i++) {
            resultado *= numB;
        }
        System.out.println(resultado);
    }
}
