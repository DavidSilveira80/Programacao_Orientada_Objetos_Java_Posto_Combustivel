package postoCombustivel;

import static postoCombustivel.Utilidades.entradaChar;

public class TipoAbastecimento {
    public static char fluxoMenuTipoAbastecimento(){
        Telas.gerarTelaTipoDeAbastecimento();
        char caractere;
        caractere = entradaChar();
        while (caractere != 'V' && caractere != 'L') {
            Telas.gerarTelaTipoDeAbastecimento();
            caractere = entradaChar();
        }
        return caractere;
    }

    public static void geraMenuTipoAbastecimento(BombaCombustivel tipoBomba){
        switch(fluxoMenuTipoAbastecimento()){
            case 'L':
                System.out.println("ABASTECER POR LITRO");
                System.out.print("Informe quantos Litros você quer abastecer: ");
                double litros = Utilidades.entradaDouble();
                System.out.println(tipoBomba.abastecerPorLitro(litros));
                break;
            case 'V':
                System.out.println("ABASTECER POR VALOR");
                System.out.print("Informe o valor que você quer abastecer: R$ ");
                double valor = Utilidades.entradaDouble();
                tipoBomba.abastecerPorValor(valor);
                break;
            default:
                Telas.gerarCabecalhoOpcaoInvalida();
        }
    }

}
