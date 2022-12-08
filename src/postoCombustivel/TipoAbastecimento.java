package postoCombustivel;

import static postoCombustivel.Utilidades.entradaChar;

public class TipoAbastecimento {
    public static char fluxoMenuTipoAbastecimento(){
        char caractere;
        caractere = entradaChar();
        while (caractere != 'V' && caractere != 'L') {
            Telas.gerarMenuStatusDaBomba();
            caractere = entradaChar();
        }
        return caractere;
    }

    public static void geraMenuTipoAbastecimento(){
        switch(fluxoMenuTipoAbastecimento()){
            case 'L':
                break;
            case 'V':
                break;
            default:
                Telas.gerarCabecalhoOpcaoInvalida();
        }
    }


}
