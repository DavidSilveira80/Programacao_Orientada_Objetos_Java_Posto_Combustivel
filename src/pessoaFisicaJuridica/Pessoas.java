package pessoaFisicaJuridica;

public class Pessoas {
    public static void main(String[] args){
        Fisica fis = new Fisica();

        fis.nome = "João";
        fis.cpf = "11111111";
        fis.identidade = "15151515151";
        fis.situacaoPessoa = "A";

        Juridica jur = new Juridica();

        jur.nome = "Casas Silveira";
        jur.cnpj = "4545454";
        jur.inscEstadual = "54545454545";
        jur.situacaoPessoa = "A";

        System.out.println("Dados da pessoaFisicaJuridica.Pessoa Física");
        System.out.println(fis.toString());
        System.out.println("Dados da pessoaFisicaJuridica.Pessoa Jurídica");
        System.out.println(jur.toString());

    }

}
