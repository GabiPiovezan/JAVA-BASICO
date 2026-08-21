package aula25.exercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Lampada lampada1 = new Lampada();
        lampada1.marca = "Philips";
        lampada1.tipo = "LED_Baloon";
        lampada1.voltagem = 220;
        lampada1.preco = 70.45;
        lampada1.temperatura = 3000;
        lampada1.potencia = 7;
        lampada1.serialNumber = "7479";
        lampada1.estadodaLampada = false;

        if (lampada1.estadodaLampada){
            System.out.println("A lâmpada " + lampada1.tipo + " está ligada!");
        }else {
            System.out.println("A Lâmpada " + lampada1.tipo + " está desligada!");
        }

        Lampada lampada2 = new Lampada();
        lampada2.marca = "NORDECOR";
        lampada2.tipo = "LED_Baloon";
        lampada2.voltagem = 220;
        lampada2.preco = 60.45;
        lampada2.temperatura = 2500;
        lampada2.potencia = 3;
        lampada2.serialNumber = "6489";
        lampada2.estadodaLampada = false;

        if (lampada2.estadodaLampada){
            System.out.println("A lâmpada " + lampada2.tipo + " está ligada!");
        }else {
            System.out.println("A Lâmpada " + lampada2.tipo + " está desligada!");
        }

        EstoqueLampada estoqueLampada1 = new EstoqueLampada();
        estoqueLampada1.lampada = lampada1;
        estoqueLampada1.quantidade = 315;

        EstoqueLampada estoqueLampada2= new EstoqueLampada();
        estoqueLampada2.lampada = lampada2;
        estoqueLampada2.quantidade = 215;

        Map<String, EstoqueLampada> estoque = new HashMap<>();
        estoque.put(lampada1.serialNumber, estoqueLampada1);
        estoque.put(lampada2.serialNumber, estoqueLampada2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva qual serialNumber deseja encontrar no estoque: ");
        String serialNumberProcurado = scanner.nextLine();

        if (!estoque.containsKey(serialNumberProcurado)){
            System.out.println("SerialNumber não encontrado!");
            return;
        }

        EstoqueLampada estoqueLampadaEncontrada = estoque.get(serialNumberProcurado);
        estoqueLampadaEncontrada.imprimir();
    }
}
