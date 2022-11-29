package postoCombustivel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Locale;
public class TesteBombaCombustivel {
    @Test
    void testeBombaConsultar() {
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel(10000f, 4.58f,
                "Gasolina");
        Assertions.assertEquals("Tipo de Combustivel: Gasolina\nValor por Litro: R$ 4.58\n" +
                "Litros em Estoque: 10000.000\n", bombaGasolina.consultar());
    }
    @Test
    void testeBombaAlterartipoCombustivelAlcoolParaDiesel(){
        BombaCombustivel bombaAlcoolParaDiesel = new BombaCombustivel(5000f,
                4.00f, "Álcool" );

        Assertions.assertEquals("Tipo de Combustivel alterado para: Diesel.",
                bombaAlcoolParaDiesel.alterarTipoCombustivel('D'));
    }
    @Test
    void testeBombaGasolinaAlteraValorPorlitro4e58Para4e40(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel(5000f, 4.58f,
                "Gasolina");
        float valorPorlitro = 4.40f;
        Assertions.assertEquals("Valor por Litro alterado para: R$ 4.40.", bombaGasolina.alterarValorPorLitro(valorPorlitro));
    }

}
