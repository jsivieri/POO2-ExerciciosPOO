package exerciciospoo2;

public class Pessoa {

	String nome, cpf;
	int idade;
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void testar() {
		
	System.out.println("Nome: "+getNome()+"   CPF: "+getCpf()+"   Idade: "+getIdade());
		
	}

		
		
		
}
