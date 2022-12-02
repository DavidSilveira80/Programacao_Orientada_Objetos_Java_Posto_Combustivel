package postoCombustivel;

import java.util.Scanner;

public class Utilidades {

    //ENTRADAS

    public static int entradaInteira() {
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        int numero = 0;
        while (continuarLeitura) {
            try {
                numero = Integer.parseInt(entrada.nextLine());
                continuarLeitura = false;
            } catch (NumberFormatException e) {
                System.out.println("Entrada com valor inválido. Tente Novamente.");
            }
        }
        return numero;

    }

    public static char entradaChar() {
        Scanner entrada = new Scanner(System.in);
        char caractere = entrada.next().charAt(0);
        return caractere;
    }

    public static double entradaDouble() {
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        double entraDouble = 0.0;
        while (continuarLeitura) {
            try {
                entraDouble = Double.parseDouble(entrada.nextLine());
                continuarLeitura = false;
            } catch (NumberFormatException e) {
                System.out.println("Entrada com valor inválido. Tente Novamente.");
            }
        }
        return entraDouble;
    }

}
