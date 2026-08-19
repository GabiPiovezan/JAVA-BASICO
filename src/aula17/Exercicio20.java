package aula17;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para ser fatorado: ");
        int numero = scanner.nextInt();
        long resultado = 1;

        for (int i = 1; i <= numero ; i++) {
            resultado *= i;

            if (numero < 16){
                System.out.println("ERRO: o total de fatoramento não pode ultrapassar 16.");
            }else {
                System.out.println("Número fatorado com SUCESSO!");
            }
        }
        System.out.println("O fatorial é: " + resultado);
    }
}
