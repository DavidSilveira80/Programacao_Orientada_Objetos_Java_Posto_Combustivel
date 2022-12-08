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

    public static String consultaBomba(ArrayList<BombaCombustivel> arrayDeBombas, String tipoDeBomba){
        String resp = "";
        if(existeBombaCombustivel(arrayDeBombas, tipoDeBomba) == true){

            for(BombaCombustivel bombaPosto : arrayDeBombas){
                if(bombaPosto.getTipoCombustivel().equals(tipoDeBomba)){
                    resp = bombaPosto.consultar();
                }
            }

        }else{
            resp = "Tipo de Bomba inexistente";
        }
        return resp;
    }
    public static BombaCombustivel retornaBomba(ArrayList<BombaCombustivel> arrayDeBombas, String tipoDeBomba){
        BombaCombustivel resp = null ;
        if(existeBombaCombustivel(arrayDeBombas, tipoDeBomba) == true){
            for(BombaCombustivel bombaPosto : arrayDeBombas){
                if(bombaPosto.getTipoCombustivel().equals(tipoDeBomba)){
                    resp = bombaPosto;
                }
            }

        }else{
            resp = null;
        }
        return resp;
    }

}
