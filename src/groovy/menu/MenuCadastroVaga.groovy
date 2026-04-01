package groovy.menu

import groovy.service.EmpresaService
import groovy.service.VagaService

static void mostrarMenuCadastroVaga(Scanner input, String entrada) {
    println "Nome da Vaga:"
    def nome = input.nextLine();

    println "Descrição da Vaga:"
    def descricao = input.nextLine();

    println "Competências:"
    def competencias = input.nextLine();

    println "Local da Vaga:"
    def local = input.nextLine();

    println "Informe o ID da Empresa da Vaga:"
    EmpresaService.listarEmpresasResumida();
    def idEmpresa = input.nextLine();

    def vaga = new groovy.model.Vaga (
            nome: nome,
            descricao: descricao,
            competencias: competencias,
            local: local,
            idEmpresa: idEmpresa.toInteger()
    )

    VagaService.adicionarVaga(vaga);
}