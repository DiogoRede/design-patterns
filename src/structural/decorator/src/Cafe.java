package structural.decorator.src;

public class Cafe extends Bebida {

	public Cafe() {
		super("Cafe");
	}

	@Override
	public double custo() {
		return 7;
	}

}
