package groovy.service

import groovy.data.CandidatoDAO
import groovy.model.Candidato

class CandidatoService {

    static void adicionarCandidato(Candidato candidato) {
        if (candidato == null) {
            throw new IllegalArgumentException("Candidato não deve ser nulo");
        }
        CandidatoDAO.inserir(candidato);
    }

    static void listarCandidatos() {
        CandidatoDAO.listar()
    }

}
