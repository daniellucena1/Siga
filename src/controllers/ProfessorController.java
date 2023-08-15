package controllers;

import repositories.ProfessorRepository;
import models.*;

import java.util.Scanner;

public class ProfessorController {
    private ProfessorRepository repository;
    private Scanner sc = new Scanner(System.in);

    public ProfessorController(ProfessorRepository repository) {
        this.repository = repository;
    }

    public void addProfessor() {
        System.out.println(">> Nome do professor:");
        String nome = sc.nextLine();
        System.out.println(">> E-mail do professor: ");
        String email = sc.nextLine();
        System.out.println(">> CPF do professor:");
        String cpf = sc.nextLine();
        this.repository.addProfessor(new Professor(nome, email, cpf));
    }

    public void removerProfessor() {
        System.out.println(">> CPF do professor: ");
        String cpf = sc.nextLine();
        this.repository.removerProfessor(cpf);
    }

    public Professor getProfessor(String cpf) {
        return this.repository.getProfessor(cpf);
    }
}
