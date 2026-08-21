package aula24.exercicio1.exercicio6;

public class Exercicio6 {
    public static void main(String[] args){
        Contato contato1 = new Contato();
        contato1.nome = "Maria";
        contato1.email = "mariazinha@gmail.com";
        contato1.telefone = "(48) 99999-1111";

        Contato contato2 = new Contato();
        contato2.nome = "José";
        contato2.email = "sezinho@gmail.com";
        contato2.telefone = "(48) 98888-2222";

        contato1.exibirResultado();
        contato2.exibirResultado();
    }
}
