package groovy.menu

import groovy.data.CandidatoDAO
import groovy.data.EmpresaDAO
import groovy.menu.MenuAtualizacaoCandidato
import groovy.menu.MenuAtualizacaoEmpresa
import groovy.menu.MenuCadastroCandidato
import groovy.menu.MenuCadastroEmpresa
import groovy.menu.MenuCadastroVaga
import groovy.service.CandidatoService
import groovy.service.EmpresaService
import groovy.service.VagaService

class MenuGeral {

    static void exibir() {
        println "|-------------------------------------------------------|"
        println "| Escolha a numeração da ação que você deseja realizar: |"
        println "|-------------------------------------------------------|"
        println "| 1-Visualizar lista de candidatos                      |"
        println "| 2-Visualizar lista de empresas                        |"
        println "| 3-Cadastrar candidato                                 |"
        println "| 4-Cadastrar empresa                                   |"
        println "| 5-Cadastrar vaga                                      |"
        println "| 6-Atualização Candidato                               |"
        println "| 7-Atualização Empresa                                 |"
        println "| 8-Exclusão de Candidato                               |"
        println "| 9-Exclusão de Empresa                                 |"

    }

    static void iniciar(Scanner input, String entrada) {
        while(entrada) {
            if (entrada == "1") {
                CandidatoService.listarCandidatos();
                break;
            } else if (entrada == "2") {
                EmpresaService.listarEmpresas();
                break;
            } else if (entrada == "3") {
                MenuCadastroCandidato.mostrarMenuCadastroCandidato(input, entrada);
                break;
            } else if (entrada == "4") {
                MenuCadastroEmpresa.mostrarMenuCadastroEmpresa(input, entrada);
                break;
            } else if (entrada == "5") {
                MenuCadastroVaga.mostrarMenuCadastroVaga(input, entrada);
                break;
            } else if (entrada == "6") {
                MenuAtualizacaoCandidato.mostrarMenuAtualizacaoCandidato(input, entrada);
                break;
            } else if (entrada == "7") {
                MenuAtualizacaoEmpresa.mostrarMenuAtualizacaoEmpresa(input, entrada);
                break;
            } else if (entrada == "9") {
                println("Informe o CNPJ da empresa a ser excluida");
                entrada = input.nextLine();
                def cnpj = entrada;
                EmpresaDAO.excluirEmpresa(cnpj);
                break;
            } else if (entrada == "8") {
                println("Informe o CPF do Candidato a ser excluido");
                entrada = input.nextLine();
                def cpf = entrada;
                CandidatoDAO.excluirCandidato(cpf);
                break;
            } else {
                println "Numeração de atividade não encontrada, digite uma numeração válida:"
                entrada = input.nextLine();
            }
        }
    }
}
