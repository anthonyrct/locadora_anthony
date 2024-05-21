package webapp.locadora_anthony.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Pagamento {
    @Id
    private int id_pagamento;
    private double valor;
    private Date data_Pagamento;
    private String forma_Pagamento;
    private String status_Pagamento;
    private int id_comprovante;
    private String comprovante;

    //getters e setters

    public int getId_pagamento() {
        return id_pagamento;
    }
    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Date getData_Pagamento() {
        return data_Pagamento;
    }
    public void setData_Pagamento(Date data_Pagamento) {
        this.data_Pagamento = data_Pagamento;
    }
    public String getForma_Pagamento() {
        return forma_Pagamento;
    }
    public void setForma_Pagamento(String forma_Pagamento) {
        this.forma_Pagamento = forma_Pagamento;
    }
    public String getStatus_Pagamento() {
        return status_Pagamento;
    }
    public void setStatus_Pagamento(String status_Pagamento) {
        this.status_Pagamento = status_Pagamento;
    }
    public int getId_comprovante() {
        return id_comprovante;
    }
    public void setId_comprovante(int id_comprovante) {
        this.id_comprovante = id_comprovante;
    }
    public String getComprovante() {
        return comprovante;
    }
    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }
    
}
