package aula15;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota parcial: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota parcial: ");
        double nota2 = scanner.nextDouble();

        double media = nota1 + nota2/2;

        if(media >= 7.0){
            System.out.println("Aprovado!");
        } else if (media ==10) {
            System.out.println("Aprovado com Distinção!");
        }else {
        System.out.println("Reprovado!");
        }
        System.out.println(" você foi: ");
    }
}
