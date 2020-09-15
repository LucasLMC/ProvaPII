package br.edu.questoes;

import java.util.Scanner;

public class questao2 {
	
		  public static void main(String[] args) {
			Scanner testando = new Scanner (System.in);
		    String palavra;
		    int letra;
		    System.out.println("Informe a frase: ");
		    palavra = testando.nextLine();
		    
		    letra = palavra.length();
		    char[] arrayTemporaria = new char[letra];
		    char[] arrayCaractere = new char[letra];
		 
		    for (int i = 0; i < letra; i++) {
		      arrayTemporaria[i] = palavra.charAt(i);
		    }
		 
		    for (int j = 0; j < letra; j++) {
		      arrayCaractere[j] = arrayTemporaria[letra - 1 - j];
		    }
		 
		    String palindromoReverso = new String(arrayCaractere);
		    System.out.println(palindromoReverso);
		  
		    testando.close();
		  }
	}
