package behavioral.observer;

import behavioral.observer.src.Comentarista;
import behavioral.observer.src.Jogo;
import behavioral.observer.src.Torcedor;
import behavioral.observer.src.Treinador;
import behavioral.observer.src.interfaces.Observer;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Observer torcedor = new Torcedor("Cassiano");
        Observer comentarista = new Comentarista("Luiz");
        Observer treinador = new Treinador("Diogo");

        jogo.addObserver(treinador);
        jogo.addObserver(torcedor);
        jogo.addObserver(comentarista);

        jogo.setPlacar("1 x 0");
        jogo.setPlacar("2 x 0");
    }

}