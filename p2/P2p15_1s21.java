import java.util.Scanner;
public class P2p15_1s21{
	public static void main(String[] args) {
		Scanner = new Scanner(System.in);
		int [][] Ma,Mb,Mc;
		int fa,ca,fb,cb,f,c,t;
		System.out.println("ingresa el numero de filas para la Matriz A");
		fa=teclado.nextInt();
		System.out.println("ingresa el numero de columnas para la Matriz A");
		ca=teclado.nextInt();
		System.out.println("ingresa el numero de filas para la Matriz B");
		fb=teclado.nextInt();
		System.out.println("ingresa el numero de columnas para la Matriz A");
		cb=teclado.nextInt();
		if (ca == fb){
			Ma = int[fa][ca];
			Mb = int[fb][cb];
			Mc = int[fa][cb];
			for (f=0; f<fa; f++){
				for (c=0; c<ca; c++){
					System.out.println("ingresa el valor para Ma["+f+"]["+c+"]: ");
					Ma[f][c] = teclado.nextInt();
				}

			}
			for (f=0; f<fb; f++){
			for (c=0; c<cb; c++){
					System.out.println("ingresa el valor para Ma["+f+"]["+c+"]: ");
					Mb[f][c] = teclado.nextInt();
				}

			}
			//aqui empezamos a la multiplicacion
			for (f=0; f<fa; f++){
				for (c=0; c<cb; c++){
					for (t=0; t<fb; t++){
						r=Ma[f][t]*Mb[c][t] {
							
						}]
					}
					Mc[f][c]=r;



		}else{
			System.out.println("no se pude realizar el proceso de la multiplicacion");
		}
	}
}