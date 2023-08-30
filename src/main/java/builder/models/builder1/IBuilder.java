package builder.models.builder1;

import builder.models.enums.EnumTipoVeiculo;

public interface IBuilder {

    IBuilder setModelo(String modelo);
    IBuilder setTipo(EnumTipoVeiculo tipo);
    IBuilder setAnoFabricacao(Integer anoFabricacao);
}
