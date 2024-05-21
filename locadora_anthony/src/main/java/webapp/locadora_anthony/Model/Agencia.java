package webapp.locadora_anthony.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Agencia {
    @Id
    private int numero_agencia;
    private String endereco;
    private String cidade;
    private String estado;
    private String contato;

    //getters e setters

    public int getNumero_agencia() {
        return numero_agencia;
    }
    public void setNumero_agencia(int numero_agencia) {
        this.numero_agencia = numero_agencia;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }

    

}
