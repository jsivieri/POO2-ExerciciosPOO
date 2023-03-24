package exerciciospoo;

public class Palavra {

	String palavra;

	public Palavra(String palavra) {
		super();
		this.palavra = palavra;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	
	public void tornarMaiusculo() {
		this.setPalavra(palavra);
		System.out.println(palavra.toUpperCase());
	}
	
}
