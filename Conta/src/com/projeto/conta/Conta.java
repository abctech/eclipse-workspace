package com.projeto.conta;

public class Conta {

	int numeroConta;
	double saldo = 100;
	
	public void depositar(double valorDepositar) {
		this.saldo = this.saldo+ valorDepositar;
	}
	public void sacar (double valorSacar) {
		
	}
	
}
