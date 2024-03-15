package creational.singleton;

public class Singleton {
	
	private static Singleton Instance;
	private int id;

	private Singleton() {}
	
	public static Singleton getInstance() {
		if(Instance==null) {
			synchronized (Singleton.class) {
				if(Instance==null) {
					Instance = new Singleton();
				}
			}
		}
		return Instance;
	}
	
	
	/* 	Isso conserta um problema, mas ainda existe outro.
	 *  E se dois clients diferentes acessarem a classe Singleton ao mesmo tempo?
	 *  Bem, elas verificarão se a instância está null ao mesmo tempo, verão que isso é verdade 
	 *  e criarão duas instâncias da classe para cada solicitação feita pelos dois clients.
	 * 
	 * 	então podemos usar synchronized para evitar esse tipo de problema.
	 */
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}