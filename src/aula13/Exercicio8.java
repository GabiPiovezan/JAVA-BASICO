package aula13;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salario = scanner.nextDouble();
        System.out.println("Quantas horas você trabalha por dia? ");
        double hora = scanner.nextDouble();
        double total = salario * hora * 22;
        System.out.println("Você ganha " + total + " R$" + " por mês!");

    }
}
