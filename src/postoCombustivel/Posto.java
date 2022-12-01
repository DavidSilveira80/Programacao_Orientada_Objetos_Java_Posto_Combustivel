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
        CabecalhosEMenus cabecalhosMenus = new CabecalhosEMenus();
        Locale.setDefault(Locale.US);
        
        cabecalhosMenus.gerarCabecalhoBoasVindas();
        int parada = 1;
        while (parada == 1) {
            cabecalhosMenus.gerarMenuPrincipal();
            
            switch (Util.fluxoMenuPrincipal()) {
                case 1:
                    Util.clearTerminal();
                    cabecalhosMenus.gerarMenuGerarBomba(); 
                    
                    switch( Util.fluxoMenuGeraBomba()){
                        case 'G':
                            Util.clearTerminal();
                            System.out.flush();
                            System.out.println();
                            cabecalhosMenus.gerarCabecalhoGerarBombaCombustivel("GASOLINA");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueGasolina = Util.entradaDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroGasolina = Util.entradaDouble();
                            bombaPostoGasolina.alterarTipoCombustivel('G');
                            bombaPostoGasolina.alterarLitrosEstoque(estoqueGasolina);
                            bombaPostoGasolina.alterarValorPorLitro(valorPorLitroGasolina);
                            System.out.println();
                            cabecalhosMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        case 'D':
                            Util.clearTerminal();
                            System.out.println();
                            cabecalhosMenus.gerarCabecalhoGerarBombaCombustivel("DIESEL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueDiesel = Util.entradaDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroDiesel = Util.entradaDouble();
                            bombaPostoDiesel.alterarTipoCombustivel('D');
                            bombaPostoDiesel.alterarLitrosEstoque(estoqueDiesel);
                            bombaPostoDiesel.alterarValorPorLitro(valorPorLitroDiesel);
                            System.out.println();
                            cabecalhosMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        case 'A':
                            Util.clearTerminal();
                            System.out.println();
                            cabecalhosMenus.gerarCabecalhoGerarBombaCombustivel("ÁLCOOL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueAlcool = Util.entradaDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroAlcool = Util.entradaDouble();
                            bombaPostoAlcool.alterarTipoCombustivel('A');
                            bombaPostoAlcool.alterarLitrosEstoque(estoqueAlcool);
                            bombaPostoAlcool.alterarValorPorLitro(valorPorLitroAlcool);
                            System.out.println();
                            cabecalhosMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        case 'E':
                            Util.clearTerminal();
                            System.out.println();
                            cabecalhosMenus.gerarCabecalhoGerarBombaCombustivel("ETANOL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueEtanol = Util.entradaDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroEtanol = Util.entradaDouble();
                            bombaPostoEtanol.alterarTipoCombustivel('E');
                            bombaPostoEtanol.alterarLitrosEstoque(estoqueEtanol);
                            bombaPostoEtanol.alterarValorPorLitro(valorPorLitroEtanol);
                            System.out.println();
                            cabecalhosMenus.gerarMensagemGerandoBombaDeCombustivel();
                            Util.clearTerminal();
                            break;
                        default:
                            cabecalhosMenus.gerarCabecalhoOpcaoInvalida();
                    }
                    break;
                case 2:
                    Util.clearTerminal();
                    System.out.println();
                    cabecalhosMenus.gerarMenuStatusDaBomba();
                    System.out.print("Informe sua escolha: ");
                    char consultaBomba = Util.entradaChar();
                    switch(consultaBomba){
                        case 'G':
                            Util.clearTerminal();
                            cabecalhosMenus.gerarCabecalhoConsultandoStatusBomba("GASOLINA");
                            System.out.println(bombaPostoGasolina.consultar());
                            System.out.println();
                            break;

                        case 'D':
                            Util.clearTerminal();
                            cabecalhosMenus.gerarCabecalhoConsultandoStatusBomba("DIESEL");
                            System.out.println(bombaPostoDiesel.consultar());
                            System.out.println();
                            break;

                        case 'A':
                            Util.clearTerminal();
                            cabecalhosMenus.gerarCabecalhoConsultandoStatusBomba("ÁLCOOL");
                            System.out.println(bombaPostoAlcool.consultar());
                            System.out.println();
                            break;

                        case 'E':
                            Util.clearTerminal();
                            cabecalhosMenus.gerarCabecalhoConsultandoStatusBomba("ETANOL");
                            System.out.println(bombaPostoEtanol.consultar());
                            System.out.println();
                            break;

                        default:
                            cabecalhosMenus.gerarCabecalhoOpcaoInvalida();
                    }
                    break;
                case 4:
                    Util.clearTerminal();
                    System.out.println("ENCERRANDO. VOLTE SEMPRE.");
                    parada = 2;
                    break;
                default:
                    cabecalhosMenus.gerarCabecalhoOpcaoInvalida();
            }
        }
    }
}
