package aula15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Informe o número do segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Informe o número do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        System.out.println("Isso é um triângulo: ");

        if (lado1 + lado2 >lado3){
            System.out.println("Normal");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Isóseles");
        } else if (lado1 != lado2 && lado3 != lado1) {
            System.out.println("Escaleno");
        }
    }
}
