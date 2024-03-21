package behavioral.facade.src;

class Pagamento {
    public void processarPagamento(String produto, double valor) {
        System.out.println("Processando pagamento de " + produto + " no valor de R$" + valor);
    }
}