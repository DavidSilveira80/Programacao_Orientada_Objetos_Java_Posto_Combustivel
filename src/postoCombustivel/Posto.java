package postoCombustivel;
//TODO implementar programa Posto
import java.util.Locale;
public class Posto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        BombaCombustivel bombaGasolina = new BombaCombustivel(10000f, 5.21f, "Gasolina");
        BombaCombustivel bombaDiesel = new BombaCombustivel(10000f, 6.49f, "Diesel");
        BombaCombustivel bombaAlcool = new BombaCombustivel(10000f, 4.00f, "Álcool");
        BombaCombustivel bombaEtanol = new BombaCombustivel(10000f, 4.35f, "Etanol" );

        System.out.println(bombaGasolina.consultar());
        System.out.println(bombaDiesel.consultar());
        System.out.println(bombaAlcool.consultar());
        System.out.println(bombaEtanol.consultar());
    }
}
