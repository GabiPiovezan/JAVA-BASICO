package aula17;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---Gerador de Tabuada---");
        System.out.println("Tabuadas dispiníveis: 1 ao 10.");
        System.out.println("Escolha qual a tabuada quer gerar: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
