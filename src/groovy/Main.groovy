package groovy

import groovy.data.CandidatoMock
import groovy.data.EmpresaMock
import groovy.menu.Menu

class Main {
    static void main(String[] args) {
        Menu.exibir();
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        Menu.iniciar(input, entrada);
    }
}