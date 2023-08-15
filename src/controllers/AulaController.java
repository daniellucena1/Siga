package controllers;

import repositories.AulaRepository;
import models.*;

import java.util.Scanner;

public class AulaController {
    private AulaRepository repository;
    private Scanner sc = new Scanner(System.in);

    public AulaController(AulaRepository repository) {
        this.repository = repository;
    }

    public void addAula(Professor professor) {
        System.out.println(">> Nome da matéria: ");
        String nome = sc.nextLine();
        System.out.println(">> Horário da aula: ");
        String horario = sc.nextLine();
        this.repository.addAula(new Aula(nome, professor, horario));
    }

    public void removerAula() {
        System.out.println(">> Nome da aula: ");
        String nome = sc.nextLine();
        this.repository.removerAula(nome);
    }

    public Aula getAula(String nome) {
        return this.getAula(nome);
    }

    public void mostrarAtaDaAula() {
        System.out.println(">> Nome da aula: ");
        String nome = sc.nextLine();
        this.repository.mostrarAtaDaAula(nome);
    }

    public void addAlunoNaAula(Aluno aluno) {
        System.out.println(">> Nome da aula:");
        String nomeAula = sc.nextLine();
        this.repository.addAlunoNaAula(nomeAula, aluno);
    }

    public void removerAluno(String nomeAula, String cpfAluno) {
        this.repository.removerAluno(nomeAula, cpfAluno);
    }

    public void atualizarPresenca() {
        System.out.println(">> Nome da aula: ");
        String nomeAula = sc.nextLine();
        System.out.println(">> CPF do aluno: ");
        String cpfAluno = sc.nextLine();
        System.out.println(">> Presença: [P - presente] [F - falta]");
        String presenca = sc.nextLine();
        if(presenca.toLowerCase() != "f" || presenca.toLowerCase() != "p") {
            System.out.println(">> Entrada Inválida");
        } else this.repository.atualizarPresenca(nomeAula, cpfAluno, presenca);
    }

    public void mostrarAlunoEspecifico() {
        System.out.println(">> Nome da aula: ");
        String nomeAula = sc.nextLine();
        System.out.println(">> CPF do aluno: ");
        String cpf = sc.nextLine();
        this.repository.mostrarAlunoEspecifico(nomeAula, cpf);
    }
}
