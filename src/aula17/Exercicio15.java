package aula17;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos: ");
        int qtd = scanner.nextInt();

        long primeiro = 0;
        long segundo = 1;

        System.out.println("Série de Fibonacci até o " + qtd + " º termo:");

        for (int i = 1; i <= qtd ; i++) {
            System.out.println(primeiro + " ");
            long proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

        }
    }
}
