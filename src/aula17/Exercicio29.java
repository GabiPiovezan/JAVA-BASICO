package aula17;



public class Exercicio29 {
    public static void main(String[] args){

        double precoUnitario = 1.99;

        System.out.println("Loja Quase dois - Tabela de preços");

        for (int i = 1; i <= 50 ; i++) {
            double total = i * precoUnitario;
            System.out.printf("%d - R$ %.2f%n" , i, total);
        }
    }
}
