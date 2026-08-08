package aula13;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos kg pesa o total de peixes pescados? ");
        double pesopeixes = scanner.nextDouble();
        if (pesopeixes <= 50){
            System.out.println("ZERO");
        } else if (pesopeixes >= 50) {
            double excesso = pesopeixes * 4.0;
            System.out.println("O total a pagar é de: " + excesso + " R$");
        }

    }
}
