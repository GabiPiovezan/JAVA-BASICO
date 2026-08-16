package aula15;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("--Menu de operações--");
        System.out.println("1-Soma");
        System.out.println("2-Divisão");
        System.out.println("3-Multiplicação");
        int opcao = scanner.nextInt();

        double soma = num1 + num2;
        double div = num1 / num2;
        double mult = num1 * num2;


        switch (opcao){
            case 1:
                System.out.println("O resultado da operação é de: "+soma);
                break;
            case 2:
                System.out.println("O resultado da operação é de: "+div);
                break;
            case 3:
                System.out.println("O resultado da operação é de: "+mult);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }

    }
}
