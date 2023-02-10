package postoCombustivel;

import static java.lang.System.out;

public class Telas {

    //MENUS


    public static void gerarTelaTipoDeAbastecimento(){
        out.println("===============================");
        out.println("           ABASTECER           ");
        out.println("    (L) ABASTECER POR LITRO    ");
        out.println("    (V) ABASTECER POR VALOR    ");
        out.print("Informe a sua escolha: ");
    }

    public static void gerarMenuPrincipal(){
        out.println("====================================");
        out.println("   1 - GERAR BOMBA DE COMBUSTÍVEL   ");
        out.println("   2 - CONSULTAR STATUS DA BOMBA    ");
        out.println("   3 - ABASTECER                    ");
        out.println("   4 - SAIR                         ");
        out.println("====================================");
        out.print("Informe sua escolha: ");
    }

    public static void gerarMenuGerarBomba(){
        out.println("================================");
        out.println("   GERAR BOMBA DE COMBUSTÍVEL   ");
        out.println("================================");
        out.println("      (G) -> GASOLINA           ");
        out.println("      (D) -> DIESEL             ");
        out.println("      (A) -> ÁLCOOL             ");
        out.println("      (E) -> ETANOL             ");
        out.println("================================");
        out.print("Informe a sua escolha: ");
    }

    public static void gerarMenuStatusDaBomba(){
        out.println("================================");
        out.println("   CONSULTAR STATUS DA BOMBA    ");
        out.println("================================");
        out.println("   (G) -> BOMBA DE GASOLINA     ");
        out.println("   (D) -> BOMBA DE DIESEL       ");
        out.println("   (A) -> BOMBA DE ÁLCOOL       ");
        out.println("   (E) -> BOMBA DE ETANOL       ");
        out.println("================================");
        out.print("Informe a sua escolha: ");
    }

    public static void gerarMenuAbastecerTipoCombustivel(){
        out.println("================================");
        out.println("             ABASTECER          ");
        out.println("================================");
        out.println("   (G) -> BOMBA DE GASOLINA     ");
        out.println("   (D) -> BOMBA DE DIESEL       ");
        out.println("   (A) -> BOMBA DE ÁLCOOL       ");
        out.println("   (E) -> BOMBA DE ETANOL       ");
        out.println("================================");
        out.print("Informe a sua escolha: ");
    }



    //CABEÇALHOS

    public static void gerarCabecalhoBoasVindas(){
        out.println("=======================");
        out.println("      BEM-VINDO        ");
        out.println("         AOS           ");
        out.println("    POSTOS SILVEIRA    ");
        out.println("=======================");

    }

    public static void gerarCabecalhoOpcaoInvalida(){
        out.println("=========================");
        out.println("     OPÇÃO INVÁLIDA      ");
        out.println("     TENTE NOVAMENTE     ");
        out.println("=========================");
        out.print("Informe a sua escolha: ");
    }

    public static void gerarCabecalhoConsultandoStatusBomba(String tipoBomba){
        out.println("=============================================");
        out.println("   CONSULTANDO STATUS BOMBA DE " + tipoBomba);
        out.println("=============================================");

    }

    public static void gerarCabecalhoGerarBombaCombustivel(String tipoCombustivel){
        out.println("===================================================");
        out.println("   GERAR BOMBA DE COMBUSTÍVEL " + tipoCombustivel);
        out.println("===================================================");

    }

    public static void gerarMensagemGerandoBombaDeCombustivel(){
        out.println("================================");
        out.println("  GERANDO BOMBA DE COMBUSTÍVEL  ");
        out.println("================================");
    }


}
