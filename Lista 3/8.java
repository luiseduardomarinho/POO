import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();
        mapaAlunos.put(101, new Aluno(101, "João", 20));
        mapaAlunos.put(102, new Aluno(102, "Maria", 22));
        mapaAlunos.put(103, new Aluno(103, "Pedro", 21));
        mapaAlunos.put(104, new Aluno(104, "Ana", 23));
        mapaAlunos.put(105, new Aluno(105, "Lucas", 20));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();

        Aluno aluno = mapaAlunos.get(matricula);
        System.out.println(aluno != null ? aluno : "Aluno não encontrado.");
        
        scanner.close();
    }
}

class Aluno {
    private int matricula;
    private String nome;
    private int idade;

    public Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Idade: " + idade;
    }
}
