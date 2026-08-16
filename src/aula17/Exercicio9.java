package aula17;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Gostaria de Imprimir os números impares?");
        System.out.println("Para imprimir apenas aperte 1");
        int numeroIM = scanner.nextInt();
        if (numeroIM % 2 != 0){
         for ( int i = 1; i < 51; i++){
             System.out.println(i);
         }
        }
    }
}
