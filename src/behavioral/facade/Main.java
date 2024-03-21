package behavioral.facade;

import behavioral.facade.src.Loja;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.comprarProduto("Televisão", 1000);
    }
}