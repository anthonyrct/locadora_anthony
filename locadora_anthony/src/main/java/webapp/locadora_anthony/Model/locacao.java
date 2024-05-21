package webapp.locadora_anthony.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class locacao {
    @Id
    private int id_locacao;
    private double valor_total;
    private Date data_locacao;
    private Date data_devolucao;
    private int id_cliente;
    private int id_carro;

    //getters e setters

    public int getId_locacao() {
        return id_locacao;
    }
    public void setId_locacao(int id_locacao) {
        this.id_locacao = id_locacao;
    }
    public double getValor_total() {
        return valor_total;
    }
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    public Date getData_locacao() {
        return data_locacao;
    }
    public void setData_locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }
    public Date getData_devolucao() {
        return data_devolucao;
    }
    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public int getId_carro() {
        return id_carro;
    }
    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }
    
}
