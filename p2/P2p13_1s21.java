import java.util.Scanner;
public class P2p13_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int f,c;
		System.out.println("ingresa el numero de filas");
		f = teclado.nextInt();
		System.out.println("ingresa el numero de columnas");
		c = teclado.nextInt();
		int [] [] MA = new int [f] [c];
		int [] [] MB = new int [f] [c];
		int [] [] MC = new int [f] [c];
		int ff,fc;
		for (ff=0; ff<f; f++){
		for (fc=0; fc<c; c++){
		System.out.println("ingrese el valor para la posicion ["+ff+"]["+fc+"]");
		MA[ff][fc] = teclado.nextInt();
	}
}
        for (ff=0; ff<f; f++){
		for (fc=0; fc<c; c++){
		System.out.println("ingrese el valor para la posicion ["+ff+"]["+fc+"]");
		MB[ff][fc] = teclado.nextInt();
		}
	}

        for (ff=0; ff<f; f++){
		for (fc=0; fc<c; c++){
		MC[ff][fc]=MA[ff][fc]+MB[ff][fc];
	}
}
        for (ff=0; ff<f; f++){
        	for (fc=0; fc<c; c++){
        		System.out.println("el resultado de la suma de la matriz en su pocicion ["+ff+"]["+fc+"]es"+MC[ff][fc]);
        	}
        }
    }
}



