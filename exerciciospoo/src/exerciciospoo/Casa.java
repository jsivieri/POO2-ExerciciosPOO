package exerciciospoo;

public class Casa {

	public Pessoa pessoa;
	public Endereco endereco;
	
	public Casa(Pessoa pessoa, Endereco endereco) {
		super();
		this.pessoa = pessoa;
		this.endereco = endereco;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
