package postoCombustivel;
//TODO implementar programa Posto
import java.util.Locale;
import java.util.Scanner;

public class Posto {

    public static void main(String[] args) {
        BombaCombustivel bombaPosto = new BombaCombustivel(0.0, 0.0, " ");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("BEM-VINDO AO POSTO SILVEIRA");
        int parada = 1;
        while (parada == 1) {
            System.out.println("1 - Gerar Bomba de Combustivel 4 - Sair");
            System.out.print("Informe opção: ");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Gerar Bomba de Combustivel.");
                    System.out.print("Informe o Estoque de Combustivel: ");
                    double estoque = entrada.nextDouble();
                    System.out.print("Informe o valor por Litro: R$ ");
                    double valorPorLitro = entrada.nextDouble();
                    System.out.print("Informe o tipo de Combustivel: (G) -> GASOLINA (D) -> DIESEL (A) -> ÁLCOOL (E) -> " +
                            "ETANOL:  ");
                    char tipoCombustivel = entrada.next().charAt(0);
                    bombaPosto.alterarLitrosEstoque(estoque);
                    bombaPosto.alterarValorPorLitro(valorPorLitro);
                    bombaPosto.alterarTipoCombustivel(tipoCombustivel);
                    System.out.println("GERANDO BOMBA DE COMBUSTIVEL.");
                    System.out.println(bombaPosto.consultar());
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





