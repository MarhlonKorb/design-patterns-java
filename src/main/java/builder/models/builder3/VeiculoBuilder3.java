package builder.models.builder3;

import builder.models.Veiculo;
import builder.models.enums.EnumTipoVeiculo;

/**
 * Builder que estende classe abstrata com métodos que podem ser implementados na classe filha para poder criar lógicas diferentes de criação
 */
public class VeiculoBuilder3 extends Builder3{

    private String modelo;
    private EnumTipoVeiculo tipo;
    private Integer anoFabricacao;

    public VeiculoBuilder3(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setTipo(EnumTipoVeiculo tipo) {
        super.setTipo(tipo);
    }

    public Veiculo create(){
        return new Veiculo(modelo, tipo, anoFabricacao);
    }
}
