package aula17;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de Usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Digite a sua senha: ");
        String senhaUsuario = scanner.nextLine();

        if (nomeUsuario.equals(senhaUsuario)){
            System.out.println("Erro: A senha e o nome de usuário não podem ser iguais.");
        } else {
            System.out.println("Cadastro Aprovado!");
        }
    }
}
