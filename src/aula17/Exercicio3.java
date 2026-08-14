package aula17;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String nome ;
        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            if (nome.trim().length() <= 3){
                System.out.println("ERRO: O nome precisa ter mais de três caracteres!");
            }
        }while (nome.trim().length() <= 3);

        int idade;
        do {
            System.out.println("Digite a sua idade: ");
            idade = scanner.nextInt();

            if (idade < 0 || idade > 150){
                System.out.println("ERRO: a idade precisa ser maior que 0 e menor que 150.");
            }
        }while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.println("Digite seu salário: ");
            salario = scanner.nextDouble();

            if (salario <= 0){
                System.out.println("ERRO: O slario não pode ser igual a zero.");
            }
        }while (salario <= 0);

        char sexo;
        do {
            System.out.println("Digite o seu sexo(m ou f): ");
            sexo = scanner.next().toLowerCase().charAt(0);

            if (sexo != 'f' && sexo != 'm'){
                System.out.println("ERRO: sexo inválido, digite algo valido!");
            }
        }while(sexo != 'f' && sexo != 'm');

        char estadoCivil;
        do {
            System.out.println("Digite seu estado Civil: ");
            estadoCivil = scanner.next().toLowerCase().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
                System.out.println("ERRO: O estado civil deve conter (s, c, v ou d).");
            }
        }while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civíl: " + estadoCivil);
        }

    }

