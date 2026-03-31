package groovy.data

import groovy.model.Candidato
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.Statement

static void inserir(Candidato candidato) {

    String sql = """
        INSERT INTO candidatos 
        (nome, sobrenome, data_nascimento, email, cpf, pais, cep, descricao_pessoal, senha)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
    """

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, candidato.nome)
        stmt.setString(2, candidato.sobrenome)
        stmt.setDate(3, java.sql.Date.valueOf(candidato.dataNascimento))
        stmt.setString(4, candidato.email)
        stmt.setString(5, candidato.cpf)
        stmt.setString(6, candidato.pais)
        stmt.setString(7, candidato.cep)
        stmt.setString(8, candidato.descricaoPessoal)
        stmt.setString(9, candidato.senha)

        stmt.executeUpdate()

        println "Candidato inserido com sucesso!"

    } catch (Exception e) {
        e.printStackTrace()
    }
}

static void listar() {

    String sql = "SELECT * FROM candidatos"

    try (Connection conn = Conexao.conectar();
         Statement stmt= conn.createStatement();
         def rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            println """
            ---------------------------
            Nome: ${rs.getString("nome")}
            Sobrenome: ${rs.getString("sobrenome")}
            Email: ${rs.getString("email")}
            CPF: ${rs.getString("cpf")}
            País: ${rs.getString("pais")}
            CEP: ${rs.getString("cep")}
            Descrição: ${rs.getString("descricao_pessoal")}
            ---------------------------
            """
        }

    } catch (Exception e) {
        e.printStackTrace()
    }
}