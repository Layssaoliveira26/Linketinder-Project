package groovy.data

import groovy.model.Vaga
import groovy.data.Conexao
import java.sql.Connection
import java.sql.PreparedStatement

static void inserirVaga(Vaga vaga) {

    String sql = """
        INSERT INTO vagas(nome, descricao, competencias, local, id_empresa)
        VALUES (?, ?, ?, ?, ?)
    """

    try(Connection conn = Conexao.conectar()
        PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, vaga.nome)
        stmt.setString(2, vaga.descricao)
        stmt.setString(3, vaga.competencias)
        stmt.setString(4, vaga.local)
        stmt.setInt(5, vaga.idEmpresa.toInteger())

        stmt.executeUpdate();

        println("Vaga inserida com sucesso!")

    } catch(Exception e) {
        e.printStackTrace();
    }
}