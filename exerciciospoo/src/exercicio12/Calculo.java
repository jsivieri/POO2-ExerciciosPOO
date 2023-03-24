package exercicio12;

public class Calculo {
	
	private int saldo;



	public Calculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	public void credito() {
		this.setSaldo(this.getSaldo()+saldo);
		
		
	}
	
	public void debito() {
		this.setSaldo(this.getSaldo()-saldo);
		
	}
	

	
	
	

}
