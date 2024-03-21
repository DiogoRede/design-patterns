package structural.strategy;

import structural.strategy.src.ConcretePayment;
import structural.strategy.src.Nubank;
import structural.strategy.src.PayPal;
import structural.strategy.src.PicPay;
import structural.strategy.src.interfaces.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy cartaoCredito = new Nubank(1L);
        PaymentStrategy transferencia = new PayPal(2L);
        PaymentStrategy paypal = new PicPay(3L);

        ConcretePayment payment = new ConcretePayment();

        payment.setEstrategia(cartaoCredito);
        payment.realizarPagamento(100.50);

        payment.setEstrategia(transferencia);
        payment.realizarPagamento(200.75);

        payment.setEstrategia(paypal);
        payment.realizarPagamento(150.25);
    }
}