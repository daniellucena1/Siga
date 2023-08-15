package repositories;

import models.Aluno;
import java.util.ArrayList;

public class AlunoRepository {
    private ArrayList<Aluno> alunos  = new ArrayList<Aluno>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String cpf) {
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getCpf().equals(cpf)) {
                alunos.remove(i);
            }
        }
    }

    public Aluno getAluno(String cpf) {
        for(Aluno a : alunos) {
            if(a.getCpf().equals(cpf)){
                return a;
            }
        }
        return null;
    }
}