package exerciciospoo;

public class Testar {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(0);
		c1.setRaio(20);
		
		Circulo c2 = new Circulo(0);
		c2.setRaio(1);
		
	//	System.out.println(c1.getRaio());
		
		c1.calcularArea();
		c2.calcularArea();
		c1.calcularCircunf();
		c2.calcularCircunf();
		
	}
	
	

}
