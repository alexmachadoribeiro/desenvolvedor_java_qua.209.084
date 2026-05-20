package com.crud.javalanches.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Cliente {
    // atributos
    private long codigo_cliente;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    public Cliente() {
    }

}
