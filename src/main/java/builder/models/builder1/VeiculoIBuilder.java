package builder.models.builder1;

import builder.models.Veiculo;
import builder.models.enums.EnumTipoVeiculo;

/**
 * Builder que trabalha com uma interface que necessita implementar os métodos da interface
 */
public class VeiculoIBuilder implements IBuilder {

    private String modelo;
    private EnumTipoVeiculo tipo;
    private Integer anoFabricacao;

    @Override
    public VeiculoIBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public VeiculoIBuilder setTipo(EnumTipoVeiculo tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public VeiculoIBuilder setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
        return this;
    }

    public Veiculo create() {
        return new Veiculo(modelo, tipo, anoFabricacao);
    }
}
