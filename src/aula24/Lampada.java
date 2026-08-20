package aula24;

public class Lampada {
    double preco;
    int potencia ;
    int voltagem;
    String cor;
    String tipo;
    boolean ligada;


    public Lampada(double preco, int potencia, int voltagem, String cor, String tipo){
        this.preco = preco;
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.cor = cor;
        this.tipo = tipo;

    }
    void ligar(){
        this.ligada = true;
    }

    void desligar(){
        this.ligada = false;
    }

    double verPotencia(){
      return this.potencia;
    }
}

