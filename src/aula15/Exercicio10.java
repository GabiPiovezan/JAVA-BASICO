package aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o turno em que estuda(M,V ou N): ");
        String letra = scanner.nextLine();

        String resultado = letra.equalsIgnoreCase("M") ? "Bom dia!"
                         : letra.equalsIgnoreCase("V") ? "Boa tarde!"
                         : letra.equalsIgnoreCase("N") ? "Boa noite!"
                         : "Letra inválida";
        System.out.println(resultado);
    }
}
