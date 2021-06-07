Algoritmo Ejercicio6
	
	Para i <-1 Hasta 5 Con Paso 1 Hacer
		
		Escribir "Ingresa la edad"
		leer edad
		Si edad >= 25 Entonces
			
			mayoresigualesveinte = mayoresigualesveinte + 1
			promMayoresigualesveinte = edad / mayoresigualesveinte
			
		SiNo
			menoresveinte = menoresveinte + 1
			promMenoresveinte = edad / menoresveinte
			
		Fin Si
	Fin Para
	
FinAlgoritmo
