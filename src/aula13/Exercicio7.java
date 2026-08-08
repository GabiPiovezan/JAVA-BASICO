package aula13;

import java.util.Scanner;

public class Exercicio7 {
        public static void main(String []args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe a aresta vertical do quadrado: ");
            double a = scanner.nextDouble();
            System.out.println("Informe a aresta horizontal do quadrado: ");
            double b = scanner.nextDouble();
            double area = a * b;
            double dobroarea = area * area;
            System.out.println("A área é: " + dobroarea + " uc²");
        }
}
