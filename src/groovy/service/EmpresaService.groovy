package groovy.service

import groovy.data.CandidatoMock
import groovy.data.EmpresaMock
import groovy.model.Candidato
import groovy.model.Empresa

class EmpresaService {

    static void adicionarEmpresa(Empresa empresa) {
        if (empresa == null) {
            throw new IllegalArgumentException("Empresa não deve ser nula");
        }
        EmpresaMock.empresas.add(empresa);
    }

}
