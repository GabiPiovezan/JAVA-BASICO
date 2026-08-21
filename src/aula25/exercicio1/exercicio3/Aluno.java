package aula25.exercicio1.exercicio3;

public class Aluno {
    String nome;
    int idade;
    String turma;
    boolean estadoMatricula;

    void matricula (){
        if (estadoMatricula == true){
            System.out.println(" Sim");
        }else {
            System.out.println(" Não");
        }
    }

    void exibirAluno(){
        System.out.println("Aluno(a): " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Turma: " +turma);
        System.out.println("Matriculado(a): " + estadoMatricula);
    }
}
