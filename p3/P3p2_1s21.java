import java.util.Scanner;
public class P2p5_1s21 {
    static Scanner teclado = new Scanner(System.in);
    public static void Suma() {
        System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a+b;
        System.out.println("la suma fue" + c);
    }
    public static void Resta() {
        System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a-b;
        System.out.println("la suma fue" + c);   
    }
    public static void Multiplicacion() {System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a*b;
        System.out.println("la suma fue" + c);   
    }

    public static void Division() {
        System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a/b;
        System.out.println("la suma fue" + c);   
    }

    public static void menu() {
        System.out.println("Operaciones básicas");
    }
    public static void main(String[] args) {
        char opc;
        do {
            menu();
            System.out.println("\nA) Suma");
            System.out.println("B) Resta");
            System.out.println("C) Multiplicacion");
            System.out.println("D) Division");
            System.out.println("\n¿Qué opción deseas?");
            System.out.println("\nPresiona 's' para salir");
            opc = teclado.next().charAt(0);
            switch (opc) {
                case 'A':
                import java.util.Scanner;

public class P2p5_1s21 {
    static Scanner teclado = new Scanner(System.in);

    public static void Suma() {
        System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a+b;
        System.out.println("la suma fue" + c);
    }

    public static void Resta() {
        System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a-b;
        System.out.println("la suma fue" + c);
        
    }

    public static void Multiplicacion() {System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a*b;
        System.out.println("la suma fue" + c);
        
    }

    public static void Division() {
        System.out.println("Suma de dos numeros");
        System.out.println("ingresa el primer numero");
        int a=teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=teclado.nextInt();
        int c=a/b;
        System.out.println("la suma fue" + c);
        
    }

    public static void menu() {
        System.out.println("Operaciones básicas");
    }

    public static void main(String[] args) {
        char opc;
        do {
            menu();
            System.out.println("\nA) Suma");
            System.out.println("B) Resta");
            System.out.println("C) Multiplicacion");
            System.out.println("D) Division");
            System.out.println("\n¿Qué opción deseas?");
            System.out.println("\nPresiona 's' para salir");

            opc = teclado.next().charAt(0);

            switch (opc) {
                case 'A':
                case 'a':
                    Suma();
                    break;
                case 'B':
                    Resta();
                    break;
                case 'C':
                    Multiplicacion();
                    break;
                case 'D':
                    Division();
                    break;
                case 's':
                case 'S':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opc != 'S' && opc != 's');
    }
}	
                    Suma();
                    break;
                case 'B':
                    Resta();
                    break;
                case 'C':
                    Multiplicacion();
                    break;
                case 'D':
                    Division();
                    break;
                case 's':
                case 'S':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opc != 'S' && opc != 's');
    }
}

	