package basic;
import java.util.Locale;
import java.util.Scanner;

public class Geometry {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numberA, numberB, numberC, triangle, circle, trapezio, square, rectangle;
		
		numberA= sc.nextDouble();
		numberB = sc.nextDouble();
		numberC = sc.nextDouble();
		
		triangle = numberA * numberC / 2.0;
		circle = 3.14159 * numberC * numberC;
		trapezio = (numberA + numberB) / 2.0 * numberC;
		square = numberB * numberB;
		rectangle = numberA * numberB;
		
		System.out.printf("Triangle: %.3f%n", triangle);
		System.out.printf("Circle: %.3f%n", circle);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Square: %.3f%n", square);
		System.out.printf("Rectangle: %.3f%n", rectangle);
		
		
		sc.close();

	}

}
