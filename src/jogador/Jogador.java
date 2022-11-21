package jogador;

public class Jogador {
    public String nome;
    public int gols;
    public int assistencias;

    public void adicionar_gol(int gol){
        this.gols += gol;
    }

    public void adicionar_assistencia(int assistencia){
        this.assistencias += assistencia;
    }
}
