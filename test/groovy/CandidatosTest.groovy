import groovy.data.CandidatoMock
import groovy.model.Candidato
import groovy.service.CandidatoService
import org.junit.Test
import org.junit.Before
import static org.junit.Assert.*

class CandidatoTest {
    Candidato candidato;

    @Before
    void iniciar() {
        candidato = new Candidato(
                nome: "João Silva",
                email: "joao@email.com",
                cpf: 12345678900,
                idade: 25,
                estado: "SP",
                cep: 01001000,
                descricaoPessoal: "Dev Java",
                competencias: ["Java", "Spring"]
        )
    }

    @Test
    void verificarNomeCandidato() {
        assertEquals("João Silva", candidato.nome)
    }

    @Test
    void verificarEmail() {
        assertEquals("joao@email.com", candidato.email)
    }

    @Test
    void verificarCpf() {
        assertEquals(12345678900, candidato.cpf)
    }

    @Test
    void verificarCep() {
        assertEquals("Dev Java", candidato.descricaoPessoal)
    }

    @Test
    void verificarCompetencias() {
        assertEquals(["Java", "Spring"], candidato.competencias)
    }

    @Test
    void verificarAdicionar() {
        CandidatoService.adicionarCandidato(candidato)
        assertEquals(candidato, CandidatoMock.candidatos.last())
    }
}
