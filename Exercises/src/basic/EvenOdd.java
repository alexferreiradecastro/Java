package basic;

import java.util.Locale;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
		
		sc.close();

	}

}
