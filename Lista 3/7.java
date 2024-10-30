import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private int matricula;
    private String nome;
    private double ira;
    private String curso;

    public Aluno(int matricula, String nome, double ira, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.ira = ira;
        this.curso = curso;
    }

    public int getMatricula() { return matricula; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", IRA: " + ira + ", Curso: " + curso;
    }
}

class CadastroAluno {
    private List<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) { listaAlunos.add(aluno); }

    public void ordenarPorMatricula() {
        listaAlunos.sort(Comparator.comparingInt(Aluno::getMatricula));
    }

    public void imprimirAlunos() {
        listaAlunos.forEach(System.out::println);
    }
}

public class Main {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite os dados do aluno " + i + ":");

            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("IRA: ");
            double ira = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            cadastro.adicionarAluno(new Aluno(matricula, nome, ira, curso));
        }

        System.out.println("\nLista de alunos ordenada por matrícula:");
        cadastro.ordenarPorMatricula();
        cadastro.imprimirAlunos();
        scanner.close();
    }
}
