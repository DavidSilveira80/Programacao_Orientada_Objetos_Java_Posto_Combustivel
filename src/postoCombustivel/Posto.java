package postoCombustivel;
//TODO implementar abaster
//TODO implementar Abastecer por Valor
//TODO implementar Abastecer por Litro

import java.util.Locale;
public class Posto {
    
    public static void main(String[] args) {
        BombaCombustivel[] arrayBombasCombustivel = new BombaCombustivel[4];

        BombaCombustivel bombaPostoGasolina = new BombaCombustivel("GASOLINA");
        BombaCombustivel bombaPostoDiesel =  new BombaCombustivel("DIESEL");
        BombaCombustivel bombaPostoAlcool =  new BombaCombustivel("ALCOOL");
        BombaCombustivel bombaPostoEtanol =  new BombaCombustivel("ETANOL");

        arrayBombasCombustivel[0] = bombaPostoGasolina;
        arrayBombasCombustivel[1] = bombaPostoDiesel;
        arrayBombasCombustivel[2] = bombaPostoAlcool;
        arrayBombasCombustivel[3] = bombaPostoEtanol;
        Locale.setDefault(Locale.US);
        
        Telas.gerarCabecalhoBoasVindas();
        int parada = 1;
        while (parada == 1) {
            Telas.gerarMenuPrincipal();
            switch (MetodosAuxiliares.fluxoMenuPrincipal()) {
                case 1:
                    MetodosAuxiliares.clearTerminal();
                    Telas.gerarMenuGerarBomba();
                    MetodosAuxiliares.geraMenuGeraBombas(arrayBombasCombustivel);
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
