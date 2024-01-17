package refactoring;

import java.util.Scanner;

public class Ejercicio_5_Boletin_5_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		char letra;
		
		System.out.println("Introduce una letra");
		letra=sc.next().charAt(0);
		
	
		
		if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U') {
			System.out.println("Es vocal");
			
		}
		else {
			System.out.println("No es vocal");
			
		}
		
	
	sc.close();
	}	

	
	
}


