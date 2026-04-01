package groovy.menu

import groovy.data.CandidatoDAO
import groovy.service.EmpresaService
import groovy.service.VagaService

public static mostrarMenuAtualizacaoCandidato(Scanner input, String entrada) {
    println "Nome do Candidato:"
    def nome = input.nextLine()

    println "Sobrenome:"
    def sobrenome = input.nextLine()

    println "Email:"
    def email = input.nextLine()

    println "País:"
    def pais = input.nextLine()

    println "CEP:"
    def cep = input.nextLine()

    println "Descrição:"
    def descricao = input.nextLine()

    println "Senha:"
    def senha = input.nextLine()

    println "Competencias:"
    def competencias = input.nextLine()

    println "CPF:"
    def cpf = input.nextLine()

    def candidato = new groovy.model.Candidato(
            nome: nome,
            sobrenome: sobrenome,
            email: email,
            pais: pais,
            cep: cep,
            descricaoPessoal: descricao,
            senha: senha,
            competencias: [],
            cpf: cpf
    )

    CandidatoDAO.atualizarCandidato(candidato);
}