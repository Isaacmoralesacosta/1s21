// solicitar un programa que solicite un radio e imprima el valor del volumen de la esfera utilizando el volumen de la esfera: (4/3)*PI(r^3)
import javax.swing.*;
public class EXAM3_1S21 {
	public static void main(String[] args) 
	{
		volumenEsfera();
	}

	public static void volumenEsfera()
	{
		double radio=Double.parseDouble(JOptionPane.showInputDialog("ingresa valor del radio:"));
		double volumen=(4.0/3.0) * Math.PI*(Math.pow(radio, 3));
		System.out.println("El volumen de la esfera es:"+volumen);
	}
	}