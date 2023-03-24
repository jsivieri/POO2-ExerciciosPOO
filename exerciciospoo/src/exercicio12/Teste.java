package exercicio12;

public class Teste {

	public static void main(String[] args) {


		Calculo c1 = new Calculo();
		c1.setSaldo(400);
		
		
		
		
		System.out.println("Saldo antes: "+c1.getSaldo());
		c1.credito();
		System.out.println("Saldo após depósito: "+c1.getSaldo());
		c1.debito();
		System.out.println("Saldo após saque: "+c1.getSaldo());
		

	}

}
