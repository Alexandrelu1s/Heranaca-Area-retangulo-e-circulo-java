package entities;

public abstract class Corpo {
	private Cor cor;
	
	public Corpo(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract Double area();
}
