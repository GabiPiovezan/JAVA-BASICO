package aula17;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double populacaoA;
        double populacaoB;
        double cresA = 0.03;
        double cresB = 0.015;
        int anos = 0;

        do {
            System.out.println("Informe a quantidade de pessoas do primeiro país: ");
            populacaoA = scanner.nextDouble();
            System.out.println("Informe a quantidade de pessoas do segundo país: ");
            populacaoB = scanner.nextDouble();

            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * cresA;
                populacaoB += populacaoB * cresB;
                anos++;
            }
        }while (populacaoA < populacaoB);

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a B.");
        System.out.println("População final do país A: " + (int) populacaoA + " habitantes");
        System.out.println("População do país B: " + (int) populacaoB + " habitantes");
    }
}
