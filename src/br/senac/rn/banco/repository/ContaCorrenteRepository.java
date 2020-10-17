package br.senac.rn.banco.repository;

public class ContaCorrenteRepository extends ContaRepository {

    @Override
    public Boolean saca(Double valor) {
        Double valorComTaxa = valor + TAXA;
        Double saldoComLimite = saldo + limite;
        if (valorComTaxa <= saldoComLimite) {
            saldo -= valorComTaxa;
        }
        System.out.println("SALDO INSUFICIENTE!!!");
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }
}
