package aula13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celcios? ");
        double celcios = scanner.nextDouble();
        double farenheit = (celcios * 9/5) + 32;
        System.out.println("A temperatura é " + farenheit + " ºf");

    }
}
