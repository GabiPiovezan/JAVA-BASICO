package aula25.exercicio1.exercicio3;

public class Exercicio3 {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.idade = 20;
        aluno1.estadoMatricula = true;
        aluno1.turma = "1435a";


        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana";
        aluno2.idade = 20;
        aluno2.estadoMatricula = true;
        aluno2.turma = "1435a";


        Disciplina disciplina1 = new Disciplina();
        disciplina1.nome ="Matemática";
        disciplina1.conteudo = "Funções";
        disciplina1.carga = 40;
        disciplina1.semestre = "1º semestre";

        aluno1.exibirAluno();
        aluno2.exibirAluno();
    }
}
