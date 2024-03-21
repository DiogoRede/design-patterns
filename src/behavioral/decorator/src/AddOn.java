package behavioral.decorator.src;

public abstract class AddOn extends Bebida{
	protected Bebida bebida;
	
	public AddOn(String descricao, Bebida bebida) {
		super(descricao);
		this.setBebida(bebida);
	}

	public abstract String getDescricao();

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	
}