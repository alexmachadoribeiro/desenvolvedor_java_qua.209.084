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

    public void exibirDados() {
        System.out.println("Razão Social: " + this.pj.getRazaoSocial());
        System.out.println("Nome fantasia: " + this.pj.getNomeFantasia());
        System.out.println("CNPJ: " + this.pj.getCnpj());
        System.out.println("E-mail: " + this.pj.getEmail());
        super.exibirDados();
    }

    public double fazerSaque(double valor) {
        this.setSaldo(this.getSaldo()-valor-(this.getSaldo()-0.01/100));
        return this.getSaldo();
    }

}
