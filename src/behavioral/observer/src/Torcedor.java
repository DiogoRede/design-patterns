package behavioral.observer.src;

import behavioral.observer.src.interfaces.Observer;

public class Torcedor implements Observer {
    private String nome;

    public Torcedor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String placar) {
        System.out.println(nome + " está acompanhando o jogo. Placar atual: " + placar);
    }
}