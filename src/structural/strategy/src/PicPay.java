package structural.strategy.src;

import structural.strategy.src.interfaces.PaymentStrategy;

public class PicPay implements PaymentStrategy{
    private Long id;

    public PicPay(Long id){
        this.id = id;
    }

    @Override
    public void pay(double valor) {
        System.out.println("Id: " + id + "\nPagamento de R$" + valor + " realizado com sucesso pelo PicPay.");
    }
    
}