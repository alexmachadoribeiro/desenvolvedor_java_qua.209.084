package com.atividade06.models;

final public class Caminhao extends Veiculo {
    private int carroceria;

    public Caminhao(String fabricante, String modelo, String cor, String ano, String placa, String categoria, int carroceria) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.carroceria = carroceria;
    }

    public int getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(int carroceria) {
        this.carroceria = carroceria;
    }

}
