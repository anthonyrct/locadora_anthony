package webapp.locadora_anthony.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Clientes {
    @Id
    private int id_cliente;
    private String nome;
    private String sobrenome;
    private int cartao_carro;
    private int id_pagamento;
    private String estado;
    private String email;
    private String cidade;
    private String cnh;
    private String numero_telefone;
    
    //getters e setters

    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
    public int getCartao_carro() {
        return cartao_carro;
    }
    public void setCartao_carro(int cartao_carro) {
        this.cartao_carro = cartao_carro;
    }
    public int getId_pagamento() {
        return id_pagamento;
    }
    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public String getNumero_telefone() {
        return numero_telefone;
    }
    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }
    
    
}
