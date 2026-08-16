package aula15;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scanner.nextLine();

        String resultado = "aeiou".contains(letra.toLowerCase()) ? "VOGAL" : "CONSOANTE";
        System.out.println("A letra é uma: " + resultado);

        /*switch(letra){
 fazer case com as vogais. identifica qualquer coisa como consoante
         */
    }
}
