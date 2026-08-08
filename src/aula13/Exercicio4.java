package aula13;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        float nota1 = capturarnota(scanner, "primeira");
        float nota2 = capturarnota(scanner, "segunda");
        float nota3 = capturarnota(scanner, "terceira");
        float nota4 = capturarnota(scanner, "quarta");

        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Sua média final é de: " + media);

    }
    static float capturarnota( Scanner scanner, String ordinal){
        System.out.println("Informe a " + ordinal + " nota");
        float nota = scanner.nextFloat();
        return nota;
    }
}
