package behavioral.decorator.src;

public class Acucar extends AddOn{

	public Acucar(Bebida bebida) {
		super("Açucar", bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + " com acucar";
	}

	@Override
	public double custo() {
		return bebida.custo() + 2;
	}

}
