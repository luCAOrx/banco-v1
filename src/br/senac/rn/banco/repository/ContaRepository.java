package br.senac.rn.banco.repository;

import br.senac.rn.banco.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {

    private static Long id = 0L;
    private static List<Conta> contatos = new ArrayList<Conta>();

    public void salva(Conta conta) {

    }

    public List<Conta> buscaTodos() {
        List<Conta> copiaContatos = new ArrayList<Conta>(contatos);
        return copiaContatos;
    }

    public Conta buscaPeloNome(String nome) {
        for (Conta contato : contatos) {
            if (contato.getTitular().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void remove(Conta contato) {
        contatos.remove(contato);
    }

    public void edita(Conta contato) {
        for (Conta c: contatos) {
            if (c.getAgencia().equals(contato.getAgencia())) {
                int indice = contatos.indexOf(c);
                contatos.set(indice, contato);
            }
        }
    }
}
