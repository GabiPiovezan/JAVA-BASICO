package aula15;
import java.util.Scanner;
import java.time.LocalDate;
public class Exercicio18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        try {
            LocalDate data = LocalDate.of(ano, mes, dia);
            System.out.println("Data válida: " + dia +"/"+ mes + "/"+ ano);
        } catch (Exception e) {
            System.out.println("Data Inválida!");
        }
    }
}
