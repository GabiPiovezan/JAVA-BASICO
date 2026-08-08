package aula13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o sexo(m ou f): ");
        String sexo = scanner.nextLine();

        if (sexo.equalsIgnoreCase("m")){
            double peso1 = (72.7 * altura) - 58;
            System.out.println("Informe seu peso atual: ");
            double peso = scanner.nextDouble();
            System.out.println("Seu peso é de : " + peso + " kg" );
            System.out.println("O seu peso ideal é de: " + peso1 + " kg");

        } else if (sexo.equalsIgnoreCase("f")) {
            double peso2 = (62.1 * altura) - 44.7;
            System.out.println("Informe seu peso atual: ");
            double peso = scanner.nextDouble();
            System.out.println("Seu peso é de : " + peso + " kg" );
            System.out.println("Seu peso ideal é de : " + peso2 + " kg");
        }

    }
}
