package postoCombustivel;

import java.util.ArrayList;

import static postoCombustivel.MetodosAuxiliares.*;
import static postoCombustivel.Utilidades.entradaChar;

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
            System.out.print("Informe o Estoque em Litros: ");
            double estoqueCombustivel = Utilidades.entradaDouble();
            System.out.print("Informe o valor por Litro: R$ ");
            double valorPorCombustivel = Utilidades.entradaDouble();
            arrayCombustivelBomba.add(new BombaCombustivel(tipoCombustivel, valorPorCombustivel, estoqueCombustivel));
        }else{
            System.out.println("Bomba de combustível tipo " + tipoCombustivel + "já existe.");
        }
    }
    public static void geraMenuCriaBombas(ArrayList<BombaCombustivel> arrayBombas){
        switch(fluxoMenuGeraBomba()){
            case 'G':
                clearTerminal();
                System.out.flush();
                Telas.gerarCabecalhoGerarBombaCombustivel("GASOLINA");
                criaBombas(arrayBombas, "GASOLINA");
                Telas.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'D':
                clearTerminal();
                Telas.gerarCabecalhoGerarBombaCombustivel("DIESEL");
                criaBombas(arrayBombas, "DIESEL");
                Telas.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'A':
                clearTerminal();
                Telas.gerarCabecalhoGerarBombaCombustivel("ÁLCOOL");
                criaBombas(arrayBombas, "ÁLCOOL");
                Telas.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'E':
                clearTerminal();
                Telas.gerarCabecalhoGerarBombaCombustivel("ETANOL");
                criaBombas(arrayBombas, "ETANOL");
                Telas.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            default:
                Telas.gerarCabecalhoOpcaoInvalida();
        }
    }
}
