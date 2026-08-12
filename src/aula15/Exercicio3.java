package aula15;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra(M ou F): ");
        String letra = scanner.nextLine();

        String resultado = letra.equalsIgnoreCase("M") ? "M-Masculino"
                         : letra.equalsIgnoreCase("F") ? "F-Feminino"
                         : "Inválido!";
        System.out.println("A letra escolhida é: " + resultado);
    }
}
