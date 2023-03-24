package exerciciospoo;

public class CalcularAreaCirc {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(0);
		c1.setRaio(32);
		
		Circulo c2 = new Circulo(0);
		c2.setRaio(44);
		
		Circulo c3 = new Circulo(0);
		c3.setRaio(17);
		
		c1.calcularArea();
		c2.calcularArea();
		c3.calcularArea();
		
		c1.calcularCircunf();
		c2.calcularCircunf();
		c3.calcularCircunf();
	}

}
