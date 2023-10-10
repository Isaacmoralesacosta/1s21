import java.util.Scanner;
   public class p11_1s21{
      public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("ingresa una opcion [Suma,Resta,Division,Multiplicacion,Potencia,Raiz cuadrada]: ");
         String opc="Suma";
         int a;
         int b;
         int base;
         int potencia;
         int dividiendo;
         int divisor;
         double raiz;
         double c;
         opc = teclado.nextLine();
         switch(opc){
         case "Suma":
            System.out.println("aqui caso a");
         System.out.println("ingresa 2 numeros ");
         a = teclado.nextInt();
         b = teclado.nextInt();
         c = a + b;
          System.out.println("el resultado de los dos numeros es"+c);
            break;
         case "Resta":
          System.out.println("aqui caso b");
          System.out.println("ingresa dos numeros para la Resta");
          a = teclado.nextInt();
          b = teclado.nextInt();
          c = a - b; 
           System.out.println("el resultado de los dos numeros es" +c);
           break;
        case "Division":
         System.out.println("aqui caso c");
          System.out.println("ingresa dos numeros para la Division");
         a = teclado.nextInt();
         b = teclado.nextInt();
         c = a / b;
          System.out.println("el resultado de los dos numeros es" +c); 
          break;
         case "Multiplicacion":
         System.out.println("aqui caso c");
          System.out.println("ingresa dos numeros para la Multiplicacion");
         a = teclado.nextInt();
         b = teclado.nextInt();
         c = a * b;
          System.out.println("el resultado de los dos numeros es" +c); 
          break;
       case "Potencia":
         System.out.println("aqui caso d");
         System.out.println("ingresa un numero para la potencia");
         base=teclado.nextInt();
         System.out.println("ingresa la potencia");
         potencia=teclado.nextInt();
         c = Math.pow(base,potencia);
         System.out.println("el resultado es "+c);
         break;
      case "Raiz cuadrada":
         System.out.println("aqui caso e");
         System.out.println("ingresa un numero para la Raiz cuadrada");
         a=teclado.nextInt();
         System.out.println("ingresa la raiz");
         c = Math.sqrt(6);
         System.out.println("el resultado de la raiz es" +c); 
         break;

      }
   }
}
   

