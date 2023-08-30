package builder.models;

import builder.models.enums.EnumTipoVeiculo;

public class Veiculo {

    private String modelo;
    private EnumTipoVeiculo tipo;
    private Integer anoFabricacao;

    public Veiculo() {
    }

    public Veiculo(String modelo, EnumTipoVeiculo tipo, Integer anoFabricacao) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public EnumTipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "VeiculoBuilder2{" +
                "modelo='" + modelo + '\'' +
                ", tipo=" + tipo +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
