package area;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		double p, areax, areay;
		
		System.out.println("Digite as medidas do triangulo A");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		p = (x.a + x.b +x.c ) / 2.0;
		areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
				
		System.out.println("Digite as medidas do triangulo B");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (y.a + y.b + y.c) / 2.0;
		areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("%.4f%n",areax);
		System.out.printf("%.4f%n",areay);
		
		if (areax > areay) {
			System.out.println("Area A é maior");
		} else {
			System.out.println("Area Y é maior");
		}
		
		
		sc.close();

	}

}
