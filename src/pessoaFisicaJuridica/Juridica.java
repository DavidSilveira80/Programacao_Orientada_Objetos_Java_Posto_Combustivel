package pessoaFisicaJuridica;

import pessoaFisicaJuridica.Pessoa;

public class Juridica extends Pessoa {
    public String cnpj, inscEstadual;

    @Override
    public String toString() {
        return "pessoaFisicaJuridica.Juridica{" +
                "cnpj='" + cnpj + '\'' +
                ", inscEstadual='" + inscEstadual + '\'' +
                ", nome='" + nome + '\'' +
                ", situacaoPessoa='" + situacaoPessoa + '\'' +
                '}';
    }
}
