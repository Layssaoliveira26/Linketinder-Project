package groovy.data

import java.sql.Connection
import java.sql.DriverManager

class Conexao {

    static Connection conectar() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/linketinder",
                    "postgres",
                    "l74123"
            )
        } catch (Exception e) {
            println "Erro ao conectar no banco"
            e.printStackTrace()
            return null
        }
    }
}