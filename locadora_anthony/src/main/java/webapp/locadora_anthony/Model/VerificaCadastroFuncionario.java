package webapp.locadora_anthony.Model;

import java.io.Serializable;

import jakarta.persistence.Id;

public class VerificaCadastroFuncionario implements Serializable{
    @Id
    private int id_funcionario;
    private String nome;

    //getters e setters
    public int getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
