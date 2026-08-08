package aula13;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo (em MB): ");
        double mb = scanner.nextDouble();
        System.out.println("Informe a velocidade do link da internet: ");
        double mbps = scanner.nextDouble();
        double velocidade = mb * 8;
        System.out.println("O seu arquivo de: " + mb + " MB " + " rodará em uma velocidade de : " + velocidade + " segundos");
    }
}
