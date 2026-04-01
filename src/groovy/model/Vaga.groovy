package groovy.model

class Vaga {
    String nome;
    String descricao;
    String competencias;
    String local;
    String idEmpresa;

    @Override
    public String toString() {
        return "Vaga{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", competencias='" + competencias + '\'' +
                ", local='" + local + '\'' +
                ", idEmpresa='" + idEmpresa + '\'' +
                '}';
    }
}

