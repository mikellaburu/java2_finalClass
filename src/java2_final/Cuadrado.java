package java2_final;

public final class Cuadrado extends Rectangulo {
	
	public double calcularArea(){
		return this.getX()*2;
	}
	public double calcularPerimetro(){
		return this.getX()*4;
	}
}
