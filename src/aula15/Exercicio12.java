package aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salário por hora: ");
        double salario = scanner.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double hora = scanner.nextDouble();

        System.out.println("Seu salário atual sem descontos é de: " +salario);

        if (salario == 900.00){
            System.out.println("Você está isento de descontos!");
        } else if (salario <= 1500.00) {
             double desconto = salario - 0.5;
            System.out.println("Com desconto de 5%, seu salário atual é de: " + desconto);
        } else if (salario <= 2500.00) {
            double desconto = salario - 0.1;
            System.out.println("Com desconto de 10%, seu salário atual é de: " + desconto);
        } else if (salario >=2500.00) {
            double desconto = salario - 0.2;
            System.out.println("Com desconto de 20%, seu salário atual é de: " + desconto);
        }
    }
}
