package aula13;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double metros = scanner.nextDouble();
        double qtlitros = metros/3;
        double qtlata = qtlitros/18;
        double preco = (qtlata * 80)/18;

        System.out.println("Sera preciso: " + qtlitros + " litros de tinta");
        System.out.println("Será utilizado: " + qtlata + " latas de tinta de 18L");
        System.out.println("O preço será de: " + preco + " R$");

    }
}
