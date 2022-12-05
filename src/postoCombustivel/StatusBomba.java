package postoCombustivel;

import java.util.ArrayList;

import static postoCombustivel.Utilidades.clearTerminal;
import static postoCombustivel.MetodosDePesquisaEBusca.consultaBomba;
import static postoCombustivel.Utilidades.entradaChar;

public class StatusBomba {
    public static char fluxoMenuStatusBomba(){
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            Telas.gerarMenuStatusDaBomba();
            caractere = entradaChar();
        }
        return caractere;
    }

    public static void geraMenuStatusBomba(ArrayList<BombaCombustivel> arrayBombas){
        switch(fluxoMenuStatusBomba()) {
            case 'G':
                clearTerminal();
                System.out.flush();
                System.out.println(consultaBomba(arrayBombas, "GASOLINA"));
                clearTerminal();
                break;
            case 'D':
                clearTerminal();
                System.out.println(consultaBomba(arrayBombas, "DIESEL"));
                clearTerminal();
                break;
            case 'A':
                clearTerminal();
                System.out.println(consultaBomba(arrayBombas, "ÁLCOOL"));
                clearTerminal();
                break;
            case 'E':
                clearTerminal();
                System.out.println(consultaBomba(arrayBombas, "ETANOL"));
                clearTerminal();
                break;
            default:
                Telas.gerarCabecalhoOpcaoInvalida();
        }

    }
}
