import java.util.Scanner;
public class P2p7_1s21{
	public static void main(String[] args) {
		char opc;
		Scanner teclado = new Scanner(System.in);
		boolean estado = true;
		do{
			System.out.println("MENU DE OPERACIONES");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Division");
			System.out.println("4.- Multiplicacion");
			System.out.println("S.- Salir");
			System.out.println("s.- Salir");
			System.out.println("que opcion deseas?");
			opc  = teclado.nextLine().charAt(0);
			switch(opc){
			case '1': System.out.println("haremos una Suma"); break;
			case '2': System.out.println("haremos una Resta"); break;
			case '3': System.out.println("haremos una Division"); break;
			case '4': System.out.println("haremos una Multiplicacion"); break;
			case 'S': 
			case 's':
			System.out.println("aqui va la opcion de salir");
			estado=false;

			break; 
			}
		}while(estado);
	}
}