package com.projeto.variaveisjava;

public class Variavel {
	 //Variáveis 
    //Byte - Números - 1,2,10 -128 até 127
    //int - Números - 1000,23003,2,1
    //Long - Números - 1000000,2,1
    //float - Números decimais - 1.243 2.3456
    
    //double - Números Decimais com maior precisão - 1.234456
    //Boolean - Valores Booleanos - true / false
    //String - texto - "cafe" - "Escola". "Reginaldo Barros"
    
    public static void main(String[] args) {
        //<tipo> <Nome>
        
        byte minhaVariavelByte = 10;
        int minhaVariavelInt = 10000;
        long minhaVariavelLong = 100000;
        float minhaVariavelFloat = 2.33445f;
        double minhaVariavelDouble = 1.4234545;
        boolean minhaVariavelBoolean = false;
        String minhaVariavelString = "Reginaldo Barros de Sousa ";
        
        
        
        
        
        System.out.println(minhaVariavelByte);
        System.out.println(minhaVariavelInt);
        System.out.println(minhaVariavelLong);
        System.out.println(minhaVariavelFloat);
        System.out.println(minhaVariavelDouble);
        System.out.println(minhaVariavelBoolean);
        System.out.println(minhaVariavelString +  minhaVariavelByte);
        
	}

}
