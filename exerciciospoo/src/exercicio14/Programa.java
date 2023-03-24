package exercicio14;

public class Programa {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		r1.setBase(20);
		r1.setAltura(300);
		
		Retangulo r2 = new Retangulo();
		r2.setAltura(30);
		r2.setBase(30);
		
		
		r1.calcularArea();
		r2.calcularArea();
		r1.calcularPerimetro();
		r2.calcularPerimetro();
		
		r1.verificarQuadrado();
		r2.verificarQuadrado();

	}

}
