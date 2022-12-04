package postoCombustivel;
//TODO implementar abaster
//TODO implementar Abastecer por Valor
//TODO implementar Abastecer por Litro

import java.util.ArrayList;
import java.util.Locale;
public class Posto {
    
    public static void main(String[] args) {
        ArrayList<BombaCombustivel> arrayBombasCombustivel = new ArrayList<>();



        Locale.setDefault(Locale.US);
        
        Telas.gerarCabecalhoBoasVindas();
        int parada = 1;
        while (parada == 1) {
            Telas.gerarMenuPrincipal();
            switch (MetodosAuxiliares.fluxoMenuPrincipal()) {
                case 1:
                    MetodosAuxiliares.clearTerminal();
                    Telas.gerarMenuGerarBomba();
                    MetodosAuxiliares.geraMenuCriaBombas(arrayBombasCombustivel);
                    break;
                case 2:
                    MetodosAuxiliares.clearTerminal();
                   Telas.gerarMenuStatusDaBomba();
                  MetodosAuxiliares.geraMenuStatusBomba(arrayBombasCombustivel);
                  break;
                case 4:
                    MetodosAuxiliares.clearTerminal();
                    System.out.println("ENCERRANDO. VOLTE SEMPRE.");
                    parada = 2;
                    break;
                default:
                    MetodosAuxiliares.clearTerminal();
                    Telas.gerarCabecalhoOpcaoInvalida();
            }
        }
    }
}
