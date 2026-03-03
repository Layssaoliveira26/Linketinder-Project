package groovy.data;
import groovy.model.Candidato;


class CandidatoMock {
    public static List<Candidato> candidatos = [
            new Candidato(
                    nome: "Layssa Ferreira",
                    email: "layssa.ferreira@email.com",
                    cpf: 12345678901,
                    idade: 24,
                    estado: "Paraná",
                    cep: 86000000,
                    descricaoPessoal: "Estudante de Engenharia de Software com interesse em desenvolvimento full stack e APIs REST.",
                    competencias: ["Java", "Groovy", "Spring Boot", "SQL"]
            ),

            new Candidato(
                    nome: "Carlos Henrique Souza",
                    email: "carlos.souza@email.com",
                    cpf: 98765432100,
                    idade: 29,
                    estado: "São Paulo",
                    cep: 04567000,
                    descricaoPessoal: "Desenvolvedor backend com foco em microsserviços e arquitetura limpa.",
                    competencias: ["Java", "Docker", "Kubernetes", "PostgreSQL"]
            ),

            new Candidato(
                    nome: "Mariana Alves Lima",
                    email: "mariana.alves@email.com",
                    cpf: 45678912355,
                    idade: 26,
                    estado: "Minas Gerais",
                    cep: 30140000,
                    descricaoPessoal: "Front-end developer especializada em React e experiência do usuário.",
                    competencias: ["JavaScript", "React", "TypeScript", "CSS"]
            ),

            new Candidato(
                    nome: "Rafael Martins",
                    email: "rafael.martins@email.com",
                    cpf: 32165498777,
                    idade: 32,
                    estado: "Rio de Janeiro",
                    cep: 20040000,
                    descricaoPessoal: "Engenheiro de software com experiência em sistemas financeiros e integrações bancárias.",
                    competencias: ["Java", "Spring", "RabbitMQ", "MySQL"]
            ),

            new Candidato(
                    nome: "Fernanda Rocha",
                    email: "fernanda.rocha@email.com",
                    cpf: 74185296311,
                    idade: 27,
                    estado: "Santa Catarina",
                    cep: 88015000,
                    descricaoPessoal: "Analista de dados com experiência em BI e modelagem de dados.",
                    competencias: ["Python", "Power BI", "SQL", "Pandas"]
            )
    ]

    static void getListaCandidatos() {
        for (candidato in candidatos) {
            println(
                    "Nome: " + candidato.nome + ", Email: " + candidato.email + ", CPF: " + candidato.cpf +
                    ", Idade: " + candidato.idade + ", Estado: " + candidato.estado + ", CEP: " + candidato.cep +
                    ", Descrição Pessoal: " + candidato.descricaoPessoal + ", Competências: " + candidato.competencias
            )

        }
    }
}
