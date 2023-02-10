package postoCombustivel;

import java.util.ArrayList;
import static java.lang.System.out;


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
                out.println("ABASTECENDO GASOLINA");
                BombaCombustivel bombaGasolina = MetodosDePesquisaEBusca.retornaBomba(arrayBombas,
                        "GASOLINA");
                TipoAbastecimento.geraMenuTipoAbastecimento(bombaGasolina);
                break;
            case 'D':
                clearTerminal();
                System.out.println("ABASTECENDO DIESEL");
                BombaCombustivel bombaDiesel = MetodosDePesquisaEBusca.retornaBomba(arrayBombas,
                        "DIESEL");
                TipoAbastecimento.geraMenuTipoAbastecimento(bombaDiesel);
                clearTerminal();
                break;
            case 'A':
                clearTerminal();
                System.out.println("ABASTECENDO ÁLCOOL");
                BombaCombustivel bombaAlcool = MetodosDePesquisaEBusca.retornaBomba(arrayBombas,
                        "ALCOOL");
                TipoAbastecimento.geraMenuTipoAbastecimento(bombaAlcool);
                clearTerminal();
                break;
            case 'E':
                clearTerminal();
                System.out.println("ABASTECENDO ETANOL");
                BombaCombustivel bombaEtanol = MetodosDePesquisaEBusca.retornaBomba(arrayBombas,
                        "ETANOL");
                TipoAbastecimento.geraMenuTipoAbastecimento(bombaEtanol);
                clearTerminal();
                break;
            default:
                Telas.gerarCabecalhoOpcaoInvalida();
        }

    }
}
