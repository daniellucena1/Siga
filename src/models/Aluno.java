package models;

public class Aluno extends Pessoa {
    private String presenca = "F";


    public Aluno(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    public String getPresenca() {
        return this.presenca;
    }
    
    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }
}