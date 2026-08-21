package aula25.exercicio1;



public class EstoqueLampada {
    Lampada lampada;
    int quantidade;

    void imprimir(){
        System.out.println("SerialNumber: " + this.lampada.serialNumber);
        System.out.println("Marca: " + this.lampada.marca);
        System.out.println("Tipo: " +this.lampada.tipo);
        System.out.println("Voltagem: " +this.lampada.voltagem);
        System.out.println("Preço: " +this.lampada.preco);
        System.out.println("Temperatura: " +this.lampada.temperatura);
        System.out.println("Potencia: " +this.lampada.potencia);
        System.out.println("Quantidade em estoque: " +this.quantidade);
    }
}
