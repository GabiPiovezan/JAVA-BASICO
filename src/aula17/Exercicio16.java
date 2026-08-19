package aula17;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Demosntração da sequencia de Fibonacci");


        long primeiro = 0;
        long segundo = 1;

        System.out.println("Série de Fibonacci até o " + "500" + "º termo:");

        for (int i = 1; i <= 500; i++) {
            System.out.println(primeiro + " ");
            long proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

        }
    }
}
