package postoCombustivel;


public class BombaCombustivel {
    //Atributos
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeDeCombustivel;

    //Construtor
    public BombaCombustivel(double quantidadeDeCombustivel, double valorPorLitro, String tipoCombustivel){
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.tipoCombustivel = tipoCombustivel;
    }
    //Getters e Setters

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    //Métodos
    public String abastecerPorLitro(double litrosAbastecer){
        double pagarValor = litrosAbastecer * this.valorPorLitro;
        this.quantidadeDeCombustivel -= litrosAbastecer;
        return String.format("%.2f", pagarValor);
    }

    public String abastecerPorValor(double valorAbastecer){
        double litrosPorValor = valorAbastecer / this.valorPorLitro;
        this.quantidadeDeCombustivel -= litrosPorValor;
        double pagarValor = litrosPorValor * this.valorPorLitro;
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

    public String alterarValorPorLitro(double novoValorPorLitro){
        String saidaAlterarValorporLitro = "";
        this.valorPorLitro = novoValorPorLitro;
        saidaAlterarValorporLitro = String.format("Valor por Litro alterado para: R$ %.2f.", this.valorPorLitro);
        return saidaAlterarValorporLitro;
    }

    public String alterarLitrosEstoque(double novoEstoqueLitro){
        this.quantidadeDeCombustivel = novoEstoqueLitro;
        return String.format("Litros em Estoque alterado para: %.3f.", this.quantidadeDeCombustivel);
    }
}
