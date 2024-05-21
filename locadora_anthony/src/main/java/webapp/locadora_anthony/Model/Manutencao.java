package webapp.locadora_anthony.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Manutencao {
    @Id
    private int id_manutencao;
    private Date data_manutencao;
    private String tipo_manutecao;
    private String descricao;
    private int km;
    private double valor_manutencao;

    //getters e setters

    public int getId_manutencao() {
        return id_manutencao;
    }
    public void setId_manutencao(int id_manutencao) {
        this.id_manutencao = id_manutencao;
    }
    public Date getData_manutencao() {
        return data_manutencao;
    }
    public void setData_manutencao(Date data_manutencao) {
        this.data_manutencao = data_manutencao;
    }
    public String getTipo_manutecao() {
        return tipo_manutecao;
    }
    public void setTipo_manutecao(String tipo_manutecao) {
        this.tipo_manutecao = tipo_manutecao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public double getValor_manutencao() {
        return valor_manutencao;
    }
    public void setValor_manutencao(double valor_manutencao) {
        this.valor_manutencao = valor_manutencao;
    }
    
}
