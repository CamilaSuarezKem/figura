package figura;

public class Rectangulo {
	
	int ancho, alto;

	public Rectangulo(int ancho, int alto) {
		super();
		this.ancho = ancho; 
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	public double getPerimetro() {
		return this.alto*2 + this.ancho*2;
	}
	
}
