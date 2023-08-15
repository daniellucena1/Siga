package controllers;

import repositories.AlunoRepository;
import models.*;

import java.util.Scanner;

public class AlunoController {
    private AlunoRepository repository;
    private Scanner sc = new Scanner(System.in);

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    public void addAluno() {
        System.out.println(">> Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println(">> E-mail do aluno: ");
        String email = sc.nextLine();
        System.out.println(">> CPF do aluno: ");
        String cpf = sc.nextLine();
        this.repository.addAluno(new Aluno(nome, email, cpf));
    }

    public void removerAluno(String cpf) {
        this.repository.removerAluno(cpf);
    }

    public Aluno getAluno(String cpf) {
        return this.repository.getAluno(cpf);
    }
}
