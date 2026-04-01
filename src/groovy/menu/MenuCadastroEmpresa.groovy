package groovy.menu

import groovy.service.EmpresaService

static void mostrarMenuCadastroEmpresa(Scanner input, String entrada) {
    println "Nome da Empresa:"
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
}