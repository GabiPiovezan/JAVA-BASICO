import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] materias = {"Portugues", "Matematica", "Ingles"};
        float[][] notas = new float[3][4];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as suas notas de : " + materias[i] + ": ");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = scanner.nextFloat();
            }
        }

        float[] media = new float[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                media[i] = media[i] + notas[i][j];
            }
            media[i] = media[i] / 4;
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.println(notas[i][j]);
            }
            if (i != 3) {
                System.out.print(", ");
            }
            System.out.println("Suas notas de " + materias[i] + " são: ");
        }
    }
}