package basic;

import java.util.Locale;
import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("Not negative");
		}
		
		sc.close();
	}

}
