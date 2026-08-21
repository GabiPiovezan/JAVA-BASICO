package aula24.exercicio1.exercicio4;

import aula24.exercicio1.exercicio3.EstoqueLivraria;
import aula24.exercicio1.exercicio3.LivrodeLivraria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        LivrodeBiblioteca livro1 = new LivrodeBiblioteca();
        livro1.titulo = "Noites Brancas";
        livro1.autor = "Fyodor Dostoevsky";
        livro1.genero = "Romance, Narrativa em primeira pessoa.";
        livro1.preco = 63.80;
        livro1.referencia = "001";
        livro1.nomeLivraria = " Bom leitor!";
        livro1.emprestado = false;

        LivrodeBiblioteca livro2 = new LivrodeBiblioteca();
        livro2.titulo = "Pequeno Principe";
        livro2.autor = "Antonie de Saint-Exupéry";
        livro2.genero = "Literatura Infatil.";
        livro2.preco = 65.80;
        livro2.referencia = "010";
        livro2.nomeLivraria = " Bom leitor!";
        livro2.emprestado = false;

        EstoqueLivrodeBiblioteca estoquedeBiblioteca1 = new EstoqueLivrodeBiblioteca();
        estoquedeBiblioteca1.biblioteca = livro1;
        estoquedeBiblioteca1.quantidade = 45;

        EstoqueLivrodeBiblioteca estoquedeBiblioteca2 = new EstoqueLivrodeBiblioteca();
        estoquedeBiblioteca2.biblioteca = livro2;
        estoquedeBiblioteca2.quantidade = 50;

        Map<String, EstoqueLivrodeBiblioteca> estoque = new HashMap<>();
        estoque.put(livro1.referencia, estoquedeBiblioteca1);
        estoque.put(livro2.referencia, estoquedeBiblioteca2);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva qual refêrencia deseja encontrar no estoque: ");
        String referenciaProcurada = scanner.nextLine();

        if (!estoque.containsKey(referenciaProcurada)){
            System.out.println("Referência não encontrada!");
            return;
        }

        EstoqueLivrodeBiblioteca estoqueBibliotecaEncontrada = estoque.get(referenciaProcurada);
        estoqueBibliotecaEncontrada.imprimir();
    }
}
