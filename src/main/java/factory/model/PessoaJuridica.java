package factory.model;

import factory.model.enums.EnumTipoPessoa;

/**
 * Classe concreta que implementa a interface `IPessoa`
  */
public class PessoaJuridica implements IPessoa{
    private String cnpj;
    private String razaoSocial;
    private EnumTipoPessoa tipo;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public EnumTipoPessoa getTipo() {
        return EnumTipoPessoa.JURIDICA;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
