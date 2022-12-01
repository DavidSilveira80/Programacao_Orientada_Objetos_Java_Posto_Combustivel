package postoCombustivel;
//TODO Implementar Abastecimento
// TODO implementar cabeçalhos e menus
import java.util.Locale;
import java.util.Scanner;
public class Posto {
    public static void main(String[] args) {
        BombaCombustivel bombaPostoGasolina = new BombaCombustivel(0.0, 0.0, " ");
        BombaCombustivel bombaPostoDiesel =  new BombaCombustivel(0.0, 0.0, " ");
        BombaCombustivel bombaPostoAlcool =  new BombaCombustivel(0.0, 0.0, " ");
        BombaCombustivel bombaPostoEtanol =  new BombaCombustivel(0.0, 0.0, " ");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        CabecalhosEMenus.gerarCabecalhoBoasVindas();
        int parada = 1;
        while (parada == 1) {
            CabecalhosEMenus.gerarMenuPrincipal();
            System.out.print("Informe opção: ");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    CabecalhosEMenus.gerarMenuGerarBomba();
                    System.out.print("Informe sua escolha: ");
                    char tipoCombustivel = entrada.next().charAt(0);
                    switch(tipoCombustivel){
                        case 'G':
                            System.out.println();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("GASOLINA");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueGasolina = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroGasolina = entrada.nextDouble();
                            bombaPostoGasolina.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoGasolina.alterarLitrosEstoque(estoqueGasolina);
                            bombaPostoGasolina.alterarValorPorLitro(valorPorLitroGasolina);
                            System.out.println();
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            System.out.println(bombaPostoGasolina.consultar());
                            System.out.println();
                            break;
                        case 'D':
                            System.out.println();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("DIESEL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueDiesel = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroDiesel = entrada.nextDouble();
                            bombaPostoDiesel.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoDiesel.alterarLitrosEstoque(estoqueDiesel);
                            bombaPostoDiesel.alterarValorPorLitro(valorPorLitroDiesel);
                            System.out.println();
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            System.out.println(bombaPostoDiesel.consultar());
                            System.out.println();
                            break;
                        case 'A':
                            System.out.println();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("ÁLCOOL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueAlcool = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroAlcool = entrada.nextDouble();
                            bombaPostoAlcool.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoAlcool.alterarLitrosEstoque(estoqueAlcool);
                            bombaPostoAlcool.alterarValorPorLitro(valorPorLitroAlcool);
                            System.out.println();
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            System.out.println(bombaPostoAlcool.consultar());
                            System.out.println();
                            break;
                        case 'E':
                            System.out.println();
                            CabecalhosEMenus.gerarCabecalhoGerarBombaCombustivel("ETANOL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueEtanol = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroEtanol = entrada.nextDouble();
                            bombaPostoEtanol.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoEtanol.alterarLitrosEstoque(estoqueEtanol);
                            bombaPostoEtanol.alterarValorPorLitro(valorPorLitroEtanol);
                            System.out.println();
                            CabecalhosEMenus.gerarMensagemGerandoBombaDeCombustivel();
                            System.out.println(bombaPostoEtanol.consultar());
                            System.out.println();
                            break;
                        default:
                            CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
                    }
                    break;
                case 2:
                    System.out.println();
                    CabecalhosEMenus.gerarMenuStatusDaBomba();
                    System.out.print("Informe sua escolha: ");
                    char consultaBomba = entrada.next().charAt(0);
                    switch(consultaBomba){
                        case 'G':
                            CabecalhosEMenus.gerarCabecalhoConsultandoStatusBomba("GASOLINA");
                            System.out.println(bombaPostoGasolina.consultar());
                            System.out.println();
                            break;

                        case 'D':
                            CabecalhosEMenus.gerarCabecalhoConsultandoStatusBomba("DIESEL");
                            System.out.println(bombaPostoDiesel.consultar());
                            System.out.println();
                            break;

                        case 'A':
                            CabecalhosEMenus.gerarCabecalhoConsultandoStatusBomba("ÁLCOOL");
                            System.out.println(bombaPostoAlcool.consultar());
                            System.out.println();
                            break;

                        case 'E':
                            CabecalhosEMenus.gerarCabecalhoConsultandoStatusBomba("ETANOL");
                            System.out.println(bombaPostoEtanol.consultar());
                            System.out.println();
                            break;

                        default:
                            CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
                    }
                    break;
                case 4:
                    System.out.println("ENCERRANDO. VOLTE SEMPRE.");
                    parada = 2;
                    break;
                default:
                    CabecalhosEMenus.gerarCabecalhoOpcaoInvalida();
            }
        }
    }
}
