import java.util.Scanner;

public class P3p10_1s21{
	public static int alcubo(int n){
		return n * n * n; 
	}

	public static int factorial(int numero){
		 int fa = 1;
        for (int i = 1; i <= numero; i++) {
            fa *= i;
        }

		return fa;
	}
	
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador = 0;

        System.out.print("Ingresa el valor de N: ");
        int n = teclado.nextInt();

        System.out.print("Ingresa el valor de i: ");
        int i = teclado.nextInt();

        for (int j = 0; j < n; j++) {
            acumulador += (alcubo(n) * factorial(i)) / factorial(n);
        }

        System.out.println("El resultado de la sumatoria es: " + acumulador);
    }
}