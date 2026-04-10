package com.atividade07.models;

import com.atividade07.repository.IConta;

public abstract class Conta implements IConta {
    private String nAgencia;
    private String nConta;
    private double saldo;

    public Conta(String nAgencia, String nConta, double saldo) {
        this.nAgencia = nAgencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    public String getNAgencia() {
        return this.nAgencia;
    }

    public void setNAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Número da agência: " + this.nAgencia);
        System.out.println("Número da conta: " + this.nConta);
        System.out.println("Saldo: R$ " + this.saldo);
    }

    @Override
    public double fazerDeposito(double valor) {
        return this.saldo += valor;
    }

    @Override
    public double fazerSaque(double valor) {
        return this.saldo -= valor;
    }
    
}
