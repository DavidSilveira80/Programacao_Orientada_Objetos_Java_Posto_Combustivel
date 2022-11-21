package aluno;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Aluno {
    public String nome_aluno;
    public int[] notas;

    public Aluno(String nome_aluno, int...notas){
        this.nome_aluno = nome_aluno;
        this.notas = notas;
    }

    public String retorna_nome(){
        return this.nome_aluno;
    }

    public double retorna_media(){
       return Arrays.stream(this.notas).sum() / this.notas.length;

    }

    public int retorna_maior_nota() {

        IntSummaryStatistics busca_maior = Arrays.stream(this.notas).summaryStatistics();
        int maior_nota = busca_maior.getMax();

        return maior_nota;
    }

    public int retorna_menor_nota(){

        IntSummaryStatistics busca_menor = Arrays.stream(this.notas).summaryStatistics();
        int menor_nota = busca_menor.getMin();

        return menor_nota;
    }

    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Fulano", 1,2,3,4,5 );
        System.out.println(aluno1.retorna_nome());
        System.out.println(aluno1.retorna_media());
        System.out.println(aluno1.retorna_maior_nota());
        System.out.println(aluno1.retorna_menor_nota());

    }
}
