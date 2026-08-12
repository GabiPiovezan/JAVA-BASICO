package aula15;

import java.util.Scanner;
import java.time.Year;
public class Exercicio17 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        int ano = scanner.nextInt();

        if (Year.isLeap(ano)){
            System.out.println("O ano: " + ano + " é bissexto!");
        }else {
            System.out.println("O ano: " + ano + " NÂO é bissexto!");
        }
    }
}
