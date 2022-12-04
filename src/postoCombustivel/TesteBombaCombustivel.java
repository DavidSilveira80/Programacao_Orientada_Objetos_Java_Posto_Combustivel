package postoCombustivel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Locale;
import java.util.ArrayList;

import static postoCombustivel.MetodosAuxiliares.existeBombaCombustivel;

public class TesteBombaCombustivel {
    @Test
    void testeBombaConsultar() {
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel("GASOLINA", 4.58,
                10000);
        Assertions.assertEquals("Tipo de Combustivel: GASOLINA\nValor por Litro: R$ 4.58\n" +
                "Litros em Estoque: 10000.000\n", bombaGasolina.consultar());
    }
    @Test
    void testeBombaAlterartipoCombustivelAlcoolParaDiesel(){
        BombaCombustivel bombaAlcoolParaDiesel = new BombaCombustivel("GASOLINA",
                4.00, 5000 );

        Assertions.assertEquals("Tipo de Combustivel alterado para: Diesel.",
                bombaAlcoolParaDiesel.alterarTipoCombustivel('D'));
    }
    @Test
    void testeBombaAlteraLitrosEstoque(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel("GASOLINA", 4.58,
                5000);

        Assertions.assertEquals("Litros em Estoque alterado para: 4000.000.", bombaGasolina.alterarLitrosEstoque(4000f));
    }
    @Test
    void testeBombaGasolinaAlteraValorPorlitro4e58Para4e40(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel("Gasolina", 4.58,
                5000);
        double valorPorlitro = 4.40;
        Assertions.assertEquals("Valor por Litro alterado para: R$ 4.40.", bombaGasolina.alterarValorPorLitro(valorPorlitro));
    }
    @Test
    void testeBombaGasolinaAbastecerPorLitro(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel("GASOLINA", 4.40,
                5000);

        Assertions.assertEquals(8.80, bombaGasolina.abastecerPorLitro(2));
        Assertions.assertEquals(4998, bombaGasolina.getQuantidadeDeCombustivel());
    }
    @Test
    void testeBombaGasolinaAbastecerPorValor(){
        Locale.setDefault(Locale.US);
        BombaCombustivel bombaGasolina = new BombaCombustivel("GASOLINA", 4.40,
                5000);
        Assertions.assertEquals(2.00, bombaGasolina.abastecerPorValor(8.80));
        Assertions.assertEquals(4998, bombaGasolina.getQuantidadeDeCombustivel());
    }
    @Test
    void testSeHaBombaDeCombustivel(){
        ArrayList<BombaCombustivel> arrayBombasCombustivel = new ArrayList<>();
        arrayBombasCombustivel.add(new BombaCombustivel("GASOLINA", 5.21, 8000));
        Assertions.assertEquals(true,existeBombaCombustivel(arrayBombasCombustivel, "GASOLINA"));
    }
}
