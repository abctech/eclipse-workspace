package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) {
		
		multiplicar(2,5);
		multiplicar(3,6);
	}
	
	public static void meuMetodo( ) {
		
		// corpo do método
		System.out.println("Esse é o meu Metódo");
		
	}

	public static void multiplicar(int numero1,int numero2) {
		int resultado = 0;
		
		resultado = numero1 * numero2;
		System.out.println(resultado);
	}
}
