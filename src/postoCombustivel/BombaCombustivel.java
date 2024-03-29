package postoCombustivel;
import java.util.Locale;
import static java.lang.System.out;

public class BombaCombustivel {
    //Atributos
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeDeCombustivel;

    //Construtor
    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeDeCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
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
    public double  abastecerPorLitro(double litrosAbastecer){
        double pagarValor = litrosAbastecer * this.valorPorLitro;
        this.quantidadeDeCombustivel -= litrosAbastecer;
        out.println("++++++GERANDO NOTA+++++");
        out.printf("Litros de %s -> %.2f\n", this.tipoCombustivel, litrosAbastecer);
        out.printf("Valor Total -> R$ %.2f\n", pagarValor);
        return pagarValor;
    }

    public double abastecerPorValor(double valorAbastecer){
        Locale.setDefault(Locale.US);
        double litrosPorValor = valorAbastecer / this.valorPorLitro;
        this.quantidadeDeCombustivel -= litrosPorValor;
        out.println("++++++GERANDO NOTA+++++");
        out.printf("Litros de %s -> %.2f\n", this.tipoCombustivel, litrosPorValor);
        out.printf("Valor Total -> R$ %.2f\n", valorAbastecer);
        return litrosPorValor;
    }

    public String consultar(){
       String saidaConsulta = "";
       saidaConsulta = String.format("Tipo de Combustivel: %s\nValor por Litro: R$ %.2f\n" +
                "Litros em Estoque: %.3f\n", this.tipoCombustivel, this.valorPorLitro,  this.quantidadeDeCombustivel);
        return saidaConsulta;
    }

    public String alterarTipoCombustivel(char tipoDecombustivel){
        String saidaAlterarTipoCombustivel = "";
        switch(tipoDecombustivel){
            case 'G':
                this.tipoCombustivel = "Gasolina";
                saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                        "%s.", this.tipoCombustivel);
                break;
            case 'D':
                this.tipoCombustivel = "Diesel";
                saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                        "%s.", this.tipoCombustivel);
                break;

            case 'A':
                this.tipoCombustivel = "Álcool";
                saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                        "%s.", this.tipoCombustivel);
                break;
            case 'E':
                this.tipoCombustivel = "Etanol";
                saidaAlterarTipoCombustivel = String.format("Tipo de Combustivel alterado para: " +
                        "%s.", this.tipoCombustivel);
                break;
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
