package structural.decorator.src;

public abstract class Bebida {
	private String descricao;
	
	public Bebida(String descricao) {
		this.setDescricao(descricao);
	}
	
	public abstract double custo();

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}