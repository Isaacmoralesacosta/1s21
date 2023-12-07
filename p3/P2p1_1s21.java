public class P2p1_1s21{
	public static void main(String[] args) {
		int a=12;
		if (a<10){
			System.out.println("si ingreso por que es verdadero");
		} 
		if (a>10){
			System.out.println("este segmento si se ejecuta porque se cumple las condiciones");
		}
		if (true){
			System.out.println("aqui se ejecuta porque es verdadero");
		}
		if (false){
			System.out.println("aqui no se ejecuta porque es falso");
		}
		if ((a>10 == true)){
			System.out.println("se ejecuta por ser 1¿?");
		}
		System.out.println("continuamos el codigo");
		System.out.println("");
		a=18;
		if (a>17){
			System.out.println("eres mayor de edad");
		} else {
			System.out.println("eres menor de edad");
		}
		a=2;
		if (a ==1){
			System.out.println("se evaluo a 1");

		} else if (a ==2){
			System.out.println("se evaluo a 2");
		} else if (a ==3){
			System.out.println("se evaluo a 3");
		} else {
			System.out.println("se evaluaron los demas digitos");
		}
		// como valido que no puedo realizar una division entre 0
		int divisor=0;
		int dividiendo=0;
		if (divisor ==0){
			System.out.println("no es posible realizar una division");
		} else {
			System.out.println("cualquier otro numero si puede realizar la division");
		}
	}
}