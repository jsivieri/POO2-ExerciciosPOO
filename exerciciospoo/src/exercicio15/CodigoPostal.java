package exercicio15;


public class CodigoPostal {
	
	private String indicativo, nomeDaZona;
	private double extensao;
	
	
	public CodigoPostal() {
		super();
		
	}

	public String getIndicativo() {
		return indicativo;
	}

	public void setIndicativo(String indicativo) {
		this.indicativo = indicativo;
	}

	public String getNomeDaZona() {
		return nomeDaZona;
	}

	public void setNomeDaZona(String nomeDaZona) {
		this.nomeDaZona = nomeDaZona;
	}

	public double getExtensao() {
		return extensao;
	}

	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}
	
	
	
	
	public void mostrar() {
		
		System.out.println(this.getIndicativo()+" "+this.getNomeDaZona());
	}
	
	


}
