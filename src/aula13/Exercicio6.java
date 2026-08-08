package aula13;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o raio do circulo: ");
        double raio = scanner.nextDouble();
        double area = (Math.PI) * (raio * raio);
        System.out.println("A área é = " + area + " uc");

    }
}
