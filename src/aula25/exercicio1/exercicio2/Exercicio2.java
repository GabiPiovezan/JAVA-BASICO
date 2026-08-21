package aula25.exercicio1.exercicio2;

public class Exercicio2 {
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente();
        conta1.numero = "1234";
        conta1.saldo = 4500;
        conta1.limite = 10000;
        conta1.especial = true;

        ContaCorrente conta2 = new ContaCorrente();
        conta2.numero = "1234";
        conta2.saldo = 4500;
        conta2.limite = 10000;
        conta2.especial = true;

        conta1. exibir();
        conta2.exibir();


        }
    }

