package basic;

import java.util.Locale;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, amount;
		double total;

		number = sc.nextInt();
		amount = sc.nextInt();

		if (number == 1) {
			total = amount * 4.0;
		} else if (number == 2) {
			total = amount * 4.5;
		} else if (number == 3) {
			total = amount * 5.0;
		} else if (number == 4) {
			total = amount * 2.0;
		} else {
			total = amount * 1.5;
		}

		System.out.printf("Total: R$ %.2f", total);

		sc.close();

	}

}
