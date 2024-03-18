package creational.factoryMethod;

import creational.factoryMethod.src.ConcreteFactory;

import creational.factoryMethod.src.Product;

public class Main {

	public static void main(String[] args) {
		
		ConcreteFactory factory = new ConcreteFactory();
		Product product = factory.createProduct();
		product.operation();

	}

}
