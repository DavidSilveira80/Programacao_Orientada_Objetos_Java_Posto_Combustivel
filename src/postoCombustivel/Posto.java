package postoCombustivel;
//TODO Implementar Abastecimento
// TODO implementar cabeçalhos e menus
import java.util.Locale;
public class Posto {
    
    public static void main(String[] args) {
        BombaCombustivel bombaPostoGasolina = new BombaCombustivel(0.0, 0.0, " ");
        BombaCombustivel bombaPostoDiesel =  new BombaCombustivel(0.0, 0.0, " ");
        BombaCombustivel bombaPostoAlcool =  new BombaCombustivel(0.0, 0.0, " ");
        BombaCombustivel bombaPostoEtanol =  new BombaCombustivel(0.0, 0.0, " ");
        Locale.setDefault(Locale.US);
        
        CabecalhosEMenus.gerarCabecalhoBoasVindas();
        int parada = 1;
        while (parada == 1) {
            CabecalhosEMenus.gerarMenuPrincipal();
            switch (Util.fluxoMenuPrincipal()) {
                case 1:
                    Util.clearTerminal();
                    CabecalhosEMenus.gerarMenuGerarBomba();
                    switch( Util.fluxoMenuGeraBomba()){
                        case 'G':
                            Util.clearTerminal();
                            System.out.flush();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("GASOLINA");
                            Util.geraBombas(bombaPostoGasolina);
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        case 'D':
                            Util.clearTerminal();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("DIESEL");
                            Util.geraBombas(bombaPostoDiesel);
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        case 'A':
                            Util.clearTerminal();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("ÁLCOOL");
                            Util.geraBombas(bombaPostoAlcool);
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        case 'E':
                            Util.clearTerminal();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("ETANOL");
                            Util.geraBombas(bombaPostoEtanol);
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        default:
                            CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
                    }
                    break;
                case 2:
                    Util.clearTerminal();
                    CabecalhosEMenus.gerarMenuStatusDaBomba();
                    switch(Util.fluxoMenuStatusBomba()){
                        case 'G':
                            Util.clearTerminal();
                            Util.geraStatusDaBomba(bombaPostoGasolina, "GASOLINA");
                            break;
                        case 'D':
                            Util.clearTerminal();
                            Util.geraStatusDaBomba(bombaPostoDiesel, "DIESEL");
                            break;
                        case 'A':
                            Util.clearTerminal();
                            Util.geraStatusDaBomba(bombaPostoAlcool, "ÁLCOOL");
                            break;
                        case 'E':
                            Util.clearTerminal();
                            Util.geraStatusDaBomba(bombaPostoEtanol, "ETANOL");
                            break;
                        default:
                            CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
                    }
                    break;
                case 4:
                    Util.clearTerminal();
                    System.out.println("ENCERRANDO. VOLTE SEMPRE.");
                    parada = 2;
                    break;
                default:
                    Util.clearTerminal();
                    CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
            }
        }
    }
}
