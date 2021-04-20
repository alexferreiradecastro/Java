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

		double areax, areay;

		System.out.println("Digite as medidas do triangulo A");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		areax = x.area();
		areay = y.area();

		System.out.println("Digite as medidas do triangulo B");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		System.out.printf("%.4f%n", areax);
		System.out.printf("%.4f%n", areay);

		if (areax > areay) {
			System.out.println("Area A é maior");
		} else {
			System.out.println("Area Y é maior");
		}

		sc.close();

	}

}
