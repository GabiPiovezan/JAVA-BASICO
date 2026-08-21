package aula25.exercicio1.exercicio2;

import java.util.Scanner;

public class ContaCorrente {
    String numero;
    double saldo;
    boolean especial;
    double limite;

    Scanner scanner = new Scanner(System.in);

    boolean realizarSaque(double valorSacar) {

        if (saldo >= valorSacar) {
            saldo -= valorSacar;
            return true;
        } else {
            if (especial) {
                double limiteTotal = saldo + limite;
                if (limiteTotal >= valorSacar) {
                    saldo -= valorSacar;
                    return true;
                }

            }
        }
        return false;

    }
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    void consultarSaldo(){
        System.out.println("O saldo atual é de: " + saldo);
    }

    boolean verificarEspecial(){
        return saldo < 0;
    }

    void exibir(){
        System.out.println("Conta número: " + numero);
        System.out.println("Verificando saldo.....");
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Verificando Especial....");
        System.out.println(verificarEspecial());
    }
}