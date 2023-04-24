package Exercicios;


public class Exercicio3 {


    public static void main(String[] args) {
    int [] sequencia1 = new int[5];
    int [] sequencia2 = new int[7];
    int [] sequencia3 = new int[8];
    int [] sequencia4 = new int[5];
    int [] sequencia5 = new int[7];
    int [] sequencia6 = new int[8];
    
    	sequencia1[0]= 1;
    	sequencia1[1]= 3;
    	sequencia1[2]= 5;
    	sequencia1[3]= 7;
    	sequencia1[4]= sequencia1[3] + 2;
    	System.out.println(sequencia1[4]);
    	
    	sequencia2[0]= 2;
    	sequencia2[1]= 4;
    	sequencia2[2]= 8;
    	sequencia2[3]= 16;
    	sequencia2[4]= 32;
    	sequencia2[5]= 64;
    	sequencia2[6]= sequencia2[5]*2;
    	System.out.println(sequencia2[6]);
    	
    	sequencia3[0]= 0;
    	sequencia3[1]= 1;
    	sequencia3[2]= 4;
    	sequencia3[3]= 9;
    	sequencia3[4]= 16;
    	sequencia3[5]= 25;
    	sequencia3[6]= 36;
    	sequencia3[7]= sequencia3[6] + 13;
    	System.out.println(sequencia3[7]);

    	sequencia4[0]= 4;
    	sequencia4[1]= 16;
    	sequencia4[2]= 36;
    	sequencia4[3]= 64;
    	sequencia4[4]= 10 * 10;
    	System.out.println(sequencia4[4]);

     	sequencia5[0]= 1;
     	sequencia5[1]= 1;
     	sequencia5[2]= 2;
     	sequencia5[3]= 3;
     	sequencia5[4]= 5;
     	sequencia5[5]= 8;
     	sequencia5[6]= sequencia5[5] + sequencia5[4] ;
     	System.out.println(sequencia5[6]);
     	
    	sequencia6[0]= 2;
    	sequencia6[1]= 10;
    	sequencia6[2]= 12;
    	sequencia6[3]= 16;
    	sequencia6[4]= 17;
    	sequencia6[5]= 18;
    	sequencia6[6]= 19;
    	sequencia6[7]= 200;
    	System.out.println(sequencia6[7]);
    }

}
