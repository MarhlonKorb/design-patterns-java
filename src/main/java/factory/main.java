package factory;

import factory.model.IPessoa;
import factory.model.PessoaFactory;
import factory.model.PessoaFisica;
import factory.model.enums.EnumTipoPessoa;

public class main {
    public static void main(String[] args) {
        // Instanciando a factory
        PessoaFactory pessoaFactory = new PessoaFactory();
        // Criado a instância do objeto desejado
        PessoaFisica pessoaFisica = (PessoaFisica) pessoaFactory.create(EnumTipoPessoa.FISICA);
        System.out.println(pessoaFisica);
    }
}
