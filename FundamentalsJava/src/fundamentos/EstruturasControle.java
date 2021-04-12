package fundamentos;

public class EstruturasControle {

	public static void main(String[] args) {
		char sexo = 'F';
		if (sexo == 'M') {
			System.out.println("Alistamento obtigatório");
		} else if (sexo == 'F') {
			System.out.println("Alistamento opcional");
		} else {
			System.out.println("Digite novamente");
		}
		
		int choice = 3;
		
		switch (choice) {
		case 1:
			System.out.println("begin");
			break;
		case 2:
			System.out.println("middle");
			break;
		case 3:
			System.out.println("end");
			break;
		default:
			System.out.println("inválido");
			break;
		}
		
	}
}
