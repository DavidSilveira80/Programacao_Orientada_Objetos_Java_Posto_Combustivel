package postoCombustivel;

import java.util.ArrayList;


import static postoCombustivel.Utilidades.clearTerminal;
import static postoCombustivel.Utilidades.entradaChar;

public class Abastecer {
    public static char fluxoMenuAbastecer(){
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            Telas.gerarMenuAbastecerTipoCombustivel();
            caractere = entradaChar();
        }
        return caractere;
    }

    public static void geraMenuAbastecer(ArrayList<BombaCombustivel> arrayBombas){
        switch(fluxoMenuAbastecer()) {
            case 'G':
                System.out.println("ABASTECENDO GASOLINA");
                BombaCombustivel bombaGasolina = MetodosDePesquisaEBusca.retornaBomba(arrayBombas,
                        "GASOLINA");
                TipoAbastecimento.geraMenuTipoAbastecimento(bombaGasolina);
                break;
            case 'D':
                clearTerminal();

                clearTerminal();
                break;
            case 'A':
                clearTerminal();

                clearTerminal();
                break;
            case 'E':
                clearTerminal();

                clearTerminal();
                break;
            default:
                Telas.gerarCabecalhoOpcaoInvalida();
        }

    }
}
