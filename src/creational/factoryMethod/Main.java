package creational.factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		ConcreteFactory factory = new ConcreteFactory();
		Product product = factory.createProduct();
		product.operation();
		
		/*	Factory Method é uma ótima escolha quando você precisa de uma maneira flexível e
		 *  extensível de criar objetos, especialmente em situações onde a criação de objetos 
		 *  é dinâmica e baseada em lógica específica em tempo de execução.
		 * 
		 * 	Vantagens:
		 * 		Abstração da Criação de Objetos
		 * 		Flexibilidade na Criação de Objetos
		 * 		Encapsulamento do Código de Criação
		 * 		Promove o Princípio Aberto/Fechado ("Aberto para Extensão, Fechado para Modificação".)
		 * 	
		 * 	Desvantagens:
		 * 		Complexidade Adicional
		 * 		Aumento do Número de Classes
		 * 		Escolha do Tipo de Fábrica
		 * 
		 * 	Quando usar?
		 * 		Use o Factory Method quando a criação de objetos precisa ser dinâmica e baseada em 
		 * 	alguma lógica ou configuração específica em tempo de execução.
		 * 
		 * 		Use o Factory Method quando estiver aplicando o padrão de projeto criacional,
		 * 	especialmente em situações onde há uma família de produtos relacionados e 
		 * 	você deseja encapsular sua criação.
		 * 		
		 * 		Use quando desejar fornecer uma maneira flexível e extensível de criar objetos,
		 *  facilitando a introdução de novos tipos de produtos no sistema.
		 * 	
		 */

	}

}
