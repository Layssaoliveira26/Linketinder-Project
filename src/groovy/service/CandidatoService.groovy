package groovy.service

import groovy.model.Candidato
import groovy.data.CandidatoMock

class CandidatoService {

    static void adicionarCandidato(Candidato candidato) {
        if (candidato == null) {
            throw new IllegalArgumentException("Candidato não deve ser nulo");
        }
        CandidatoMock.candidatos.add(candidato);
    }
}
