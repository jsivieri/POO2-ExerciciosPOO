package exerciciospoo;

public class Endereco {

	String logradouro, cidade, estado, cep;
	int numero;
	public Endereco(String logradouro, String cidade, String estado, String cep, int numero) {
		super();
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}




