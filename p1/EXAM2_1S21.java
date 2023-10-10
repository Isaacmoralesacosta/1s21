//Escribir un programa que acepte el valor de un angulo,medido en grados e imprima su valor en radianes (Nota: PI radianes = 180 grados) defina para ello la constante PI como 3.1416
import java.util.Scanner;
 public class EXAM2_1S21 {
 	public static void main(String[] args) {
 		Scanner input = new Scanner(System.in);
 		System.out.print("ingresa el valor del angulo en grados: ");
 		double grados =input.nextDouble();
 		// Convierte grados a radianes utilizando la formula: radianes = grados * (PI / 180)
 		double radianes = grados * (Math.PI / 180.0);
 		System.out.println("El valor en radianes es: " + radianes);
 		input.close();
 	}
 }