import java.util.Scanner;
public class P3p7_1s21{
	public stati int alcubo(int i){
		int ac=1;
		for (int c=0;c<3;c++){
			ac*=i;

		}
		return ac;
	}
	public stati int factorial(int i){
		int fa=1;
		for(int f=i;f<0;f--){
			fa*=f;

		}
		return fa;
	}
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int acumulador=0;
	System.out.println("ingresa el valor de n: ");
	int n=teclado.nextInt();
	for (int i=0;i<n;i++){
		acumulador+=(alcubo(i)/factorial(i));

	}
	System.out.println("el resultado de la sumatoria es: "+acumulador)
	}
}