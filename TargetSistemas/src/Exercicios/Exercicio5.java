package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("Digite uma palavra?");
    	String resposta;
    	resposta = sc.nextLine();
	        String[] palavraSeparada = resposta.split("");
	        for (int i = palavraSeparada.length -1 ; i >= 0 ; i--) {
	            System.out.print(palavraSeparada[i]);
	        }
	        
	}
    	
    

}
