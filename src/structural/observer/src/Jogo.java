package structural.observer.src;

import java.util.ArrayList;
import java.util.List;

import structural.observer.src.interfaces.Observer;
import structural.observer.src.interfaces.Subject;

public class Jogo implements Subject {
    private List<Observer> observadores = new ArrayList<>();
    private String placar;

    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notifyObservers(String placar) {
        for (Observer observer : observadores) {
            observer.update(placar);
        }
    }

    public void setPlacar(String placar) {
        this.placar = placar;
        notifyObservers(placar);
    }

    public String getPlacar(){
        return this.placar;
    }
}