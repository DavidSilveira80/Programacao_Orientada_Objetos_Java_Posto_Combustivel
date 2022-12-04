package postoCombustivel;

import java.util.ArrayList;
import java.util.Scanner;

import static postoCombustivel.Utilidades.*;

public class MetodosAuxiliares {
    //FLUXOS MENUS

    public static int fluxoMenuPrincipal() {
        int numero;
        numero = entradaInteira();
        while (numero != 1 && numero != 2 && numero != 4) {
            Telas.gerarMenuPrincipal();
            numero = entradaInteira();
        }
        return numero;
    }

    public static char fluxoMenuGeraBomba() {
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            Telas.gerarMenuGerarBomba();
            caractere = entradaChar();
        }
        return caractere;

    }

    public static char fluxoMenuStatusBomba(){
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            Telas.gerarMenuStatusDaBomba();
            caractere = entradaChar();
        }
        return caractere;
    }

    public static void clearTerminal() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //GERADOR DE BOMBAS

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
    // Status Bomba

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
    public static boolean existeBombaCombustivel(ArrayList<BombaCombustivel> arrayBombas, String tipoDeBomba){
        boolean resposta = false;

        for(BombaCombustivel bomba : arrayBombas){
            if(bomba.getTipoCombustivel().equals(tipoDeBomba)){
                resposta = true;
            }else{
                resposta = false;
            }
        }
        return resposta;
    }

    public static String consultaBomba(ArrayList<BombaCombustivel> arrayDebombas, String tipoDeBomba){
        String resp = "";
        if(existeBombaCombustivel(arrayDebombas, tipoDeBomba) == true){
            int index = 600;
            for(BombaCombustivel bombaPosto : arrayDebombas){
                if(bombaPosto.getTipoCombustivel().equals(tipoDeBomba)){
                    resp = bombaPosto.consultar();
                }
            }

        }else{
            resp = "Tipo de Bomba inexistente";
        }
        return resp;
    }

}
