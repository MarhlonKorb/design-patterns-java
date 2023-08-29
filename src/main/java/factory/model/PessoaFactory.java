package factory.model;

import factory.model.enums.EnumTipoPessoa;

/**
 * Fabrica concreta que devolve a instância de um objeto que implementa a interface `IPessoa`
 */
public class PessoaFactory implements IAbstractFactory<IPessoa> {

    @Override
    public IPessoa create(Enum enumTipoPessoa){
        if (enumTipoPessoa.equals(EnumTipoPessoa.FISICA)){
            return new PessoaFisica();
        } else if(enumTipoPessoa.equals(EnumTipoPessoa.JURIDICA)){
            return new PessoaJuridica();
        }
        return null;
    }

}
