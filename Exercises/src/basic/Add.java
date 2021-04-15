package basic;
import java.util.Locale;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		int result = number1 + number2;
		System.out.println("The result of the sum is " + result);

		sc.close();

	}

}
