package creational.factoryMethod.src;

public class ConcreteProduct implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProduct operation");
    }
}