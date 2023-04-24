package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {


    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Digite um valor?");
    	int valorRecebido;
    	valorRecebido= sc.nextInt();
    	
    	int a = 0, b = 0; 
    	List<Integer> valores = new ArrayList<Integer>();
    	
        for (int i = 1; i <= 50; i++) {

            if (i == 1) {
                a = 1;
                b = 0;
            } else {
                a += b;
                b = a - b;
            }
            valores.add(a);
        }
        
        if(valores.contains(valorRecebido)) {
        	System.out.println("esse numero pertence a sequencia.");
        }
        else {
        	System.out.println("esse numero não pertence a sequencia");
        }
    }


}
