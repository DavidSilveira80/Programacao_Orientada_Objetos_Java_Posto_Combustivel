package postoCombustivel;

import static postoCombustivel.Utilidades.*;

public class MetodosAuxiliares {
    //FLUXOS MENUS

    public static int fluxoMenuPrincipal() {
        int numero;
        numero = entradaInteira();
        while (numero != 1 && numero != 2 && numero != 4) {
            CabecalhosEMenus.gerarMenuPrincipal();
            numero = entradaInteira();
        }
        return numero;
    }

    public static char fluxoMenuGeraBomba() {
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            CabecalhosEMenus.gerarMenuGerarBomba();
            caractere = entradaChar();
        }
        return caractere;

    }

    public static char fluxoMenuStatusBomba(){
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            CabecalhosEMenus.gerarMenuStatusDaBomba();
            caractere = entradaChar();
        }
        return caractere;
    }

    public static void clearTerminal() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //GERADOR DE BOMBAS

    public static void geraBombas(BombaCombustivel combustivelBomba) {
        System.out.print("Informe o Estoque em Litros: ");
        double estoqueCombustivel = Utilidades.entradaDouble();
        System.out.print("Informe o valor por Litro: R$ ");
        double valorPorCombustivel = Utilidades.entradaDouble();
        combustivelBomba.alterarLitrosEstoque(estoqueCombustivel);
        combustivelBomba.alterarValorPorLitro(valorPorCombustivel);

    }
    // Status Bomba

    public static void geraStatusDaBomba(BombaCombustivel combustivelBomba, String combustivel){
        CabecalhosEMenus.gerarCabecalhoConsultandoStatusBomba(combustivel);
        System.out.println(combustivelBomba.consultar());
    }

    public static void geraMenuGeraBombas(BombaCombustivel... arrayBombas){
        switch(fluxoMenuGeraBomba()){
            case 'G':
                clearTerminal();
                System.out.flush();
                CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("GASOLINA");
                geraBombas(arrayBombas[0]);
                CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'D':
                clearTerminal();
                CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("DIESEL");
                geraBombas(arrayBombas[1]);
                CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'A':
                clearTerminal();
                CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("ÁLCOOL");
                geraBombas(arrayBombas[2]);
                CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            case 'E':
                clearTerminal();
                CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("ETANOL");
                geraBombas(arrayBombas[3]);
                CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                clearTerminal();
                break;
            default:
                CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
        }

    }
    public static void geraMenuStatusBomba(BombaCombustivel... arrayBombas){
        switch(fluxoMenuStatusBomba()){
            case 'G':
                clearTerminal();
                geraStatusDaBomba(arrayBombas[0], "GASOLINA");
                break;
            case 'D':
                clearTerminal();
                geraStatusDaBomba(arrayBombas[1], "DIESEL");
                break;
            case 'A':
                clearTerminal();
                geraStatusDaBomba(arrayBombas[2], "ÁLCOOL");
                break;
            case 'E':
                clearTerminal();
                geraStatusDaBomba(arrayBombas[3], "ETANOL");
                break;
            default:
                CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
        }
    }
}
