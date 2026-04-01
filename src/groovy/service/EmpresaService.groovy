package groovy.service

import groovy.data.CandidatoDAO
import groovy.data.EmpresaDAO
import groovy.model.Empresa

class EmpresaService {

    static void adicionarEmpresa(Empresa empresa) {
        if (empresa == null) {
            throw new IllegalArgumentException("Empresa não deve ser nula");
        }
        EmpresaDAO.inserirEmpresa(empresa);
    }

    static void listarEmpresas() {
        EmpresaDAO.listarEmpresa();
    }

    static void listarEmpresasResumida() {
        EmpresaDAO.listarEmpresaResumida();
    }
}
