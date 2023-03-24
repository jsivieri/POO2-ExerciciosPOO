package exerciciospoo;

public class TornarMaiuscula {

	public static void main(String[] args) {

		Palavra p1 = new Palavra(null);
		p1.setPalavra("maiusculo");
		
		Palavra p2 = new Palavra(null);
		p2.setPalavra("tEsTaNdO");
		
		p1.tornarMaiusculo();
		p2.tornarMaiusculo();	
		
	}

}
