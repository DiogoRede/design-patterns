package creational.singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		singleton.setId(1);
		System.out.println("Singleton 1: " + singleton.getId());
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("Singleton 2: " + singleton2.getId());

	}

}