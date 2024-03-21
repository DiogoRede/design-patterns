package behavioral.facade.src;

public class Loja {
    private Estoque estoque;
    private Pagamento pagamento;
    private Email email;

    public Loja() {
        this.estoque = new Estoque();
        this.pagamento = new Pagamento();
        this.email = new Email();
    }

    public void comprarProduto(String produto, double valor) {
        if (estoque.verificarDisponibilidade(produto)) {
            pagamento.processarPagamento(produto, valor);
            email.enviarConfirmacao(produto);
            System.out.println("Compra do produto " + produto + " realizada com sucesso!");
        } else {
            System.out.println("Produto " + produto + " indisponível.");
        }
    }

}