package ClassesAuxiliares;

import Interfaces.Opera��es;

public class Conta implements Opera��es{

	private double Saldo = 500;
	
	
	
	public double getSaldo() {
		return Saldo;
	}



	@Override
	public void saque(double saque) {
		Saldo = Saldo - saque;
	}



	@Override
	public void deposito(double deposito) {
		Saldo = Saldo + deposito;
		
	}
		
		
		
}
