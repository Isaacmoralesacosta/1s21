import java.util.Scanner;
public class EXAM8_1S21{
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Tabla de multiplicar");
	int numero=scanner.nextInt();
	for (int i = 1; i <=9; i++) {
		System.out.println(i);
		//numero*i= (numero*i)
		System.out.println(numero+"*"+i+"="+(numero*i));
	}
}
}