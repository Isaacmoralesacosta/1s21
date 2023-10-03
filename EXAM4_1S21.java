//escribir un programa que solicite un radio e imprima el valor del area y la longitud de la circunferencia asociadas, el area de un circulo es:PI*(r^3)
import java.util.Scanner;
public class EXAM4_1S21 {
	Scanner lector = new Scanner(System.in);
	

	public Exa4_1s21()  {
		double rad, area, longitud;

		System.out.println("ingrese el radio del circulo");
		rad=lector.nextDouble();
		area=Math.PI*Math.pow(rad,2);
		longitud=2*Math.PI*rad;
		System.out.println("El area del circulo es: "+area);
		System.out.println("la longitud de la circunferencia es: "+longitud);

	}
	public static void main(String[] args) {
		Exa4_1s21 solucion = new Exa4_1s21();
		
	}
}