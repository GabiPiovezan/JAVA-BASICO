package aula15;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("O coeficiente 'a' deve ser diferente de zero para uma equação do 2º grau.");
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais (delta negativo).");
            } else if (delta == 0) {
                double x1 = -b / (2 * a);
                System.out.printf("Delta é zero. Raiz única: %.4f\n", x1);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes reais: " + " x1= " + x1 + " e " + " x2= " + x2);
            }
        }
    }
}