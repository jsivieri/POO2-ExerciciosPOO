package exerciciospoo;

public class ImprimirFunc {

	public static void main(String[] args) {
		
		Funcionario joao = new Funcionario(null, 0, 0);
		joao.setNome("João");
		joao.setHoras(20);
		joao.setValorHora((float) 3.5);
		
		Funcionario mateus = new Funcionario(null, 0, 0);
		mateus.setNome("Mateus");
		mateus.setHoras(40);
		mateus.setValorHora((float) 5.5);
		
		Funcionario lucas = new Funcionario(null, 0, 0);
		lucas.setNome("Lucas");
		lucas.setHoras(40);
		lucas.setValorHora((float) 13.5);
		
		System.out.println("Nome: "+joao.getNome()+"   Salário: R$ "+joao.getHoras()*joao.getValorHora());
		System.out.println("Nome: "+mateus.getNome()+"   Salário: R$ "+mateus.getHoras()*mateus.getValorHora());
		System.out.println("Nome: "+lucas.getNome()+"   Salário: R$ "+lucas.getHoras()*lucas.getValorHora());

	}

}
