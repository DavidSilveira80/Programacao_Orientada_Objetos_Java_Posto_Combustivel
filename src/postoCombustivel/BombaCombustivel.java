package postoCombustivel;

//TODO refatorar tipos e nomes das variáveis
public class BombaCombustivel {
    //Atributos
    String tipoCombustivel;
    float valorPorLitro;
    float quantidadeDeCombustivel;

    //Construtor
    public BombaCombustivel(float quantidadeDeCombustivel, float valorPorLitro, String tipoCombustivel){
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.tipoCombustivel = tipoCombustivel;
    }

    //Métodos
    public String abastecerPorLitro(float litrosAbastecer){
        float pagarValor = litrosAbastecer * this.valorPorLitro;
        this.quantidadeDeCombustivel -= litrosAbastecer;
        return String.format("%.2f", pagarValor);
    }

    public String abastecerPorValor(float valorAbastecer){
        float litrosPorValor = valorAbastecer / this.valorPorLitro;
        this.quantidadeDeCombustivel -= litrosPorValor;
        float pagarValor = litrosPorValor * this.valorPorLitro;
        return String.format("%.2f", pagarValor);
    }

    public String consultar(){
       String saidaConsulta = "";
       saidaConsulta = String.format("Tipo de Combustivel: %s\nValor por Litro: R$ %.2f\n" +
                "Litros em Estoque: %.3f\n", this.tipoCombustivel, this.valorPorLitro,  this.quantidadeDeCombustivel);
        return saidaConsulta;
    }

    public String alterarTipoCombustivel(char tipoDecombustivel){
        String saidaAlterarTipoCombustivel = "";
        if(tipoDecombustivel == 'G'){
            this.tipoCombustivel = "Gasolina";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", this.tipoCombustivel);
        }else if(tipoDecombustivel == 'D'){
            this.tipoCombustivel = "Diesel";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", this.tipoCombustivel);
        }else if(tipoDecombustivel == 'A'){
            this.tipoCombustivel = "Álcool";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", this.tipoCombustivel);
        }else if(tipoDecombustivel == 'E'){
            this.tipoCombustivel = "Etanol";
            saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                    "%s.", this.tipoCombustivel);
        }
        return saidaAlterarTipoCombustivel;
    }

    public String alterarValorPorLitro(float novoValorPorLitro){
        String saidaAlterarValorporLitro = "";
        this.valorPorLitro = novoValorPorLitro;
        saidaAlterarValorporLitro = String.format("Valor por Litro alterado para: R$ %.2f.", this.valorPorLitro);
        return saidaAlterarValorporLitro;
    }

    public String alterarLitrosEstoque(float novoEstoqueLitro){
        this.quantidadeDeCombustivel = novoEstoqueLitro;
        return String.format("Litros em Estoque alterado para: %.3f.", this.quantidadeDeCombustivel);
    }
}
