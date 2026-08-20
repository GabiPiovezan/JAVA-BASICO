package aula24;

public class Livro {
    String titulo;
    String autor;
    int qtdPaginas;
    double preco;

    public Livro(String titulo, String autor, int qtdPaginas,double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.preco = preco;
    }
    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Páginas: " +qtdPaginas);
        System.out.println("Preço: " +preco);
    }
}
