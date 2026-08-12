package aula15;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero > 1000 || numero < 0){
            System.out.println("O Número é invalido, deve ser maior ou igual a 0 e menor que 1000.");
        } else {
            int centenas = numero/100;
            int dezenas = (numero % 100)/10;
            int unidades = numero % 10;

            String strCentenas = centenas + (centenas == 1 ? "centena" : "centenas");
            String strDezenas = dezenas + (dezenas == 1 ? "dezena" : "dezenas");
            String strUnidades = unidades + (unidades == 1 ? "unidade" : "unidades");

            int qtd = (centenas > 0 ? 1 : 0) + (dezenas >0 ? 1 : 0) + (unidades >0 ? 1 : 0);
            String resultado = numero + " = ";

            if (qtd == 3){
                resultado += strCentenas + ", " + strDezenas + " e " + strUnidades;
            } else if (qtd == 2) {
                if (centenas >0 &&  dezenas > 0){
                    resultado += strCentenas + " e " + strDezenas;
                } else if (centenas > 0 && unidades >0) {
                    resultado += strCentenas + " e " + strUnidades;
                }else {
                    resultado += strDezenas + " e " + strUnidades;
                }
            } else if (qtd == 1) {
                if (centenas > 0) resultado += strCentenas;
                if (dezenas > 0) resultado += strDezenas;
                if (unidades > 0) resultado += strUnidades;
                }else {
                resultado += "0 unidades";
            }
            System.out.println(resultado);
        }
    }
}
