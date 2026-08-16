package aula15;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int contadorSim = 0;
        System.out.println("--Interrogatório--");
        System.out.println("Responda as perguntas com 's' para sim, e 'n' para não.");
        System.out.println("Telefonou para a vitima?");
        if (scanner.next().equalsIgnoreCase("s")){
            contadorSim++;
        }
        System.out.println("Esteve no local do crime?");
        if (scanner.next().equalsIgnoreCase("s")){
            contadorSim++;
        }
        System.out.println("Mora perto da vitima?");
        if  (scanner.next().equalsIgnoreCase("s")){
            contadorSim++;
        }
        System.out.println("Devia para a vitima?");
        if (scanner.next().equalsIgnoreCase("s")){
            contadorSim++;
        }
        System.out.println("Já trabalhou com a vitima?");
        if (scanner.next().equalsIgnoreCase("s")){
            contadorSim++;
        }

        System.out.println("--Resultado da Investigação--");

        if (contadorSim == 5){
            System.out.println("Classificação: ASSASSINO");
        } else if (contadorSim == 3 || contadorSim ==4) {
            System.out.println("Classificação: CÚMPLICE");
        } else if (contadorSim == 2 ) {
            System.out.println("Classificação: SUSPEITA");
        } else {
            System.out.println("Classificação: INOCENTE");
        }
    }
}
