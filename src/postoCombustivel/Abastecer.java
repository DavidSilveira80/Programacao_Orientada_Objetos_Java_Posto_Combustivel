package postoCombustivel;

import static postoCombustivel.Utilidades.entradaChar;

public class Abastecer {
    public static char fluxoMenuAbastecer(){
        char caractere;
        caractere = entradaChar();
        while (caractere != 'G' && caractere != 'D' && caractere != 'A' && caractere != 'E') {
            Telas.gerarMenuStatusDaBomba();
            caractere = entradaChar();
        }
        return caractere;
    }
}
