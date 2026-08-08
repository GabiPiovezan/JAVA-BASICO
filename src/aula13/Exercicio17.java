package aula13;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho em metros quadrados da área a ser pintada: ");
        double metros = scanner.nextDouble();
        double qtlitros = metros/6;
        double qtlatas = qtlitros/18;
        double preco = (qtlatas * 80)/18;
        double qtlatas2 = qtlitros/3.6;
        double preco2 = (qtlatas2 * 25)/3.6;

        System.out.println("Será nescessário " + qtlitros + " litros de tinta");
        System.out.println("Para latas de 18 litros é nescessário: " + qtlatas + " latas de tinta");
        System.out.println("Para latas de 3,6 litros é nescessário: " + qtlatas2 + " latas de tinta");
        System.out.println(qtlatas+ " latas de 18 litros,custam " + preco + " R$");
        System.out.println(qtlatas2+ " latas de 3,6 litros,custam " + preco2 + " R$");

    }
}
