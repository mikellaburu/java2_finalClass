package java2_final;

public class Rectangulo extends Figura {
	//atributos

		double y;
		
		//getters
		public double getY() {
			return this.y;
		}
		
		//setters
		public void setY(double y) {
			this.x = y;
		}
		
		//metodo de superclase
		public double calcularArea(){
			return this.getX()*this.getY();
		}
		public double calcularPerimetro(){
			return this.getX()*2+this.getY()*2;
		}
		
}
