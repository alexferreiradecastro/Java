package basic;

import java.util.Locale;
import java.util.Scanner;

public class Between {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double number;

		number = sc.nextDouble();

		if (number >= 0.0 && number <= 25.0) {
			System.out.println("between (0, 25)");
		} else if (number > 25.0 && number <= 50.0) {
			System.out.println("between (25, 50)");
		} else if (number > 50.0 && number <= 75.0) {
			System.out.println("between (50, 75)");
		} else if (number > 75.0 && number <= 100.0) {
			System.out.println("between (75.0, 100.0)");
		} else {
			System.out.println("Out of range");
		}

		sc.close();

	}

}
