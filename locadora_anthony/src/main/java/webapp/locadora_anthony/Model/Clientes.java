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
    
}
