package aula17;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o ultimo número: ");
        int numF = scanner.nextInt();

        int maior = Math.max(numero1, Math.max(num2, numF));
        int menor = Math.min(numero1, Math.min(num2, numF));
        int soma = numero1 + num2 + numF;

        System.out.println("Dos números informados, o Maior é: " + maior );
        System.out.println("O menor número é: " + menor);
        System.out.println("A soma dos números é de: " + soma);

    }
}
