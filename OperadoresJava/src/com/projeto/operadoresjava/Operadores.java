package com.projeto.operadoresjava;

public class Operadores {
	
	// somar (+)
	// Subtrair (-)
	// Multiplicação (*)
	// divisão (/)
	// Módulo - resto da dvisão (%)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeiro =10 ;
		int segundo = 2 ;
		int resultado = 0;
		int resultado1 = 0;
		int resultado2 = 0;
		int resultado3 = 0;
		int resultado4 = 0;
		resultado = primeiro + segundo;
		resultado1 = primeiro - segundo;
		resultado2 = primeiro * segundo;
		resultado3 = primeiro / segundo;
		resultado4 = primeiro % segundo;
		
		System.out.println( "Soma" + "=" + resultado );
		System.out.println("Subtração" + "=" +resultado1);
		System.out.println("Multiplicação " + "=" + resultado2);
		System.out.println("Divisão " + "=" + resultado3);
		System.out.println("Módulo" + "=" + resultado4);

	}

}
