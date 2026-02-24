package groovy.model

class Candidato {
    String nome;
    String email; //lembrar de fazer validação depois
    long cpf;
    int idade;
    String estado;
    int cep;
    String descricaoPessoal;
    def competencias = [];


    @Override
    public String toString() {
        return "Candidato {" +
                "" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", estado='" + estado + '\'' +
                ", cep=" + cep +
                ", descricaoPessoal='" + descricaoPessoal + '\'' +
                ", competencias=" + competencias +
                '}';
    }
}
