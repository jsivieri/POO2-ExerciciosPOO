package exercicio13;

public class Programa {

	public static void main(String[] args) {
		 

		ContaCorrente c1 = new ContaCorrente();
		c1.setNome("João");
		c1.setSaldo(5000);
		c1.setSenha("123456");
		
		System.out.println("Saldo: "+ c1.getSaldo());
		c1.debitar("123456", 300);
		System.out.println("Saldo : "+ c1.getSaldo());
		c1.creditar("123456", 600);
		System.out.println("Saldo: "+ c1.getSaldo());

	}

}
