import controllers.*;
import models.*;
import repositories.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoController alunoController = new AlunoController(new AlunoRepository());
        AulaController aulaController = new AulaController(new AulaRepository());
        ProfessorController professorController = new ProfessorController(new ProfessorRepository());

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while(opcao != 0) {
            mainMenu();
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao) {
                case 1:
                    alunoController.addAluno();
                    break;
                case 2:
                    professorController.addProfessor();
                    break;
                case 3:
                    System.out.println(">> CPF do professor que irá ministrar a aula:");
                    String cpfProfessor = sc.nextLine();
                    Professor professor = professorController.getProfessor(cpfProfessor);
                    if(professor != null) {
                        aulaController.addAula(professor);
                    } else System.out.println(">> Professor não cadastrado!");
                    break;
                case 4:
                    System.out.println(">> CPF do aluno: ");
                    String cpfAluno = sc.nextLine();
                    Aluno aluno = alunoController.getAluno(cpfAluno);
                    if(aluno != null) {
                        aulaController.addAlunoNaAula(aluno);
                    } else System.out.println(">> Aluno não cadastrado");
                    break;
                case 5:
                    aulaController.mostrarAtaDaAula();
                    break;
                case 6:
                    aulaController.atualizarPresenca();
                    break;
                case 7:
                    aulaController.mostrarAlunoEspecifico();
                    break;
                case 8:
                    System.out.println(">> CPF do aluno: ");
                    String cpf = sc.nextLine();
                    System.out.println(">> Nome da aula: ");
                    String nome = sc.nextLine();
                    alunoController.removerAluno(cpf);
                    aulaController.removerAluno(nome, cpf);
                    break;
                case 9:
                    professorController.removerProfessor();
                    break;
                case 10:
                    aulaController.removerAula();
                    break;
                case 0:
                    sc.close();
                    break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println(">> Escolha as opções:");
        System.out.println(">> 1  - Cadastrar aluno");
        System.out.println(">> 2  - Cadastrar Professor");
        System.out.println(">> 3  - Cadastrar aula");
        System.out.println(">> 4  - Adicionar aluno em uma aula");
        System.out.println(">> 5  - Mostrar ata de uma aula");
        System.out.println(">> 6  - Atualizar presença de um aluno");
        System.out.println(">> 7  - Mostrar currículo de um aluno");
        System.out.println(">> 8  - Deletar aluno");
        System.out.println(">> 9  - Deletar professor");
        System.out.println(">> 10 - Deletar aula");
        System.out.println(">> 0  - Encerrar");
    }
}
