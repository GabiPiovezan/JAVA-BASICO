package aula24.exercicio1.exercicio5;

public class ContaCorrente {
    String titular;
    String numero;
    String agencia;
    double saldo;


    void imprimir(){
        System.out.println("===Dados da Conta-Corrente===");
        System.out.println("Titular: " + titular);
        System.out.println("Nº da Conta: " + numero);
        System.out.println("Nº da Agencia: " + agencia);
        System.out.println("Saldo: R$ " + saldo);
    }
}
