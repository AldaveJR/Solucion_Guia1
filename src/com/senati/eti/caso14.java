package com.senati.eti;

import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Ingrese número: ");
		int n = x.nextInt(); 
		// sumatoria -> 
		//n = 4 ->
		//r = 1+2+3+4= 10
		//r = (4x (4+1) ) / 2 -->10
		int r = (n * (n +1)) /2;
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Sumatoria..........: "+ r );
		
		
		

	}

}
