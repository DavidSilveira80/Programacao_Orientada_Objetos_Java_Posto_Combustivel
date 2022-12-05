package postoCombustivel;

import java.util.ArrayList;

public class MetodosDePesquisaEBusca {

    public static boolean existeBombaCombustivel(ArrayList<BombaCombustivel> arrayBombas, String tipoDeBomba){
        boolean resposta = false;

        for(BombaCombustivel bomba : arrayBombas){
            if(bomba.getTipoCombustivel().equals(tipoDeBomba)){
                resposta = true;
            }else{
                resposta = false;
            }
        }
        return resposta;
    }

    public static String consultaBomba(ArrayList<BombaCombustivel> arrayDebombas, String tipoDeBomba){
        String resp = "";
        if(existeBombaCombustivel(arrayDebombas, tipoDeBomba) == true){
            int index = 600;
            for(BombaCombustivel bombaPosto : arrayDebombas){
                if(bombaPosto.getTipoCombustivel().equals(tipoDeBomba)){
                    resp = bombaPosto.consultar();
                }
            }

        }else{
            resp = "Tipo de Bomba inexistente";
        }
        return resp;
    }
}
