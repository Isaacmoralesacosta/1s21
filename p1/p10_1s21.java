import java.util.Scanner;
   public class p10_1s21{
      public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("ingresa una opcion [a,b,c,d,e]: ");
         String opc="a";
         opc=teclado.nextLine();
         switch(opc){
         case "a":
            System.out.println("aqui caso a");
            break;
         case "b":
            System.out.println("aqui caso b");
            break;
         case "c":
            System.out.println("aqui caso c");
            break;
         case "d":
            System.out.println("aqui caso d");
            break;
         case "e":
            System.out.println("aqui caso e");
            break;
      }
   }
}