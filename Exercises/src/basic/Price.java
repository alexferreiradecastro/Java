package basic;
import java.util.Locale;
import java.util.Scanner;

public class Price {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int piece1, number1, piece2, number2;
		double price1, price2, total;

		piece1 = sc.nextInt();
		number1 = sc.nextInt();
		price1 = sc.nextDouble();

		piece2 = sc.nextInt();
		number2 = sc.nextInt();
		price2 = sc.nextDouble();

		total = number1 * price1 + number2 * price2;

		System.out.printf("total payable: R$ %.2f", total);

		sc.close();

	}

}
