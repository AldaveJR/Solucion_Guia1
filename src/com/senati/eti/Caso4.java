package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		float num1 = 0 , num2= 0;
		System.out.print("Primer Número....:");
		num1 = x.nextFloat();
		
		System.out.print("Segundo Número....:");
		num2 = x.nextFloat();
		float suma = num1 + num2;
		float resta = num1 - num2;
		float producto = num1 * num2;
		float division = num1 / num2;
		float restoentero = num1 % num2;
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Suma....:" +suma);
		System.out.println("Resta....:" +resta);
		System.out.println("Producto....:" +producto);
		System.out.println("Division....:" +division);
		System.out.println("Restoentero....:" +restoentero);


	}

}
