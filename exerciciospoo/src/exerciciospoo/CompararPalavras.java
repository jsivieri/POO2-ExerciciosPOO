package exerciciospoo;

public class CompararPalavras {

	public static void main(String[] args) {

		PalavrasIguais p1 = new PalavrasIguais(null, null);
		p1.setPalavra1("Joao");
		p1.setPalavra2("Joao");
		
		PalavrasIguais p2 = new PalavrasIguais(null, null);
		p2.setPalavra1("Lilian");
		p2.setPalavra2("Joao");
		
		p1.comparar();
		p2.comparar();
		
	}

}
