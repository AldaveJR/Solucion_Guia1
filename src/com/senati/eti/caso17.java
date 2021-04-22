package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class caso17 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		DecimalFormat y = new DecimalFormat("#.00");
		System.out.print("Número de aprobados......: ");
		int na = x.nextInt();
		System.out.print("Número de desaprobados...: ");
		int nd = x.nextInt();
		System.out.print("Número de retirados......: ");
		int nr = x.nextInt();
		//equivalente porcentual
		//18 varones -> 18/19  -> 0.9474 x100 -> 94.74%
		//01 dama    -> 1/19   -> 0.0526 x100 ->  5.26%
		//candidato 1 -->2594  ->2594 / 7196x100  -> 36.05%
		//candidato 2 -->1682  ->1682 / 7196x100  -> 23.37%
		//candidato 3 -->1527  ->1527 / 7196x100  -> 21.22%
		//candidato 4 -->1393  ->1393 / 7196x100  -> 19.35%
		//               ----
		//Total       -->7196
		
		float total = na + nd + nr;

		float p_na = na / total *100;
		float p_nd = nd / total *100;
		float p_nr = nr / total *100;
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Aprobados... " + y.format(p_na) + "%");
		System.out.println("desaprobados... " + y.format(p_nd) + "%");
		System.out.println("retirados... " + y.format(p_nr) + "%");

	}

}
