package fundamentos;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		System.out.println("Tabuada do 12");
		for (int tabuada = 0; tabuada <= 12; tabuada++) {			
			System.out.println("12 x " + tabuada + " = " + (12 * tabuada));
		}
		
		int number = 10;
		while( number < 20) {
			System.out.println("não permitido" + number);
			number++;
		}
		
	}

}
