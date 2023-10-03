import java.util.Scanner;
public class EXAM5_1S21 {
	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
// primero pedir las longitudes de a,b,c
//calcular el semiperimetro (s)
//calcular el area utilizando la formula indicada (raiz cuadrada, s* (s - a) * (s - b) * (s-c));
//resultado del area
		System.out.println("ingresa la longitud del lado a: ");
		double a = cal.nextDouble();
		System.out.println("ingresa la longitud del lado b: ");
		double b = cal.nextDouble();
		System.out.println("ingresa la longitud del lado c: ");
		double c = cal.nextDouble();
		double s = (a + b + c) / 2.0;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("El area del triangulo es: "+  area);
		cal.close();
	}
}