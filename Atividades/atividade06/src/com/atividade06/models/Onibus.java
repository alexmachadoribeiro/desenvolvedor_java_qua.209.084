package com.atividade06.models;

final public class Onibus extends Veiculo {
    // atributo
    private boolean leito;

    // construtor
    public Onibus(String fabricante, String modelo, String cor, String ano, String placa, String categoria, boolean leito) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.leito = leito;
    }

    // getters e setters
    public boolean isLeito() {
        return this.leito;
    }

    public boolean getLeito() {
        return this.leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

}
