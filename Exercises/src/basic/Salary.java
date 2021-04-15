package basic;
import java.util.Locale;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, hours;
		double cost, salary;

		number = sc.nextInt();
		hours = sc.nextInt();
		cost = sc.nextDouble();
		salary = hours * cost;

		System.out.println("Number = " + number);
		System.out.printf("Salary = U$ %.2f", salary);

		sc.close();

	}

}
