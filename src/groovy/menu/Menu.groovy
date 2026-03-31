package groovy.menu

import groovy.data.CandidatoDAO
import groovy.data.EmpresaDAO
import groovy.data.EmpresaMock
import groovy.service.CandidatoService
import groovy.service.EmpresaService

class Menu {

    static void exibir() {
        println "|-------------------------------------------------------|"
        println "| Escolha a numeração da ação que você deseja realizar: |"
        println "|-------------------------------------------------------|"
        println "| 1-Visualizar lista de candidatos                      |"
        println "| 2-Visualizar lista de empresas                        |"
        println "| 3-Cadastrar candidato                                 |"
        println "| 4-Cadastrar empresa                                 |"
    }

    static void iniciar(Scanner input, String entrada) {
        while(entrada) {
            if (entrada == "1") {
                CandidatoDAO.listar();
                break;
            } else if (entrada == "2") {
                EmpresaDAO.listaEmpresas();
                break;
            } else if (entrada == "3") {
                println "Nome:"
                def nome = input.nextLine()

                println "Sobrenome:"
                def sobrenome = input.nextLine()

                println "Email:"
                def email = input.nextLine()

                println "CPF:"
                def cpf = input.nextLine()

                println "País:"
                def pais = input.nextLine()

                println "CEP:"
                def cep = input.nextLine()

                println "Descrição:"
                def descricao = input.nextLine()

                println "Senha:"
                def senha = input.nextLine()

                def candidato = new groovy.model.Candidato(
                        nome: nome,
                        sobrenome: sobrenome,
                        dataNascimento: java.time.LocalDate.now(),
                        email: email,
                        cpf: cpf,
                        pais: pais,
                        cep: cep,
                        descricaoPessoal: descricao,
                        senha: senha,
                        competencias: []
                )

                CandidatoService.adicionarCandidato(candidato);

                break;
            } else if (entrada == "4") {
                println "Nome:"
                def nome = input.nextLine()

                println "CNPJ:"
                def cnpj = input.nextLine()

                println "Email Corporativo:"
                def email = input.nextLine()

                println "Descrição Empresa:"
                def descricao = input.nextLine()

                println "País:"
                def pais = input.nextLine()

                println "CEP:"
                def cep = input.nextLine()

                println "Senha:"
                def senha = input.nextLine()

                def empresa = new groovy.model.Empresa(
                        nome: nome,
                        cnpj: cnpj,
                        emailCorporativo: email,
                        descricaoEmpresa: descricao,
                        pais: pais,
                        cep: cep,
                        senha: senha,
                )

                EmpresaService.adicionarEmpresa(empresa);

                break;
            }
            else {
                println "Numeração de atividade não encontrada, digite uma numeração válida:"
                entrada = input.nextLine();
            }
        }
    }
}
