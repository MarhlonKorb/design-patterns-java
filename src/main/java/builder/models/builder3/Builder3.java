package builder.models.builder3;

import builder.models.Veiculo;
import builder.models.enums.EnumTipoVeiculo;

public abstract class Builder3 {
protected Veiculo veiculo;

    public void setModelo(String modelo) {}

    public void setTipo(EnumTipoVeiculo tipo) {
    }

    public void setAnoFabricacao(Integer anoFabricacao) {}
}
