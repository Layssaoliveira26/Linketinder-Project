package groovy.data

import groovy.model.Candidato
import groovy.model.Empresa

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.Statement

static void inserirEmpresa(Empresa empresa) {

    String sql = """
        INSERT INTO empresas(nome, cnpj, email, descricao_empresa, pais, cep, senha)
        VALUES (?, ?, ?, ?, ?, ?, ?)
    """

    try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, empresa.nome);
        stmt.setString(2, empresa.cnpj);
        stmt.setString(3, empresa.emailCorporativo);
        stmt.setString(4, empresa.descricaoEmpresa);
        stmt.setString(5, empresa.pais);
        stmt.setString(6, empresa.cep);
        stmt.setString(7, empresa.senha);


        stmt.executeUpdate();

        println("Empresa inserida com sucesso!")

    } catch (Exception e) {
        e.printStackTrace();
    }
}

static void listarEmpresa() {

    String sql = "SELECT * FROM empresas"

    try (Connection conn = Conexao.conectar();
         Statement stmt= conn.createStatement();
         def rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            println """
            ---------------------------
            Nome: ${rs.getString("nome")}
            Email: ${rs.getString("email")}
            CNPJ: ${rs.getString("cnpj")}
            País: ${rs.getString("pais")}
            CEP: ${rs.getString("cep")}
            Descrição: ${rs.getString("descricao_empresa")}
            Senha: ${rs.getString("senha")}
            ---------------------------
            """
        }

    } catch (Exception e) {
        e.printStackTrace()
    }
}

static void listarEmpresaResumida() {

    String sql = "SELECT id, nome FROM empresas"

    try (Connection conn = Conexao.conectar();
         Statement stmt= conn.createStatement();
         def rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            println """
            ---------------------------
            Id Empresa: ${rs.getString("id")}
            Nome: ${rs.getString("nome")}
            ---------------------------
            """
        }

    } catch (Exception e) {
        e.printStackTrace()
    }
}

static void atualizarEmpresa(Empresa empresa) {

    String sql = """
        UPDATE empresas
        SET nome = ?, email = ?, pais = ?, cep = ?, descricao_empresa = ?, senha = ?
        WHERE cnpj = ?
    """

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, empresa.nome)
        stmt.setString(2, empresa.emailCorporativo)
        stmt.setString(3, empresa.pais)
        stmt.setString(4, empresa.cep)
        stmt.setString(5, empresa.descricaoEmpresa)
        stmt.setString(6, empresa.senha)
        stmt.setString(7, empresa.cnpj)

        stmt.executeUpdate()

        println "Empresa atualizada com sucesso!"

    } catch (Exception e) {
        e.printStackTrace()
    }
}

static void excluirEmpresa(String cnpj) {

    String sql = "DELETE FROM empresas WHERE cnpj = ?"

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, cnpj)

        stmt.executeUpdate()

        println "Empresa excluída com sucesso!"

    } catch (Exception e) {
        e.printStackTrace()
    }
}