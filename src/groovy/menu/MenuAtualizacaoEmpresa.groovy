package groovy.menu

import groovy.data.EmpresaDAO

public static mostrarMenuAtualizacaoEmpresa(Scanner input, String entrada) {
    println "Nome do Empresa:"
    def nome = input.nextLine()

    println "Email Corporativo:"
    def email = input.nextLine()

    println "Pais:"
    def pais = input.nextLine()

    println "CEP:"
    def cep = input.nextLine()

    println "Descrição Empresa:"
    def descricao = input.nextLine()

    println "Senha:"
    def senha = input.nextLine()

    println "CNPJ:"
    def cnpj = input.nextLine()

    def empresa = new groovy.model.Empresa(
            nome: nome,
            emailCorporativo: email,
            pais: pais,
            cep: cep,
            descricaoEmpresa: descricao,
            senha: senha,
            cnpj: cnpj
    )

    EmpresaDAO.atualizarEmpresa(empresa)
}