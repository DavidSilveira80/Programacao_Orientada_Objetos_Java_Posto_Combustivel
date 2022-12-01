package postoCombustivel;

public class CabecalhosEMenus {

    //MENUS

    public static void gerarMenuPrincipal(){
        System.out.println("====================================");
        System.out.println("   1 - GERAR BOMBA DE COMBUSTÍVEL   ");
        System.out.println("   2 - CONSULTAR STATUS DA BOMBA    ");
        System.out.println("   4 - SAIR                         ");
        System.out.println("====================================");
    }

    public static void gerarMenuGerarBomba(){
        System.out.println("================================");
        System.out.println("   GERAR BOMBA DE COMBUSTÍVEL   ");
        System.out.println("================================");
        System.out.println("      (G) -> GASOLINA           ");
        System.out.println("      (D) -> DIESEL             ");
        System.out.println("      (A) -> ÁLCOOL             ");
        System.out.println("      (E) -> ETANOL             ");
        System.out.println("================================");
    }

    public static void gerarMenuStatusDaBomba(){
        System.out.println("================================");
        System.out.println("   CONSULTAR STATUS DA BOMBA    ");
        System.out.println("================================");
        System.out.println("   (G) -> BOMBA DE GASOLINA     ");
        System.out.println("   (D) -> BOMBA DE DIESEL       ");
        System.out.println("   (A) -> BOMBA DE ÁLCOOL       ");
        System.out.println("   (E) -> BOMBA DE ETANOL       ");
        System.out.println("================================");
    }

    //CABEÇALHOS

    public static void gerarCabecalhoBoasVindas(){
        System.out.println("=======================");
        System.out.println("      BEM-VINDO        ");
        System.out.println("         AOS           ");
        System.out.println("    POSTOS SILVEIRA    ");
        System.out.println("=======================");

    }

    public static void gerarCabecalhoOpcaoInvalida(){
        System.out.println("=========================");
        System.out.println("     OPÇÃO INVÁLIDA      ");
        System.out.println("     TENTE NOVAMENTE     ");
        System.out.println("=========================");
    }

    public static void gerarCabecalhoConsultandoStatusBomba(String tipoBomba){
        System.out.println("=============================================");
        System.out.println("   CONSULTANDO STATUS BOMBA DE " + tipoBomba);
        System.out.println("=============================================");

    }





}
