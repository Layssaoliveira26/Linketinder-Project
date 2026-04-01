package groovy.menu

import groovy.service.CandidatoService

static void mostrarMenuCadastroCandidato(Scanner input, String entrada) {
    println "Nome do Candidato:"
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
}

