package factory.model;

/**
 * Classe responsável por instanciar factory de acordo com entidade passada por parâmetro
 */
public class FactoryProvider {

    public static <T> IAbstractFactory getFactory(T entitidaFactory){
        if(entitidaFactory.equals(IPessoa.class)){
            return new PessoaFactory();
        } else if(entitidaFactory.equals("Outra classe factory responsável por criar uma entidade")){

        }
        return null;
    }
}
