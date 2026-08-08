package aula13;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a metragem: ");
        double metros = scanner.nextDouble();
        double convercao = metros * 100;
        System.out.println("Isso equivale á : " + convercao + " cm");
    }
}
