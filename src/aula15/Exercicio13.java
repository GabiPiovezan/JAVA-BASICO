package aula15;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um dia da semana: ");
        System.out.println("1-Domingo");
        System.out.println("2-Segunda-feira");
        System.out.println("3-Terça-feira");
        System.out.println("4-Quarta-feira");
        System.out.println("5-Quinta-feira");
        System.out.println("6-Sexta-feira");
        System.out.println("7-Sábado");
        int numero = scanner.nextInt();

        switch (numero = 7){
            case 1:
                System.out.println("Hoje é Domingo!");
                break;
            case 2:
                System.out.println("Hoje é Segunda-feira!");
                break;
            case 3:
                System.out.println("Hoje é Terça-feira!");
                break;
            case 4:
                System.out.println("Hoje é Quarta-feira!");
                break;
            case 5:
                System.out.println("Hoje é Quinta-feira!");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira!");
                break;
            case 7:
                System.out.println("Hoje é Sábado!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
