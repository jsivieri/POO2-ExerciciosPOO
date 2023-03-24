package exerciciospoo;

public class Funcionario {

	String nome;
	float horas, valorHora;
	public Funcionario(String nome, float horas, float valorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getHoras() {
		return horas;
	}
	public void setHoras(float horas) {
		this.horas = horas;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
