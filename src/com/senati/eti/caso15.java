package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class caso15 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		DecimalFormat y = new DecimalFormat("#.00");
		System.out.print("Ingrese cantidad......: ");
		int cantidad = x.nextInt();
		System.out.print("Ingrese precio..........:");
		float precio = x.nextFloat();
		
		float importe1= cantidad * precio;
		float importe2 = (float)(importe1 / 3.24);
		float importe3 = importe1 / 3.75f;
		//float importe2 = importe1 / 3.24f-( otra forma de aplicar cast)
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Importe S/: " + y.format(importe1));
		System.out.println("Importe U$/: " + y.format(importe2));
		System.out.println("Importe €/: " + y.format(importe3)); 
	}

}
