package webapp.locadora_anthony.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carro {
    @Id
    private String id_carro;
    private String modelo;
    private int ano;
    private String placa;
    private String disponibilidade;
    private int numero_agencia;

    //getters e setters

    public String getId_carro() {
        return id_carro;
    }
    public void setId_carro(String id_carro) {
        this.id_carro = id_carro;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public int getNumero_agencia() {
        return numero_agencia;
    }
    public void setNumero_agencia(int numero_agencia) {
        this.numero_agencia = numero_agencia;
    }
     
}
