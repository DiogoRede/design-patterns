package creational.factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		ConcreteFactory factory = new ConcreteFactory();
		Product product = factory.createProduct();
		product.operation();

	}

}
