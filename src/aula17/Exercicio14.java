package aula17;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String pares = "";
        String impares = "";

        for ( int i = 1; i <= 10; i++){
            System.out.println("Digite o " +i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0){
                pares += numero + " ";
            }else {
                impares += numero + " ";
            }
        }
        System.out.println("===Resultado===");
        System.out.println("Pares: " + (pares.isEmpty() ? "Nenhum" : pares));
        System.out.println("Impares: " + (impares.isEmpty() ? "Nenhum" : impares));
    }

}
