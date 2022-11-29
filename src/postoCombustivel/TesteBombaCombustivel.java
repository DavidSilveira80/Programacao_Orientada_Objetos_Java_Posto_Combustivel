package postoCombustivel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Locale;
public class TesteBombaCombustivel {
    @Test
    void testeBombaConsultar() {
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel(10000, 4.58,
                "Gasolina");
        Assertions.assertEquals("Tipo de Combustivel: Gasolina\nValor por Litro: R$ 4.58\n" +
                "Litros em Estoque: 10000.000\n", bombaGasolina.consultar());
    }
    @Test
    void testeBombaAlterartipoCombustivelAlcoolParaDiesel(){
        BombaCombustivel bombaAlcoolParaDiesel = new BombaCombustivel(5000,
                4.00, "Álcool" );

        Assertions.assertEquals("Tipo de Combustivel alterado para: Diesel.",
                bombaAlcoolParaDiesel.alterarTipoCombustivel('D'));
    }
    @Test
    void testeBombaAlteraLitrosEstoque(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel(5000, 4.58,
                "Gasolina");

        Assertions.assertEquals("Litros em Estoque alterado para: 4000.000.", bombaGasolina.alterarLitrosEstoque(4000f));
    }
    @Test
    void testeBombaGasolinaAlteraValorPorlitro4e58Para4e40(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel(5000, 4.58,
                "Gasolina");
        double valorPorlitro = 4.40;
        Assertions.assertEquals("Valor por Litro alterado para: R$ 4.40.", bombaGasolina.alterarValorPorLitro(valorPorlitro));
    }
    @Test
    void testeBombaGasolinaAbastecerPorLitro(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel(5000, 4.40,
                "Gasolina");

        Assertions.assertEquals("8.80", bombaGasolina.abastecerPorLitro(2));
        Assertions.assertEquals(4998, bombaGasolina.getQuantidadeDeCombustivel());
    }
    @Test
    void testeBombaGasolinaAbastecerPorValor(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel(5000, 4.40,
                "Gasolina");
        Assertions.assertEquals("8.80", bombaGasolina.abastecerPorValor(8.80));
        Assertions.assertEquals(4998, bombaGasolina.getQuantidadeDeCombustivel());
    }
}
