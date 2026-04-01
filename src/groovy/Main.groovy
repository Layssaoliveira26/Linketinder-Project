package groovy


import groovy.menu.MenuGeral

class Main {
    static void main(String[] args) {
        MenuGeral.exibir();
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        MenuGeral.iniciar(input, entrada);
    }
}