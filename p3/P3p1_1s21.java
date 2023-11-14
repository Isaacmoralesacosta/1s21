import java.util.Scanner;
public class P3p1_1s21{
	static Scanner teclado = new Scanner(System.in);
	public static void Suma(){
		System.out.println("Suma de dos numeros");
		System.out.println("ingresa el primer numero");
		int a=teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a+b;
		System.out.println("la suma fue" +c);
	}
     public static void Resta(){
		System.out.println("Resta de dos numeros");
		System.out.println("ingresa el primer numero");
		int a=teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a-b;
		System.out.println("la resta fue " +c);
	}
	 public static void Multiplicacion(){
		System.out.println("Multiplicacion de dos numeros");
		System.out.println("ingresa el primer numero");
		int a=teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a*b;
		System.out.println("la Multiplicacion fue " +c);
	}
	public static void Division(){
		System.out.println("Division de dos numeros");
		System.out.println("ingresa el primer numero");
		int a=teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a/b;
		System.out.println("la Division fue " +c);
	}
		public static void menu(){
			System.out.println("operaciones basicas");
			System.out.println("\nA) Suma");
			System.out.println("B) Resta");
			System.out.println("\nC) Multiplicacion");
			System.out.println("D) Division");

			System.out.println("\nque opcion deseas");
			}
		public static void main(String[] args) {
			menu();
			String opc=teclado.nextLine();
			if (opc.equals("A"))Suma();
			if (opc.equals("B"))Resta();
			if (opc.equals("C"))Multiplicacion();
			if (opc.equals("D"))Division();
		}
	}
	