package aula24.exercicio1.exercicio3;

import aula24.exercicio1.EstoqueLampada;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        LivrodeLivraria livro1 = new LivrodeLivraria();
        livro1.titulo = "Noites Brancas";
        livro1.autor = "Fyodor Dostoevsky";
        livro1.genero = "Romance, Narrativa em primeira pessoa.";
        livro1.preco = 63.80;
        livro1.referencia = "001";
        livro1.nomeLivraria = " Bom leitor!";

        LivrodeLivraria livro2 = new LivrodeLivraria();
        livro2.titulo = "Pequeno Principe";
        livro2.autor = "Antonie de Saint-Exupéry";
        livro2.genero = "Literatura Infatil.";
        livro2.preco = 65.80;
        livro2.referencia = "053";
        livro2.nomeLivraria = " Bom leitor!";

        LivrodeLivraria livro3 = new LivrodeLivraria();
        livro3.titulo = " O fantasma da Ópera";
        livro3.autor = " Gaston Leroux";
        livro3.genero = " Horror, romance e Mistério.";
        livro3.preco = 73.80;
        livro3.referencia = "001";
        livro3.nomeLivraria = "Bom leitor!";


        EstoqueLivraria estoqueLivraria1 = new EstoqueLivraria();
         estoqueLivraria1.livraria = livro1;
        estoqueLivraria1.quantidade = 45;

        EstoqueLivraria estoqueLivraria2 = new EstoqueLivraria();
        estoqueLivraria2.livraria = livro2;
        estoqueLivraria2.quantidade = 50;

        EstoqueLivraria estoqueLivraria3 = new EstoqueLivraria();
        estoqueLivraria3.livraria = livro3;
        estoqueLivraria3.quantidade = 30;

        Map<String, EstoqueLivraria> estoque = new HashMap<>();
        estoque.put(livro1.referencia, estoqueLivraria1);
        estoque.put(livro2.referencia, estoqueLivraria2);
        estoque.put(livro3.referencia, estoqueLivraria3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva qual refêrencia deseja encontrar no estoque: ");
        String referenciaProcurada = scanner.nextLine();

        if (!estoque.containsKey(referenciaProcurada)){
            System.out.println("SerialNumber não encontrado!");
            return;
        }

        EstoqueLivraria estoqueLivrariaEncontrada = estoque.get(referenciaProcurada);
        estoqueLivrariaEncontrada.imprimir();
    }
}
