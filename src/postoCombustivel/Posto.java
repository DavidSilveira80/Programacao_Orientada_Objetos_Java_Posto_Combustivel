package postoCombustivel;
//TODO refatorar métodos de abastecimento

import java.util.ArrayList;
import java.util.Locale;

import static postoCombustivel.StatusBomba.geraMenuStatusBomba;
import static postoCombustivel.Telas.*;
import static postoCombustivel.Utilidades.entradaInteira;
import static postoCombustivel.Utilidades.clearTerminal;
import static postoCombustivel.Abastecer.geraMenuAbastecer;
import static postoCombustivel.CriaBombas.*;


public class Posto {

    public static int fluxoMenuPrincipal() {
        int numero;
        numero = entradaInteira();
        while (numero != 1 && numero != 2 && numero != 3 && numero != 4) {
            gerarMenuPrincipal();
            numero = entradaInteira();
        }
        return numero;
    }
    
    public static void main(String[] args) {
        ArrayList<BombaCombustivel> arrayBombasCombustivel = new ArrayList<>();
        Locale.setDefault(Locale.US);
        
        gerarCabecalhoBoasVindas();
        int parada = 1;
        while (parada == 1) {
            gerarMenuPrincipal();
            switch (fluxoMenuPrincipal()) {
                case 1:
                    clearTerminal();
                    gerarMenuGerarBomba();
                    geraMenuCriaBombas(arrayBombasCombustivel);
                    break;
                case 2:
                    clearTerminal();
                    gerarMenuStatusDaBomba();
                    geraMenuStatusBomba(arrayBombasCombustivel);
                  break;
                case 3:
                    clearTerminal();
                    gerarMenuAbastecerTipoCombustivel();
                    geraMenuAbastecer(arrayBombasCombustivel);
                    break;
                case 4:
                    clearTerminal();
                    System.out.println("ENCERRANDO. VOLTE SEMPRE.");
                    parada = 2;
                    break;
                default:
                    clearTerminal();
                    gerarCabecalhoOpcaoInvalida();
            }
        }
    }
}
