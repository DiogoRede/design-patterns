package structural.decorator.src;

public class Agua extends Bebida{
	
	public Agua() {
		super("Agua");
	}

	@Override
	public double custo() {
		return 4;
	}

}