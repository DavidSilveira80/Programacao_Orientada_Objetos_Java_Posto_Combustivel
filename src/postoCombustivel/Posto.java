package postoCombustivel;
//TODO implementar programa Posto
import java.util.Locale;
import java.util.Scanner;

public class Posto {
    public static BombaCombustivel bomba1 = new BombaCombustivel(10000, 5.21, "Gasolina");

    public static void gerarNota(double litros, double valor){
        String produto = bomba1.getTipoCombustivel();
        double precoUnitario = bomba1.getValorPorLitro();
        System.out.println();
        String descricao = String.format("%s:   R$ %.2f por Litro.", produto, precoUnitario);
        String quantidade = String.format("%.2f litros  X R$ %.2f.", litros, precoUnitario);
        System.out.println("POSTOS SILVEIRA");
        System.out.println("Gerando Nota");
        System.out.println(descricao);
        System.out.println(quantidade);
        System.out.printf("TOTAL: R$ %.2f\n", valor);
        System.out.println();
    }
    public static void menuAbastecimento(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Qual combustivel você quer?");
        System.out.println("(G) -> Gasolina (D) -> Diesel (A) -> Álcool (E) -> Etanol");
        System.out.print("Informe o tipo de combustivel: ");
        char combustivel = entrada.next().charAt(0);
        if(combustivel != 'G' && combustivel != 'D' && combustivel != 'A' && combustivel != 'E'){
            System.out.println("Opção Inválida. Tente Novamente.");
            menuAbastecimento();
        }
        bomba1.alterarTipoCombustivel(combustivel);
        menuFormadeAbastecimento();

    }
    public static void menuFormadeAbastecimento(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("(V) -> Abastecer por Valor (L) -> Abastecer por Valor.");
        System.out.print("Informe a forma de abastecimento: ");
        char formaDeAbastecimento = entrada.next().charAt(0);
        switch(formaDeAbastecimento){
            case 'V':
                System.out.println("Abastecer por Valor");
                System.out.print("Entre Com o valor: R$ ");
                double valorAbastecer = entrada.nextDouble();
                double totalLitros = bomba1.abastecerPorValor(valorAbastecer);
                gerarNota(totalLitros, valorAbastecer);
                break;
            case 'L':
                System.out.println("Abastecer por Litro");
                System.out.print("Entre com os Litros: ");
                double abastecerLitros = entrada.nextDouble();
                double valorTotalLitros = bomba1.abastecerPorLitro(abastecerLitros);
                gerarNota(abastecerLitros, valorTotalLitros);
                break;
            default:
                System.out.println("Opção Inválida. Tente Novamente");
                menuFormadeAbastecimento();
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao posto Silveira");

        int parada = 0;
        while(parada == 0){
            System.out.println("(A) -> Abastecer (N) -> Gerar Nota (S) -> Sair.");
            System.out.print("O que deseja fazer: ");
            char opcao = entrada.next().charAt(0);
            switch (opcao){
                case 'A':
                    menuAbastecimento();
                    break;
                case 'S':
                    System.out.println("Encerrando. Volte Sempre.");
                    parada = 1;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
