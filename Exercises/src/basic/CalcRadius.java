package basic;
import java.util.Locale;
import java.util.Scanner;

public class CalcRadius {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double radius = sc.nextDouble();
		double area = (pi * (radius * radius));
		
		System.out.printf("the value of the area is %.4f", area);
		
		
		sc.close();
	}

}
