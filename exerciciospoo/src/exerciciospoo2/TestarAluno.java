package exerciciospoo2;

public class TestarAluno {

	public static void main(String[] args) {
		 

		Aluno a1 = new Aluno(null, null, 0, 0, 0);
		a1.setNome("Ana");
		a1.setN1(10);
		a1.setN2(9);
		
		Aluno a2 = new Aluno(null, null, 0, 0, 0);
		a2.setNome("Beto");
		a2.setN1(9);
		a2.setN2(10);
		
		
		a1.media();
		a2.media();
	}

}
