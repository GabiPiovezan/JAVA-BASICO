package aula24.exercicio1.exercicio5;

import aula24.exercicio1.exercicio4.EstoqueLivrodeBiblioteca;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente();
        conta1.titular = "Maria";
        conta1.agencia = "063";
        conta1.numero = "010";
        conta1.saldo = 3500;

        ContaCorrente conta2 = new ContaCorrente();
        conta2.titular = "José";
        conta2.agencia = "065";
        conta2.numero = "011";
        conta2.saldo = 6500;

        conta1.imprimir();
        conta2.imprimir();
    }
}
