package aula15;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();

        System.out.println("Informe o preço do sengundo produto: ");
        double preco2 = scanner.nextDouble();

        System.out.println("Informe o preço do terceiro produto: ");
        double preco3 = scanner.nextDouble();

        double menor = Math.min(preco1, Math.min(preco2,preco3));

        System.out.println("O melhor preço é de: " + menor);
    }
}
