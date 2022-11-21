package jogador;

public class Jogador {
    public String nome_jogador;
    public int gols;
    public int assistencias;

    public Jogador(String nome_jogador, int gols, int assistencias){
        this.nome_jogador = nome_jogador;
        this.gols = gols;
        this.assistencias = assistencias;
    }

    public void adicionar_gol(int gol){
        this.gols += gol;
    }

    public void adicionar_assistencia(int assistencia){
        this.assistencias += assistencia;
    }
}
