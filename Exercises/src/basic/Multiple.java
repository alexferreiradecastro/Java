package basic;

import java.util.Locale;
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Multiple numbers");
		} else {
			System.out.println("Numbers are not multiple");
		}
		
		sc.close();

	}

}
