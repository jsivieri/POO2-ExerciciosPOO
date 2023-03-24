package exercicio13;

public class ContaCorrente {
	
	private String nome, senha;
	private double saldo;
	
	
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public void cadastrarSenha(String senha) {
		this.setSenha(senha);
	}
	
	public void alterarSenha(String senha, String novaSenha) {
		if (this.getSenha().equals(senha)) {
			this.setSenha(novaSenha);
			
		} else {
			System.out.println("Senha incorreta");

		}
		
	}
	
	public void debitar(String senha, double valor) {
		if (this.getSenha().equals(senha)) {
			this.setSaldo(getSaldo()-valor);
			
		} else {
			System.out.println("Senha incorreta");

		}
	}
	
	public void creditar(String senha, double valor) {
		if (this.getSenha().equals(senha)) {
			this.setSaldo(getSaldo()+valor);
			
		} else {
			System.out.println("Senha incorreta");

		}
	}

}
