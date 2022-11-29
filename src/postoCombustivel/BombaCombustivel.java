package postoCombustivel;

//TODO refatorar tipos e nomes das variáveis
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

    public String abastecerPorLitro(float qtdLitros){
        float pagarValor = qtdLitros * valorPorLitro;
        quantidadeDeCombustivel -= qtdLitros;
        return String.format("%.2f", pagarValor);
    }

    public String abastecerPorValor(float v){
        float litrosPorValor = v / valorPorLitro;
        quantidadeDeCombustivel -= litrosPorValor;
        float pagarValor = litrosPorValor * valorPorLitro;
        return String.format("%.2f", pagarValor);
    }

    public String consultar(){
       String saidaConsulta = "";
       saidaConsulta = String.format("Tipo de Combustivel: %s\nValor por Litro: R$ %.2f\n" +
                "Litros em Estoque: %.3f\n", tipoCombustivel, valorPorLitro,  quantidadeDeCombustivel);
        return saidaConsulta;
    }

    public String alterarTipoCombustivel(char comb){
        String saidaAlterarTipoCombustivel = "";
        if(comb == 'G'){
            tipoCombustivel = "Gasolina";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", tipoCombustivel);
        }else if(comb == 'D'){
            tipoCombustivel = "Diesel";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", tipoCombustivel);
        }else if(comb == 'A'){
            tipoCombustivel = "Álcool";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", tipoCombustivel);
        }else if(comb == 'E'){
            tipoCombustivel = "Etanol";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", tipoCombustivel);
        }
        return saidaAlterarTipoCombustivel;
    }

    public String alterarValorPorLitro(float vl){
        String saidaAlterarValorporLitro = "";
        valorPorLitro = vl;
        saidaAlterarValorporLitro = String.format("Valor por Litro alterado para: R$ %.2f.", valorPorLitro);
        return saidaAlterarValorporLitro;
    }
    public String alterarLitrosEstoque(float le){
        quantidadeDeCombustivel = le;
        return String.format("Litros em Estoque alterado para: %.3f.", quantidadeDeCombustivel);
    }
}
