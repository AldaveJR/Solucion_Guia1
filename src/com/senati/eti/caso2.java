package com.senati.eti;
//Importando la libreria para lectura de datos
import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia a la clase Scanner
		//Creado un objeto x a partir de la clase scanner
		Scanner x = new Scanner(System.in);
		
		//Declarar la variable
		int numero = 0 ;
		
		System.out.print("Ingrese número:");
		numero = x.nextInt();
		//Impresion
		System.out.println("\nNúmero Ingresado");
		System.out.println("------------------");
		System.out.println("Número......:"+ numero);
		

	}

}
