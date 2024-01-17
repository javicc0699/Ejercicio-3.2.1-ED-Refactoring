package refactoring;

import java.util.Scanner;

public class Ejercicio_3_Boletin_5_1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			int eleccion=0;
			double altura=0, radio=0,area=0,volumen=0;
			
			
				
				while(!(eleccion==1 || eleccion==2)) {
					
					System.out.print("Si desea calcular pulse el area pulse 1, si desea calcular el volumen pulse 2: ");
					eleccion=sc.nextInt();
					
					if(eleccion==1) {
						System.out.println("Cálculo del área");
						System.out.println("Introduce la altura");
						altura=sc.nextDouble();
						
						if (altura<=0) {
							System.out.println("Error al introducir la altura");
							
						}
						else {
							System.out.println("Introduce el radio");
							radio=sc.nextDouble();
							
							if(radio<=0){
								System.out.println("Error al introducir el radio");
								
							}
							else {
								area=2*3.14*radio*(radio+altura);
								System.out.println("El area es "+area);
							}
						}
					}
					else if(eleccion==2) {
						System.out.println("Cálculo del volumen");
						System.out.println("Introduce la altura");
						altura=sc.nextDouble();
						
						if (altura<=0) {
							System.out.println("Error al introducir la altura");
							
						}
						else {
							System.out.println("Introduce el radio");
							radio=sc.nextDouble();
							
							if(radio<=0){
								System.out.println("Error al introducir el radio");
								
							}
							else {
								volumen=3.14*radio*radio*altura;
								System.out.println(volumen);
							}
						}
						
					}
					else {
						System.out.println("ERROR,solo se puede introducir 1 o 2");
					}
					
				}

			
			sc.close();

			}

}
