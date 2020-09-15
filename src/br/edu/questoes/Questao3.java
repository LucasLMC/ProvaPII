package br.edu.questoes;

import java.util.Scanner;

public class Questao3 {
	
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        
        String palavra = "";
        
        System.out.println("Digite a palavra: ");
        String nome = leitura.nextLine();
        for (int i = (nome.length() - 1);i >= 0; i--) {
            palavra = palavra + nome.charAt(i);
        }
        if (palavra.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }
        leitura.close();
    }
}
