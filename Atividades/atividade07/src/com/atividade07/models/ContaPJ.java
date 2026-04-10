package com.atividade07.models;

public class ContaPJ extends Conta {
    private PessoaJuridica pj;

    public ContaPJ(String nAgencia, String nConta, double saldo, PessoaJuridica pj) {
        super(nAgencia, nConta, saldo);
        this.pj = pj;
    }

    public PessoaJuridica getPj() {
        return this.pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }

    // TODO: polimorfismo

}
