package webapp.locadora_anthony.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Funcionarios {
    @Id
    private int id_funcionario;
    private String nome;
    private String sobrenome;
    private Date data_contratacao;
    private String cargo;
    private double salario;

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
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Date getData_contratacao() {
        return data_contratacao;
    }
    public void setData_contratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
   

}
