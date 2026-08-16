package aula17;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10: ");
        double nota = scanner.nextDouble();

        if (nota >= 0 && nota <= 10){
            System.out.println("Sua nota é: " + nota + " , uma nota Valida!");
        } else {
            System.out.println("Essa nota é Inválida!");
        }

        /*while(nota < 0 || nota > 10){
            System.out.println("Nota inválida, tente novamente!");
            nota = scanner.nextDouble();
        }*/
    }
}
