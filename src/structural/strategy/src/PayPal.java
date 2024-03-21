package structural.strategy.src;

import structural.strategy.src.interfaces.PaymentStrategy;

public class PayPal implements PaymentStrategy {
    private Long id;

    public PayPal(Long id){
        this.id = id;
    }

    @Override
    public void pay(double valor) {
        System.out.println("Id: " + id + "\nPagamento de R$" + valor + " realizado com sucesso pelo PayPal.");
    }

}