package behavioral.strategy.src;

import behavioral.strategy.src.interfaces.PaymentStrategy;

public class Nubank implements PaymentStrategy{
    private Long id;

    public Nubank(Long id){
        this.id = id;
    }

    @Override
    public void pay(double valor) {
        System.out.println("Id: " + id + "\nPagamento de R$" + valor + " realizado com sucesso pelo Nubank.");
    }
   
}