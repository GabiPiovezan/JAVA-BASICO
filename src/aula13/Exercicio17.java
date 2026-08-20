package aula13;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho em metros quadrados da área a ser pintada: ");
        double metros = scanner.nextDouble();

        double qtlitros = metros/6;
        double qtlatas = Math.ceil(qtlitros/18);
        double preco = (qtlatas * 80)/18;
        double qtlatas2 = qtlitros/3.6;
        double preco2 = (qtlatas2 * 25)/3.6;

        System.out.println("Será nescessário " + qtlitros + " litros de tinta");
        System.out.println("Para latas de 18 litros é nescessário: " + qtlatas + " latas de tinta");
        System.out.println("Para latas de 3,6 litros é nescessário: " + qtlatas2 + " latas de tinta");
        System.out.println(qtlatas+ " latas de 18 litros,custam " + preco + " R$");
        System.out.println(qtlatas2+ " latas de 3,6 litros,custam " + preco2 + " R$");



        double qtdLitrosFolga = 1.1 * qtlitros;
        System.out.println("Quantidade de litros com folga necessarios: " + qtdLitrosFolga);

        //cenario1

        double qtLatasFolga = Math.ceil(qtdLitrosFolga / 18);
        double precoLatasFolga = qtlatas * 80;



        double qtdLatasMix = Math.floor(qtLatasFolga/18);
        double qtdGalaoMix = Math.ceil((qtLatasFolga - qtdLatasMix * 18) / 3.6);


        double precoLatasMix = qtdLatasMix * 80;
        double precogaloesMix = qtdGalaoMix * 25;
        double precoMix = precoLatasMix + precogaloesMix;


        if (precoLatasFolga < precoMix){
            System.out.println("Quantidades de latas necessárias: " + qtLatasFolga);
            System.out.println("Preço das latas: " + precoLatasFolga);
        } else {
            System.out.println("Quantidades de latas necessárias: " + qtdLatasMix);
            System.out.println("Quantidade de galões: " + qtdGalaoMix);
            System.out.println("Preço dos galões: " +precogaloesMix);
            System.out.println("Preço total: " + precoMix);
        }
    }
}
