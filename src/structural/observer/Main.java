package structural.observer;

import structural.observer.src.Comentarista;
import structural.observer.src.Jogo;
import structural.observer.src.Torcedor;
import structural.observer.src.Treinador;
import structural.observer.src.interfaces.Observer;

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