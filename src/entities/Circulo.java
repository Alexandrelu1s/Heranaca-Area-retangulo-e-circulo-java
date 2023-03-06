package entities;

public class Circulo extends Corpo{
	private Double radius;
	
	public Circulo(Double radius, Cor cor) {
		super(cor);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return 3.14 * Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return getCor() + " Area = " + area();
	}
}
