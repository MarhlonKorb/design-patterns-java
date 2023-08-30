package builder;

import builder.models.Veiculo;
import builder.models.builder1.VeiculoIBuilder;
import builder.models.builder2.VeiculoBuilder2;
import builder.models.builder3.VeiculoBuilder3;
import builder.models.enums.EnumTipoVeiculo;

public class main {
    public static void main(String[] args) {

        VeiculoIBuilder veiculoBuilder1 = new VeiculoIBuilder();
        Veiculo veiculo = veiculoBuilder1.setModelo("Yamaha")
                .setAnoFabricacao(2023)
                .setTipo(EnumTipoVeiculo.MOTO).create();
        System.out.println("Builder 1: \n" + veiculo.toString());

        Veiculo veiculo2 = new VeiculoBuilder2.Builder("Onix").setTipo(EnumTipoVeiculo.CARRO).create();
        System.out.println("\nBuilder 2: \n" + veiculo2.toString());

        VeiculoBuilder3 veiculoBuilder3 = new VeiculoBuilder3("Honda civic");
        Veiculo veiculo3 = veiculoBuilder3.create();
        System.out.println("\nBuilder 3: \n" + veiculo3.toString());
    }
}
