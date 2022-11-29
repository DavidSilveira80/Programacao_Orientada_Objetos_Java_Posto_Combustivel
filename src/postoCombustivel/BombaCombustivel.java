package postoCombustivel;

//TODO Refatorar os métodos e fazer melhorias
public class BombaCombustivel {
    //Atributos
    String tipoCombustivel;
    float valorPorLitro;
    float quantidadeDeCombustivel;

    public BombaCombustivel(float quantidadeDeCombustivel, float valorPorLitro, String tipoCombustivel){
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.tipoCombustivel = tipoCombustivel;
    }

    public float abastecerPorLitro(float qtdLitros){
        float pagarValor = qtdLitros * valorPorLitro;
        return pagarValor;
    }

    public float abastecerPorValor(float v){
        float litrosPorValor = v / valorPorLitro;
        quantidadeDeCombustivel -= litrosPorValor;
        return litrosPorValor;
    }

    public String consultar(){
       String saidaConsulta = "";
       saidaConsulta = String.format("Tipo de Combustivel: %s\nValor por Litro: R$ %.2f\n" +
                "Litros em Estoque: %3f\n", tipoCombustivel, valorPorLitro,  quantidadeDeCombustivel);
        return saidaConsulta;
    }
    public void alterarTipoCombustivel(char comb){
        if(comb == 'G'){
            tipoCombustivel = "Gasolina";
            System.out.printf("Tipo de Combustivel alterado para: %s.\n", tipoCombustivel);
        }else if(comb == 'D'){
            tipoCombustivel = "Diesel";
            System.out.printf("Tipo de Combustivel alterado para: %s.\n", tipoCombustivel);
        }else if(comb == 'A'){
            tipoCombustivel = "Álcool";
            System.out.printf("Tipo de Combustivel alterado para: %s.\n", tipoCombustivel);
        }else if(comb == 'E'){
            tipoCombustivel = "Etanol";
            System.out.printf("Tipo de Combustivel alterado para: %s.\n", tipoCombustivel);
        }
    }
    public void alterarValorPorLitro(float vl){
        valorPorLitro = vl;
        System.out.printf("Valor por Litro alterado para: R$ %.2f.\n", valorPorLitro);
    }
    public void alterarLitrosEstoque(float le){
        quantidadeDeCombustivel = le;
        System.out.printf("Litros em Estoque alterado para: %.3f\n", quantidadeDeCombustivel);
    }
}
