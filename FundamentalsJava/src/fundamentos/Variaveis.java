package fundamentos;

public class Variaveis {

	public static void main(String[] args) {
		System.out.println("Uso de variáveis em Java");
		double i = 12;
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " x 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 6       | i = " + (i += 6));
		System.out.println("i -= 6       | i = " + (i -= 6));
		System.out.println("i *= 6       | i = " + (i *= 6));
		System.out.println("i /= 6       | i = " + (i /= 6));
		i--;
		System.out.println("i--          | i = " + i);
		i++;
		System.out.println("i++          | i = " + i);

	}

}
