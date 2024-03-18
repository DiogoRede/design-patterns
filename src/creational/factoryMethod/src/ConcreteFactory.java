package creational.factoryMethod.src;

public class ConcreteFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}