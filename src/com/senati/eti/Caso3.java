package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		float num1 = 0 , num2= 0;
		System.out.print("Primer Número....:");
		num1 = x.nextFloat();
		
		System.out.print("Segundo Número....:");
		num2 = x.nextFloat();
		System.out.println("Números Ingresados");
		System.out.println("------------------");
		System.out.println("Numero 1....:" +num1);
		System.out.println("Numero 2....:" +num2);

	}

}
