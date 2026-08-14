import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Programa para calculo de notas bimestrais------");

        List<String> materias = new ArrayList<>();
        System.out.println("Digite  o nome das materias: ");

        boolean precisaSair = false;
        while (!precisaSair){
            String materia = scanner.nextLine();
            materias.add(materia);
            System.out.println("Deseja cadastrar mais alguma matéria (s/n )? ");
            String decisao = scanner.nextLine();
            switch (decisao){
                case "n":
                case "N":
                case "Nao":
                case "nao":
                case "não":
                case "Não":
                case "NAO":
                    precisaSair = true;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Você escreveu: " + materias.size() + " matérias");

        List<List<Float>> boletim = new ArrayList<>();

        for (int posicaoMateria = 0; posicaoMateria< materias.size(); posicaoMateria++) {
            System.out.println("Digite as suas notas: " + materias.get(posicaoMateria) + ".");
            System.out.println("Digite um número negativo caso não tenha mais dados");
            float numeroDigitado = scanner.nextFloat();
            boletim.add(new ArrayList<>());
            while (numeroDigitado >= 0) {
                boletim.get(posicaoMateria).add(numeroDigitado);
                numeroDigitado = scanner.nextFloat();
            }
        }
        System.out.println("Suas notas digitadas foram: ");
        for (int posicaoMateria = 0; posicaoMateria < materias.size(); posicaoMateria++){
            System.out.println(materias.get(posicaoMateria) + ": ");
            List<Float> listaNotas = boletim.get(posicaoMateria);
            for (int posicaoNota = 0 ; posicaoNota < listaNotas.size(); posicaoNota++){
                float nota = listaNotas.get(posicaoNota);
                System.out.println(nota);
                if (posicaoNota != listaNotas.size() -1){
                    System.out.println(", ");
                }
            }
            System.out.println(".");
        }
    }
}

