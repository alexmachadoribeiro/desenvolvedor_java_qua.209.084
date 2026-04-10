package com.atividade07.models;

public abstract class Pessoa {
    private String email;

    public Pessoa(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
