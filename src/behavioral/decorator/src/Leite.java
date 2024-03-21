package behavioral.decorator.src;

public class Leite extends AddOn{

	public Leite(Bebida bebida) {
		super("Leite", bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + " com leite";
	}

	@Override
	public double custo() {
		return bebida.custo() + 3;
	}

}
