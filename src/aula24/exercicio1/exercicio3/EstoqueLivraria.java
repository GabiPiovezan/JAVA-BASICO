package aula24.exercicio1.exercicio3;

import aula24.exercicio1.Lampada;

public class EstoqueLivraria {
    LivrodeLivraria livraria;
    int quantidade;

    void imprimir(){
        System.out.println("Livraria: " + this.livraria.nomeLivraria);
        System.out.println("Título: " + this.livraria.titulo);
        System.out.println("Autor: " +this.livraria.autor);
        System.out.println("Genêro: " +this.livraria.genero);
        System.out.println("Preço: " +this.livraria.preco);
        System.out.println("N° de referência: " +this.livraria.referencia);
        System.out.println("Quantidade em estoque: " +this.quantidade);
    }
}
