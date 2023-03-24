package exerciciospoo2;

public class Testar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, null, 0);
		p1.setNome("Arnaldo");
		p1.setCpf("045.685.956.15");
		p1.setIdade(65);
		
		Pessoa p2 = new Pessoa(null, null, 0);
		p2.setNome("Marlene");
		p2.setCpf("047.485.152.10");
		p2.setIdade(46);
		
		
		p1.testar();
		p2.testar();
		
	}
	
	
	  

}
