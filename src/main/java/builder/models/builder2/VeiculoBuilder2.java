package builder.models.builder2;

import builder.models.Veiculo;
import builder.models.enums.EnumTipoVeiculo;

/**
 * Classe com atributos final e Builder estático na classe para realizar a criação do objeto
 * Muito utilizado no paradigma funcional para trabalhar com objetos imutáveis
 */
public class VeiculoBuilder2 {
    private final String modelo;
    private final EnumTipoVeiculo tipo;
    private final Integer anoFabricacao;

    public VeiculoBuilder2(String modelo, EnumTipoVeiculo tipo, Integer anoFabricacao) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public EnumTipoVeiculo getTipo() {
        return tipo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * Builder estático na classe para realizar a criação do objeto
     */
    public static class Builder{
        /* Obrigatório */
        private String modelo;
        private EnumTipoVeiculo tipo;
        private Integer anoFabricacao;

        public Builder(String modelo) {
            this.modelo = modelo;
        }

        public Builder setTipo(EnumTipoVeiculo tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder setAnoFabricacao(Integer anoFabricacao) {
            this.anoFabricacao = anoFabricacao;
            return this;
        }

        public Veiculo create(){
            return new Veiculo(modelo, tipo, anoFabricacao);
        }
    }
}
