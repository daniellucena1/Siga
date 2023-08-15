package repositories;

import models.Professor;
import java.util.ArrayList;

public class ProfessorRepository {
    private ArrayList<Professor> professores = new ArrayList<Professor>();

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(String cpf) {
        for(int i = 0; i < professores.size(); i++) {
            if(professores.get(i).getCpf().equals(cpf)) {
                professores.remove(i);
            }
        }
    }

    public Professor getProfessor(String cpf) {
        for(Professor a : professores) {
            if(a.getCpf().equals(cpf)){
                return a;
            }
        }
        return null;
    }
}