package groovy.model
import groovy.transform.MapConstructor

@MapConstructor
class Empresa {
    String nome;
    String emailCorporativo;
    String cnpj;
    String pais;
    String cep;
    String descricaoEmpresa;
    String senha;


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
