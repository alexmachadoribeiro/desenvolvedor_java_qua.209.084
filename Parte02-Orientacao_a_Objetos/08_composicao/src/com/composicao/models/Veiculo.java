package com.composicao.models;

public class Veiculo {
    // atributos
    private String fabricante;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    private String renavam;
    private Pessoa motorista;

    public Veiculo(String fabricante, String modelo, String ano, String cor, String placa, String renavam, Pessoa motorista) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.renavam = renavam;
        this.motorista = motorista;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return this.renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Pessoa getMotorista() {
        return this.motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }

}
