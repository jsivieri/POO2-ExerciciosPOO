package exerciciospoo2;

public class Aluno extends Pessoa{
	
	double n1,n2;

	public Aluno(String nome, String cpf, int idade, double n1, double n2) {
		super(nome, cpf, idade);
		this.n1 = n1;
		this.n2 = n2;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public void media() {
		
		System.out.println("Média do aluno "+getNome()+" é: "+(getN1()+getN2())/2);
		
	}
	

}
