package postoCombustivel;
//TODO implementar programa Posto
import java.util.Locale;
import java.util.Scanner;

public class Posto {

    public static void menuAbastecimento(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual combustivel você quer?");
        System.out.println("(G) -> Gasolina (D) -> Diesel (A) -> Álcool (E) -> Etanol");
        System.out.print("Informe o tipo de combustivel: ");
        char combustivel = entrada.next().charAt(0);
        switch(combustivel){
            case 'G':
                System.out.println("Gasolina");
                menuFormadeAbastecimento();
                break;
            case 'D':
                System.out.println("Diesel");
                break;
            case 'A':
                System.out.println("Álcool");
                break;
            case 'E':
                System.out.println("Etanol");
                break;
            default:
                System.out.println("Opção inválida");
                menuAbastecimento();
            }
        }

        public static void menuFormadeAbastecimento(){
            Scanner entrada = new Scanner(System.in);

            System.out.println("(V) -> Abastecer por Valor (L) -> Abastecer por Valor.");
            System.out.print("Informe a forma de abastecimento: ");
            char formaDeAbastecimento = entrada.next().charAt(0);

            switch(formaDeAbastecimento){
                case 'V':
                    System.out.println("Abastecer por Valor");
                    break;
                case 'L':
                    System.out.println("Abastecer por Litro");
                    break;
                default:
                    System.out.println("Opção Inválida. Tente Novamente");
                    menuFormadeAbastecimento();
            }
        }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        BombaCombustivel bombaGasolina = new BombaCombustivel(10000, 5.21, "Gasolina");
        BombaCombustivel bombaDiesel = new BombaCombustivel(10000, 6.49, "Diesel");
        BombaCombustivel bombaAlcool = new BombaCombustivel(10000, 4.00, "Álcool");
        BombaCombustivel bombaEtanol = new BombaCombustivel(10000, 4.35, "Etanol" );
        System.out.println("Bem-vindo ao posto Silveira");

        int parada = 0;
        while(parada == 0){
            System.out.println("(A) -> Abastecer (S) -> Sair.");
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
