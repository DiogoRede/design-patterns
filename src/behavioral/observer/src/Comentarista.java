package behavioral.observer.src;

public class Comentarista implements Observer {
    private String nome;

    public Comentarista(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String placar) {
        System.out.println("Comentarista " + nome + ": O placar atual é " + placar);
    }
}