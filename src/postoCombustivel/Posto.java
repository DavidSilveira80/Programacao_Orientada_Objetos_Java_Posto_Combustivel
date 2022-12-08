package postoCombustivel;
//TODO refatorar métodos de abastecimento

import java.util.ArrayList;
import java.util.Locale;

import static postoCombustivel.Utilidades.entradaInteira;

public class Posto {

    public static int fluxoMenuPrincipal() {
        int numero;
        numero = entradaInteira();
        while (numero != 1 && numero != 2 && numero != 3 && numero != 4) {
            Telas.gerarMenuPrincipal();
            numero = entradaInteira();
        }
        return numero;
    }
    
    public static void main(String[] args) {
        ArrayList<BombaCombustivel> arrayBombasCombustivel = new ArrayList<>();
        Locale.setDefault(Locale.US);
        
        Telas.gerarCabecalhoBoasVindas();
        int parada = 1;
        while (parada == 1) {
            Telas.gerarMenuPrincipal();
            switch (fluxoMenuPrincipal()) {
                case 1:
                    Utilidades.clearTerminal();
                    Telas.gerarMenuGerarBomba();
                    CriaBombas.geraMenuCriaBombas(arrayBombasCombustivel);
                    break;
                case 2:
                    Utilidades.clearTerminal();
                    Telas.gerarMenuStatusDaBomba();
                    StatusBomba.geraMenuStatusBomba(arrayBombasCombustivel);
                  break;
                case 3:
                    Utilidades.clearTerminal();
                    Telas.gerarMenuAbastecerTipoCombustivel();
                    Abastecer.geraMenuAbastecer(arrayBombasCombustivel);
                    break;
                case 4:
                    Utilidades.clearTerminal();
                    System.out.println("ENCERRANDO. VOLTE SEMPRE.");
                    parada = 2;
                    break;
                default:
                    Utilidades.clearTerminal();
                    Telas.gerarCabecalhoOpcaoInvalida();
            }
        }
    }
}
