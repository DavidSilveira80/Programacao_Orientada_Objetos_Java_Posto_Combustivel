package postoCombustivel;

import java.util.ArrayList;
import static java.lang.System.out;

import static postoCombustivel.MetodosDePesquisaEBusca.*;
import static postoCombustivel.Telas.*;
import static postoCombustivel.Utilidades.*;

public class CriaBombas {
    //GERADOR DE BOMBAS

    public static char fluxoMenuGeraBomba() {
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            Telas.gerarMenuGerarBomba();
            caractere = entradaChar();
        }
        return caractere;

    }

    public static void criaBombas(ArrayList<BombaCombustivel> arrayCombustivelBomba, String tipoCombustivel) {
        if(existeBombaCombustivel(arrayCombustivelBomba, tipoCombustivel) == false) {
            out.print("Informe o Estoque em Litros: ");
            double estoqueCombustivel = Utilidades.entradaDouble();
            out.print("Informe o valor por Litro: R$ ");
            double valorPorCombustivel = Utilidades.entradaDouble();
            arrayCombustivelBomba.add(new BombaCombustivel(tipoCombustivel, valorPorCombustivel, estoqueCombustivel));
        }else{
            out.println("Bomba de combustível tipo " + tipoCombustivel + "já existe.");
        }
    }
    public static void geraMenuCriaBombas(ArrayList<BombaCombustivel> arrayBombas){
        switch(fluxoMenuGeraBomba()){
            case 'G':
                clearTerminal();
                out.flush();
                gerarCabecalhoGerarBombaCombustivel("GASOLINA");
                criaBombas(arrayBombas, "GASOLINA");
                gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'D':
                clearTerminal();
                gerarCabecalhoGerarBombaCombustivel("DIESEL");
                criaBombas(arrayBombas, "DIESEL");
                gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'A':
                clearTerminal();
                gerarCabecalhoGerarBombaCombustivel("ÁLCOOL");
                criaBombas(arrayBombas, "ÁLCOOL");
                gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'E':
                clearTerminal();
                gerarCabecalhoGerarBombaCombustivel("ETANOL");
                criaBombas(arrayBombas, "ETANOL");
                gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            default:
                gerarCabecalhoOpcaoInvalida();
        }
    }
}
