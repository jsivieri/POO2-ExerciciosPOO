package exerciciospoo;

public class Circulo {

	int raio;

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	
	public void calcularArea() {
		this.setRaio(raio);
		System.out.println("Area do círculo: "+(float) (getRaio()*getRaio()*Math.PI));
	}
	
	public void calcularCircunf() {
		this.setRaio(raio);
		System.out.println("Circunferência: "+(float) (getRaio()*Math.PI)*2);
	}


	
	
	
	
	
}
