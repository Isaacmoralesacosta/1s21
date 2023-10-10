// Rectangulo de asteriscos
import java.util.Scanner;
  public class EXAM_1S21{
  	//escribir un programa que escruba un rectangulo de 4 x 9 asteriscos, utilizando el caracter asterisco (*)
  	public static void main(String[] args) {
  		Scanner sc = new Scanner (System.in);
  		System.out.println("Dime el alto del rectangulo");
  		int ancho = sc.nextInt();
  		System.out.println("Dime el ancho del rectangulo");
  		int alto = sc.nextInt();
  		for (int columna = 1; columna <= ancho; columna++)
  		{
  				for (int fila = 1; fila <= alto; fila++)
  			{
  				if ((fila == 1) || (fila == alto)
  				    || (columna == 1) || (columna == ancho))
  				 System.out.print("*");
  			else 
  				System.out.print(" ");
  			}
  			System.out.println();
  		}
  	}
  }