Algoritmo Ejercicio6
	
	Para i <-1 Hasta 100 Con Paso 1 Hacer
		
		Escribir "Ingresa la edad"
		leer edad
		Si edad >= 25 Entonces
			
			mayoresigualesveint = mayoresigualesveit + 1
			promMayoresigualesveinte = edad / mayoresigualesveint
			
		SiNo
			menoresveint = menoresveint + 1
			promMenoresveint = edad / menoresveint
			
		Fin Si
		
	Fin Para
	Escribir " el promedio de edad de las personas menores a 25 es de ",promMenoresveint , " años , y el promedio de las personas con 25 años es de ", promMayoresigualesveinte, "años"
FinAlgoritmo
