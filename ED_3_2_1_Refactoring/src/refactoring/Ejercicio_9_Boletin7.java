package refactoring;

public class Ejercicio_9_Boletin7 {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
			String[] nombres = {
				    "Juan", "María", "Carlos", "Laura", "Pedro", "Ana", "Luis", "Sofía", "Diego", "Elena",
				    "Pablo", "Lucía", "Fernando", "Valeria", "Javier", "Rosa", "Andrés", "Clara", "Miguel",
				    "Isabel", "Gabriel", "Martina", "Ricardo", "Carmen", "José", "Daniela", "Raúl", "Lorena",
				    "Adrián", "Victoria"
				};
			int[] horasTrabajadas = {40, 35, 42, 38, 40, 37, 45, 33, 40, 36,
	                41, 39, 37, 40, 38, 36, 42, 34, 40, 37,
	                39, 43, 38, 35, 40, 36, 44, 38, 40, 37};
			
			int[] salario=new int[horasTrabajadas.length];
			
			
			//Multiplica por 20 cada sueldo
			for(int i=0;i<nombres.length;i++) {
				horasTrabajadas[i]*=20;
				
			}
			//Igualamos el sueldo al primer sueldo de la primera posicion y hacemos el condicional para poder mostrar el maximo sueldo y el minimo
			
			
			for(int i=0;i<salario.length;i++) {
				
				salario[i]=horasTrabajadas[i];
			}
			
			int sueldoMax=horasTrabajadas[0];
			int sueldoMin=horasTrabajadas[0];
			String EmpleadoMax="";
			String EmpleadoMin="";
			
			for(int i=0;i<nombres.length;i++) {
				
				System.out.println(nombres[i]+" cobra "+salario[i]);
				
				if(salario[i]>sueldoMax) {
					sueldoMax=salario[i];
					EmpleadoMax=nombres[i];
				}
				if(salario[i]<sueldoMin) {
					sueldoMin=salario[i];
					EmpleadoMin=nombres[i];
				}
			}
			System.out.println(EmpleadoMax+" es el empleado que mas cobra");
			System.out.println(EmpleadoMin+" es el empleado que  menos cobra");
			
			
			
		}
		

	}

