package pessoaFisicaJuridica;

import pessoaFisicaJuridica.Pessoa;

public class Fisica extends Pessoa {
    public String cpf, identidade;

    @Override
    public String toString() {
        return "pessoaFisicaJuridica.Fisica{" +
                "cpf='" + cpf + '\'' +
                ", identidade='" + identidade + '\'' +
                ", nome='" + nome + '\'' +
                ", situacaoPessoa='" + situacaoPessoa + '\'' +
                '}';
    }
}
