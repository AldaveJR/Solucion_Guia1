package com.senati.eti;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Ingrese nombre......: ");
	    String nombre = x.nextLine();
	    System.out.print("Ingrese apellido....: ");
	    String apellido = x.nextLine();
	    
	    System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("alumno..........: "+ nombre.toUpperCase() + " " + 
		                                         apellido.toUpperCase());
		
		

	}

}
