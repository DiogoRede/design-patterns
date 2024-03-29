package structural.observer.src;

import structural.observer.src.interfaces.Observer;

public class Treinador implements Observer {
    private String nome;

    public Treinador(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String placar) {
        System.out.println("Treinador " + nome + ": Estamos " + placar);
    }
}