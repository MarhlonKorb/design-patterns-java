package factory.model;

import factory.model.enums.EnumTipoPessoa;

/**
 * Classe concreta que implementa a interface `IPessoa`
 */
public class PessoaFisica implements IPessoa {

    private String cpf;
    private String nome;

    private EnumTipoPessoa tipo;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public EnumTipoPessoa getTipo() {
        return EnumTipoPessoa.FISICA;
    }
}
