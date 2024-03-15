package creational.singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		singleton.setId(1);
		System.out.println("Singleton 1: " + singleton.getId());
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("Singleton 2: " + singleton2.getId());
		
		/* O Singleton é um padrão de projeto criacional que permite a você garantir que uma 
		 * classe tenha apenas uma instância, enquanto provê um ponto de acesso global 
		 * para essa instância.
		 * 
		 * Vantagens:
		 * 	Economia de Recursos
		 * 	Controle de Acesso Único
		 * 	Globalmente Acessível
		 * 	Facilidade de Manutenção
		 * 
		 * Desvantagens:
		 * 	Dificuldade de Teste
		 * 	Acoplamento Forte
		 * 	Ponto de Falha Única
		 * 	Responsabilidade Única
		 * 
		 * Quando usar?
		 *		Quando você tem um conjunto de configurações globais que devem ser acessadas por 
		 *	várias partes da aplicação, como configurações de banco de dados, 
		 *	configurações de conexão de rede, etc.	
		 *
		 *		Em aplicativos que interagem com recursos externos, como bancos de dados ou 
		 *	serviços da web, onde é desejável ter uma única conexão para otimizar o uso de recursos.
		 * 
		 * 		Para manter um estado global, como a sessão do usuário em um aplicativo da web,
		 *  onde é importante que todas as partes do sistema acessem o mesmo estado.
		 * 
		 */

	}

}