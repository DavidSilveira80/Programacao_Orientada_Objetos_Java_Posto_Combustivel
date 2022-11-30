package postoCombustivel;
//TODO Implementar Abastecimento
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

        System.out.println("BEM-VINDO AO POSTO SILVEIRA");
        int parada = 1;
        while (parada == 1) {
            System.out.println("1 - Gerar Bomba de Combustível 2 - Consultar Status das Bombas 4 - Sair");
            System.out.print("Informe opção: ");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("GERAR BOMBA DE COMBUSTÍVEL.");
                    System.out.print("Informe o tipo de Combustível: (G) -> GASOLINA (D) -> DIESEL (A) -> ÁLCOOL (E) -> " +
                            "ETANOL:  ");
                    char tipoCombustivel = entrada.next().charAt(0);
                    switch(tipoCombustivel){
                        case 'G':
                            System.out.println();
                            System.out.println("GERAR BOMBA COMBUSTÍVEL GASOLINA");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueGasolina = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroGasolina = entrada.nextDouble();
                            bombaPostoGasolina.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoGasolina.alterarLitrosEstoque(estoqueGasolina);
                            bombaPostoGasolina.alterarValorPorLitro(valorPorLitroGasolina);
                            System.out.println();
                            System.out.println("GERANDO BOMBA DE COMBUSTÍVEL");
                            System.out.println(bombaPostoGasolina.consultar());
                            System.out.println();
                            break;
                        case 'D':
                            System.out.println();
                            System.out.println("GERAR BOMBA COMBUSTÍVEL DIESEL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueDiesel = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroDiesel = entrada.nextDouble();
                            bombaPostoDiesel.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoDiesel.alterarLitrosEstoque(estoqueDiesel);
                            bombaPostoDiesel.alterarValorPorLitro(valorPorLitroDiesel);
                            System.out.println();
                            System.out.println("GERANDO BOMBA DE COMBUSTÍVEL");
                            System.out.println(bombaPostoDiesel.consultar());
                            System.out.println();
                            break;
                        case 'A':
                            System.out.println();
                            System.out.println("GERAR BOMBA COMBUSTÍVEL ÁLCOOL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueAlcool = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroAlcool = entrada.nextDouble();
                            bombaPostoAlcool.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoAlcool.alterarLitrosEstoque(estoqueAlcool);
                            bombaPostoAlcool.alterarValorPorLitro(valorPorLitroAlcool);
                            System.out.println();
                            System.out.println("GERANDO BOMBA DE COMBUSTÍVEL");
                            System.out.println(bombaPostoAlcool.consultar());
                            System.out.println();
                            break;
                        case 'E':
                            System.out.println();
                            System.out.println("GERAR BOMBA COMBUSTÍVEL ETANOL");
                            System.out.print("Informe o Estoque em Litros: ");
                            double estoqueEtanol = entrada.nextDouble();
                            System.out.print("Informe o valor por Litro: R$ ");
                            double valorPorLitroEtanol = entrada.nextDouble();
                            bombaPostoEtanol.alterarTipoCombustivel(tipoCombustivel);
                            bombaPostoEtanol.alterarLitrosEstoque(estoqueEtanol);
                            bombaPostoEtanol.alterarValorPorLitro(valorPorLitroEtanol);
                            System.out.println();
                            System.out.println("GERANDO BOMBA DE COMBUSTÍVEL");
                            System.out.println(bombaPostoEtanol.consultar());
                            System.out.println();
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("CONSULTAR STATUS DAS BOMBAS");
                    System.out.print("Informe qual Bomba quer consultar: (G) -> GASOLINA (D) -> DIESEL (A) -> ÁLCOOL (E) -> " +
                            "ETANOL:  ");
                    char consultaBomba = entrada.next().charAt(0);
                    switch(consultaBomba){
                        case 'G':
                            System.out.println();
                            System.out.println("CONSULTANDO STATUS BOMBA GASOLINA");
                            System.out.println();
                            System.out.println(bombaPostoGasolina.consultar());
                            System.out.println();
                            break;

                        case 'D':
                            System.out.println();
                            System.out.println("CONSULTANDO STATUS BOMBA DIESEL");
                            System.out.println();
                            System.out.println(bombaPostoDiesel.consultar());
                            System.out.println();
                            break;

                        case 'A':
                            System.out.println();
                            System.out.println("CONSULTANDO STATUS BOMBA ÁLCOOL");
                            System.out.println();
                            System.out.println(bombaPostoAlcool.consultar());
                            System.out.println();
                            break;

                        case 'E':
                            System.out.println();
                            System.out.println("CONSULTANDO STATUS BOMBA ETANOL");
                            System.out.println();
                            System.out.println(bombaPostoEtanol.consultar());
                            System.out.println();
                            break;

                        default:
                            System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
                    }
                    break;
                case 4:
                    System.out.println("ENCERRANDO. VOLTE SEMPRE.");
                    parada = 2;
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
            }
        }
    }
}





