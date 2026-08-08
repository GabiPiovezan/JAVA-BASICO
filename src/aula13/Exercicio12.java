package aula13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma altura: ");
        double altura = scanner.nextDouble();
        double peso = (72.7 * altura) -58;
        System.out.println("Para a altura informada, o peso ideal é: " + peso + " kg");

    }
}
