import java.util.Scanner;


public class Ejercicio6{

public static void main(String [] args){


	int edad;
	int mayoresIgualesVeinte = 0;
	int menoresVeinte = 0;
	int promMenoreVeinte = 0;
	int promMayoresIguales = 0;
	int sumaEdadMayoresVeinte = 0;
	int sumaEdadMenoresVeinte = 0;
	Scanner scanner = new Scanner(System.in);




	for (int i=0 ; i < 10 ; i++ ) {
		
		System.out.println("\nIngresa la edad");
		edad = scanner.nextInt();

		if (edad >= 25) {

			

			mayoresIgualesVeinte++;

			sumaEdadMayoresVeinte += edad;

			System.out.println("acumulado: "+sumaEdadMayoresVeinte);
			
			promMayoresIguales = sumaEdadMayoresVeinte / mayoresIgualesVeinte;

		}

		else{
			menoresVeinte++;


			sumaEdadMenoresVeinte+= edad;
			System.out.println("acumulado: "+ sumaEdadMenoresVeinte);
			promMenoreVeinte = sumaEdadMenoresVeinte / menoresVeinte;

		}
	}

		System.out.println("\nEl promedio de edad de las personas menores a 25 es de " + promMenoreVeinte+" años , y el promedio de las personas con 25 años es de "+ promMayoresIguales+ "años");

  }

}
