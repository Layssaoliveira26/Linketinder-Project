package groovy.model
import groovy.transform.MapConstructor

@MapConstructor
class Empresa {
    String nome;
    String emailCorporativo;
    long cnpj;
    String pais;
    String estado;
    int cep;
    String descricaoEmpresa;


    @Override
    public String toString() {
        return "Empresa {" +
                "nome='" + nome + '\'' +
                ", emailCorporativo='" + emailCorporativo + '\'' +
                ", cnpj=" + cnpj +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                ", cep=" + cep +
                ", descricaoEmpresa='" + descricaoEmpresa + '\'' +
                '}';
    }


}
