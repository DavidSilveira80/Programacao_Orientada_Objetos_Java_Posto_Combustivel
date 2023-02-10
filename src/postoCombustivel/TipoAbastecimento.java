package postoCombustivel;

import static java.lang.System.out;
import static postoCombustivel.Telas.gerarCabecalhoOpcaoInvalida;
import static postoCombustivel.Telas.gerarTelaTipoDeAbastecimento;
import static postoCombustivel.Utilidades.entradaChar;
import static postoCombustivel.Utilidades.entradaDouble;

public class TipoAbastecimento {
    public static char fluxoMenuTipoAbastecimento(){
        gerarTelaTipoDeAbastecimento();
        char caractere;
        caractere = entradaChar();
        while (caractere != 'V' && caractere != 'L') {
            gerarTelaTipoDeAbastecimento();
            caractere = entradaChar();
        }
        return caractere;
    }

    public static void geraMenuTipoAbastecimento(BombaCombustivel tipoBomba){
        switch(fluxoMenuTipoAbastecimento()){
            case 'L':
                out.println("ABASTECER POR LITRO");
                out.print("Informe quantos Litros você quer abastecer: ");
                double litros = entradaDouble();
                out.println(tipoBomba.abastecerPorLitro(litros));
                break;
            case 'V':
                out.println("ABASTECER POR VALOR");
                out.print("Informe o valor que você quer abastecer: R$ ");
                double valor = entradaDouble();
                tipoBomba.abastecerPorValor(valor);
                break;
            default:
                gerarCabecalhoOpcaoInvalida();
        }
    }

}
