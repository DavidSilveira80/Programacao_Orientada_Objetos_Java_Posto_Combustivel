package postoCombustivel;

import java.util.Scanner;

public class Util {

    //ENTRADAS

    public static int entradaInteira(){
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        int numero = 0;
        while(continuarLeitura){
            try{
                numero = Integer.parseInt(entrada.nextLine());
                continuarLeitura = false;
            }catch(NumberFormatException e){
                System.out.println("Entrada com valor inválido. Tente Novamente.");
            }
        }
        return numero;

    }

    public static char entradaChar(){
        Scanner entrada = new Scanner(System.in);
        char caractere = entrada.next().charAt(0);
        return caractere;
    }

    public static double entradaDouble(){
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        double entraDouble = 0.0;
        while(continuarLeitura){
            try{
                entraDouble = Double.parseDouble(entrada.nextLine());
                continuarLeitura = false;
            }catch(NumberFormatException e){
                System.out.println("Entrada com valor inválido. Tente Novamente.");
            }
        }
        return entraDouble;
    }
    

    //FLUXOS MENUS

    public static int fluxoMenuPrincipal(){
        int numero;
        numero = entradaInteira();
        while(numero != 1 && numero != 2 && numero != 4){
            CabecalhosEMenus.gerarMenuPrincipal();
            numero = entradaInteira();
        }
        return numero;
    }

    public static char fluxoMenuGeraBomba(){
        char caractere;
        caractere = entradaChar();
        while(caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E'){
            CabecalhosEMenus.gerarMenuGerarBomba();
            caractere = entradaChar();
        }
        return caractere;

    }

    public static void clearTerminal() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
