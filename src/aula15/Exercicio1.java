package aula15;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double maior = Math.max(num1,num2);
        System.out.println("O  maior número é:  " + maior);
        /*float maiornumero;
        if (num1 > num2){
        maiorNumero = num1;
        }
        sout basico
         */
    }
}
