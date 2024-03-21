package behavioral.facade.src;

class Estoque {
    public boolean verificarDisponibilidade(String produto) {
        System.out.println("Verificando disponibilidade de " + produto);
        return true;
    }
}