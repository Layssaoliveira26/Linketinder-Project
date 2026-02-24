package groovy.data

import groovy.model.Empresa

class EmpresaMock {

    static List<Empresa> empresas = [

            new Empresa(
                    nome: "Zg Soluções",
                    emailCorporativo: "zgsolucoes@gmail.com",
                    cnpj: 20391758000105,
                    pais: "Brasil",
                    estado: "Paraná",
                    cep: 36880103,
                    descricaoEmpresa: "A ZG Soluções é uma empresa líder no Brasil em tecnologia voltada para a gestão financeira hospitalar e da saúde. Especializada na automatização do ciclo de receitas, a empresa atua para reduzir glosas médicas e otimizar lucros."
            ),

            new Empresa(
                    nome: "TechNova Sistemas",
                    emailCorporativo: "contato@technova.com.br",
                    cnpj: 48275931000162,
                    pais: "Brasil",
                    estado: "São Paulo",
                    cep: 4567089,
                    descricaoEmpresa: "Especializada no desenvolvimento de softwares corporativos para gestão empresarial (ERP), oferecendo soluções integradas para pequenas e médias empresas."
            ),

            new Empresa(
                    nome: "HealthData Analytics",
                    emailCorporativo: "comercial@healthdata.com.br",
                    cnpj: 73194582000109,
                    pais: "Brasil",
                    estado: "Minas Gerais",
                    cep: 30140071,
                    descricaoEmpresa: "Atua no segmento de análise de dados para a área da saúde, fornecendo plataformas inteligentes para tomada de decisão estratégica."
            ),

            new Empresa(
                    nome: "FinControl Tecnologia",
                    emailCorporativo: "atendimento@fincontrol.com.br",
                    cnpj: 59482017000133,
                    pais: "Brasil",
                    estado: "Rio de Janeiro",
                    cep: 20040030,
                    descricaoEmpresa: "Desenvolve soluções digitais para controle financeiro e compliance empresarial."
            ),

            new Empresa(
                    nome: "AgroSmart Solutions",
                    emailCorporativo: "suporte@agrosmart.com.br",
                    cnpj: 83917426000155,
                    pais: "Brasil",
                    estado: "Rio Grande do Sul",
                    cep: 90010050,
                    descricaoEmpresa: "Oferece plataformas tecnológicas voltadas ao agronegócio utilizando IoT e análise preditiva."
            ),

            new Empresa(
                    nome: "EduTech Brasil",
                    emailCorporativo: "contato@edutechbrasil.com.br",
                    cnpj: 26738194000188,
                    pais: "Brasil",
                    estado: "Santa Catarina",
                    cep: 88015020,
                    descricaoEmpresa: "Desenvolve ambientes virtuais de aprendizagem e sistemas acadêmicos completos."
            ),

            new Empresa(
                    nome: "LogiTrack Sistemas",
                    emailCorporativo: "comercial@logitrack.com.br",
                    cnpj: 91827364000177,
                    pais: "Brasil",
                    estado: "Bahia",
                    cep: 40015010,
                    descricaoEmpresa: "Cria soluções tecnológicas para logística e transporte com rastreamento em tempo real."
            ),

            new Empresa(
                    nome: "CyberSafe Security",
                    emailCorporativo: "suporte@cybersafe.com.br",
                    cnpj: 37482915000160,
                    pais: "Brasil",
                    estado: "Pernambuco",
                    cep: 50030020,
                    descricaoEmpresa: "Focada em segurança da informação, oferecendo proteção contra ataques cibernéticos."
            ),

            new Empresa(
                    nome: "Construtech Engenharia Digital",
                    emailCorporativo: "contato@construtech.com.br",
                    cnpj: 65291748000144,
                    pais: "Brasil",
                    estado: "Goiás",
                    cep: 74015030,
                    descricaoEmpresa: "Desenvolve softwares para gestão de obras e projetos de engenharia."
            ),

            new Empresa(
                    nome: "RetailMax Tecnologia",
                    emailCorporativo: "atendimento@retailmax.com.br",
                    cnpj: 14092837000191,
                    pais: "Brasil",
                    estado: "Ceará",
                    cep: 60025040,
                    descricaoEmpresa: "Fornece sistemas inteligentes para o varejo com controle de estoque e integração com marketplaces."
            )
    ]

    static void getListaEmpresas() {
        for (empresa in empresas) {
            println(
                    "Nome: " + empresa.nome + ", Email Corporativo: " + empresa.emailCorporativo + ", " +
                    "CNPJ: " + empresa.cnpj + ", Pais: " + empresa.pais + ", Estado: " + empresa.estado + ", " +
                    "CEP: " + empresa.cep + ", Descrição Empresa: " + empresa.descricaoEmpresa )
        }
    }
}