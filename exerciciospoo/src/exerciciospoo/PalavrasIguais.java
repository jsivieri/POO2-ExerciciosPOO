package exerciciospoo;

public class PalavrasIguais {
	
	String palavra1, palavra2;

	public PalavrasIguais(String palavra1, String palavra2) {
		super();
		this.palavra1 = palavra1;
		this.palavra2 = palavra2;
	}

	public String getPalavra1() {
		return palavra1;
	}

	public void setPalavra1(String palavra1) {
		this.palavra1 = palavra1;
	}

	public String getPalavra2() {
		return palavra2;
	}

	public void setPalavra2(String palavra2) {
		this.palavra2 = palavra2;
	}
	
	public void comparar() {
		this.setPalavra1(palavra1);
		this.setPalavra2(palavra2);
		if (getPalavra1() == getPalavra2()) {
			System.out.println("igual");
			
		} else {
			System.out.println("diferente");

		}
	}

}
