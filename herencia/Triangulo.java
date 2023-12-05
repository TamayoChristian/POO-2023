package herencia;

public class Triangulo extends FiguraGeometrica{

	private Double valor2;
	public Triangulo(double valor1, double valor2) {
		super(valor1);
		this.valor2 = valor2;
	}

	@Override
	public double getArea() {
		return (this.valor1*this.valor2)/2;
	}

	@Override
	public double getPerimetro() {
		return this.valor1 + (2*Math.sqrt((
				Math.pow(this.valor1, 2) + 
				Math.pow(this.valor2, 2))));
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

}
