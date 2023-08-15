package repositories;

import java.util.ArrayList;

import models.*;

public class AulaRepository {
    private ArrayList<Aula> aulas = new ArrayList<Aula>();

    public void addAula(Aula aula) {
        aulas.add(aula);
    }

    public void removerAula(String nome) {
        for(int i = 0; i < aulas.size(); i++) {
            if(aulas.get(i).getNome().equals(nome)){
                aulas.remove(i);
            } else System.out.println(">> Aula não foi cadastrada ou já foi deletada");
        }
    }

    public Aula getAula(String nome) {
        for(Aula a : aulas) {
            if(a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
    }

    public void mostrarAtaDaAula(String nome) {
        Aula aula = getAula(nome);
        if(aula != null) {
            aula.mostrarAtaDaAula();
        } else System.out.println(">> Aula não cadastrada");
    }

    public void addAlunoNaAula(String nomeAula, Aluno aluno) {
        Aula aula = getAula(nomeAula);
        if(aula != null) {
            aula.addAluno(aluno);
        } else System.out.println(">> Aula não cadastrada");
    }

    public void removerAluno(String nomeAula, String cpfAluno) {
        Aula aula = getAula(nomeAula);
        if(aula != null) {
            aula.removerAluno(cpfAluno);  
        } else System.out.println(">> Aluno removido");
    }

    public void atualizarPresenca(String nomeAula, String cpfAluno, String presenca) {
        Aula aula = getAula(nomeAula);
        if(aula != null) {
            aula.colocarPresenca(cpfAluno, presenca);
        }
    }

    public void mostrarAlunoEspecifico(String nomeAula, String cpf) {
        Aula aula = getAula(nomeAula);
        if(nomeAula != null) {
            aula.mostrarAlunoEspecifico(cpf);   
        } else System.out.println(">> Aula não cadastrada");
    }
}