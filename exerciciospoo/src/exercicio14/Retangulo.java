package exercicio14;

public class Retangulo {
	
	private int base, altura;

	public Retangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	public void calcularArea() {
		System.out.println("Área: "+this.getBase()*this.getAltura());
	}
	
	public void calcularPerimetro() {
		System.out.println("Perimetro: "+((this.getBase()*2)+(getAltura()*2)));
		
	}
	
	public void verificarQuadrado() {
		if (this.getBase()==this.getAltura()) {
			System.out.println("É quadrado: Sim");
		} else {
			System.out.println("É quadrado: Não");

		}
	}
	
	

}
