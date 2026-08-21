package aula24.exercicio1.exercicio4;

public class EstoqueLivrodeBiblioteca {
    LivrodeBiblioteca biblioteca;
    int quantidade;


    void imprimir(){
        System.out.println("Livraria: " + this.biblioteca.nomeLivraria);
        System.out.println("Título: " + this.biblioteca.titulo);
        System.out.println("Autor: " +this.biblioteca.autor);
        System.out.println("Genêro: " +this.biblioteca.genero);
        System.out.println("Preço: " +this.biblioteca.preco);
        System.out.println("N° de referência: " +this.biblioteca.referencia);
        System.out.println("Quantidade em estoque: " +this.quantidade);
    }

}
