package basic;
import java.util.Locale;
import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, difference;

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();

		difference = num1 * num2 - num3 * num4;

		System.out.println("the difference is = " + difference);

		sc.close();

	}

}
