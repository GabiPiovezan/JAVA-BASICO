package aula13;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite quanto você ganha por hora: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite o número de horas de trabalho: ");
        double horas = scanner.nextDouble();
        double porcentIR = 11.0;
        double porcentINSS = 8.0;
        double porcentSIND = 5.0;

        double bruto = salario * horas;
        double ir = (bruto * porcentIR)/100.0;
        double inss = (bruto * porcentINSS )/100.0;
        double sindicato = (bruto * porcentSIND) /100.0;

        System.out.println("O seu salário bruto é de: " + bruto + " R$");
        System.out.println("O seu salário liquido é de: " + salario + " R$");
        System.out.println("A contribuição para o Imposto é de: " + ir  + " R$");
        System.out.println("A contribuição para o INSS é de: " + inss + " R$");
        System.out.println("A contribuição para o sindicato é de: " + sindicato + " R$");

    }
}
