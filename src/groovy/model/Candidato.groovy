package groovy.model

import java.time.LocalDate

class Candidato {

    String nome
    String sobrenome
    LocalDate dataNascimento
    String email
    String cpf
    String pais
    String cep
    String descricaoPessoal
    String senha

    def competencias = []

    @Override
    String toString() {
        return "Candidato {" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", pais='" + pais + '\'' +
                ", cep='" + cep + '\'' +
                ", descricaoPessoal='" + descricaoPessoal + '\'' +
                ", competencias=" + competencias +
                '}'
    }
}