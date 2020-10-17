package br.senac.rn.banco.model;

public class ContaPoupanca extends Conta {
    private final Double RENDIMENTO = 0.005;

    public void rende() {
        saldo = saldo + saldo * RENDIMENTO;
    }

    @Override
    public Boolean saca(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
        System.out.println("SALDO INSUFICIENTE!!!");
        return false;
    }

    @Override
    public String toString() {
        return  "ContaPoupanca{" + super.toString() + "}";
    }

}
