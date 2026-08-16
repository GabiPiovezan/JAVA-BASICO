package aula15;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua primeira nota parcial: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe sua segunda nota parcial: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Informe sua terceira nota parcial: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

         if (media >= 7.0){
             System.out.println("Sua média é de: " + media + ", você foi Aprovado!");
         } else if (media == 10.0) {
             System.out.println("Sua média é de: " + media +", você foi Aprovado com Distinção! ");
         }else {
             System.out.println( "Sua média é de: "+ media + "Você foi reprovado!");
         }
    }
}
