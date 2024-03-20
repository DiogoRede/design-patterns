package behavioral.strategy.src;

import behavioral.strategy.src.interfaces.PaymentStrategy;

public class ConcretePayment {
    private PaymentStrategy strategy;

    public void setEstrategia(PaymentStrategy estrategia) {
        this.strategy = estrategia;
    }

    public void realizarPagamento(double valor) {
        strategy.pay(valor);
    }
}