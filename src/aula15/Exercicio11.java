package aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salário para o reajuste: ");
        double salario = scanner.nextDouble();



        if (salario <= 280.00){
            double aumento = salario * 0.2;
            System.out.println("O salário á receber é de:  " + aumento + " ,um aumento de 20%");
        } else if (salario >280.00 && salario < 700.00){
            double aumento = salario * 0.15;
            System.out.println("O salário á receber é de: " + aumento + " ,um aumento de 15%");
        } else if (salario >700.00 && salario <1500.00) {
            double aumento = salario * 0.1;
            double soma = aumento + salario;
            System.out.println("O salário á receber é de:  " +soma+ " ,um aumento de 10%");
        } else if (salario >= 1500.00) {
            double aumento = salario * 0.05;
            System.out.println("O salário á receber é de:  " + aumento + " ,um aumento de 5%");
        }
        System.out.println("Seu salário inicial era de: " + salario);
        //&&-> E
        //||-> ou



    }
}

