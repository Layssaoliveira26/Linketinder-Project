package  groovy.service

import groovy.data.VagaDAO
import groovy.model.Vaga

class VagaService {

    static void adicionarVaga(Vaga vaga) {
        if (vaga == null) {
            throw new IllegalArgumentException("Vaga não deve ser nula.")
        } else {
            VagaDAO.inserirVaga(vaga);
        }
    }
}