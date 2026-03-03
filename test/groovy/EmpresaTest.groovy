import groovy.data.CandidatoMock
import groovy.data.EmpresaMock
import groovy.model.Empresa
import groovy.service.CandidatoService
import groovy.service.EmpresaService
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*

class EmpresaTest {
    Empresa empresa;

    @Before
    void iniciar() {
        empresa = new Empresa(
                nome: "Tech Corp",
                emailCorporativo: "contato@tech.com",
                cnpj: 12345678000190,
                pais: "Brasil",
                estado: "RJ",
                cep: 20040000,
                descricaoEmpresa: "Empresa de tecnologia"
        )
    }

    @Test
    void verificarNomeEmpresa() {
        assertEquals("Tech Corp", empresa.nome)
    }

    @Test
    void verificarEmailCorporativo() {
        assertEquals("contato@tech.com", empresa.emailCorporativo)
    }

    @Test
    void verificarCnpj() {
        assertEquals(12345678000190, empresa.cnpj)
    }

    @Test
    void verificarPais() {
        assertEquals("Brasil", empresa.pais)
    }

    @Test
    void verificarEstado() {
        assertEquals("RJ", empresa.estado)
    }

    @Test
    void verificarCep() {
        assertEquals(20040000, empresa.cep)
    }

    @Test
    void verificarDescricaoEmpresa() {
        assertEquals("Empresa de tecnologia", empresa.descricaoEmpresa)
    }

    @Test
    void verificarAdicionar() {
        EmpresaService.adicionarEmpresa(empresa)
        assertEquals(empresa, EmpresaMock.empresas.last())
    }

}
