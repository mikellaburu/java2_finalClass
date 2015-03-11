package java2_final;

public abstract class Figura {
	//atributos
	double x;
	
	//getters
	public double getX() {
		return this.x;
	}
	
	//setters
	public void setX(double x) {
		this.x = x;
	}
	
	//metodo abstracto
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
}
