package aula15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota parcial: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota parcial: ");
        double nota2 = scanner.nextDouble();
        double media = nota1 + nota2/2;
        if (media == 10.00){
            System.out.println("Você tirou A, Aprovado!");
        } else if (media >= 9.0) {
            System.out.println("Você tirou B, Aprovado!");
        } else if (media > 7.5 && media < 8.99) {
            System.out.println("Você tirou C, Aprovado!");
        } else if (media > 6.0 && media < 7.5) {
            System.out.println("Você tirou D, Reprovado!");
        } else if (media >4.0 && media <6.0) {
            System.out.println("Você tirou E, Reprovado!");
        } else if (media > 0 && media < 4.0) {
            System.out.println("Você tirou F, Reprovado!");
        }
    }
}
