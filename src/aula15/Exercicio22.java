package aula15;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---Verificador de números---");
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Este número é um PAR!");
        }else{
            System.out.println("Esse número é um IMPAR!");
        }
    }
}
