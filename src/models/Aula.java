package models;

import java.util.ArrayList;

public class Aula {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private String horario;

    public Aula(String nome, Professor professor, String horario) {
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String cpf) {
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getCpf().equals(cpf)){
                alunos.remove(i);
            }
        }
    }

    public void mostrarAtaDaAula() {
        System.out.printf(">> %-27s%-16s%-11s\n", "Nome", "CPF", "Presença");
        for(int i = 0; i < alunos.size(); i++) {
            System.out.printf(">> %-27s%-16s%-11b", alunos.get(i).getNome(), alunos.get(i).getCpf(), alunos.get(i).getPresenca());
        }
    }

    public void colocarPresenca(String cpf, String presenca){
        for(Aluno a : alunos) {
            if(a.getCpf().equals(cpf)){
                a.setPresenca(presenca);
            }
        }
    }

    public void mostrarAlunoEspecifico(String cpf) {
        for(Aluno a : alunos) {
            if(a.getCpf().equals(cpf)){
                System.out.printf(">> %-27s%-16s%-11s\n", "Nome", "CPF", "Presença");
                System.out.printf(">> %-27s%-16s%-11s", a.getNome(), a.getCpf(), a.getPresenca());
            }
        }
    }

}
