package aula17;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a = 80000;
        double b = 200000;
        double cresA = 0.03;
        double cresB = 0.015;
        int anos = 0;

        while (a < b){
            a += a * cresA;
            b += b * cresB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a B.");
        System.out.println("População final do país A: " + (int) a + " habitantes");
        System.out.println("População do país B: " + (int) b + " habitantes");
    }
}
