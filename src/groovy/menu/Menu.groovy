package groovy.menu

import groovy.data.CandidatoMock
import groovy.data.EmpresaMock

class Menu {

    static void exibir() {
        println "|-------------------------------------------------------|"
        println "| Escolha a numeração da ação que você deseja realizar: |"
        println "|-------------------------------------------------------|"
        println "| 1-Visualizar lista de candidatos                      |"
        println "| 2-Visualizar lista de empresas                        |"
    }

    static void iniciar(Scanner input, String entrada) {
        while(entrada) {
            if (entrada == "1") {
                CandidatoMock.getListaCandidatos();
                break;
            } else if (entrada == "2") {
                EmpresaMock.getListaEmpresas();
                break;
            } else {
                println "Numeração de atividade não encontrada, digite uma numeração válida:"
                entrada = input.nextLine();
            }
        }
    }
}
