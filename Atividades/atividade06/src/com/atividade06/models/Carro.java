package com.atividade06.models;

final public class Carro extends Veiculo {
    // atributos
    private boolean bagageiro;

    // construtor
    public Carro(String fabricante, String modelo, String cor, String ano, String placa, String categoria, boolean bagageiro) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.bagageiro = bagageiro;
    }

    // getters e setters
    public boolean isBagageiro() {
        return this.bagageiro;
    }

    public boolean getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

}
