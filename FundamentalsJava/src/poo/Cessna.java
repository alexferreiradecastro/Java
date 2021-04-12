package poo;

public class Cessna {

	public static void main(String[] args) {
		Aviao cessna = new Aviao();
		cessna.ano = 2012;
		cessna.cor = "Branco";
		cessna.envergadura = 12;
		System.out.println("Avião: Cessna");
		System.out.println("Ano: " + cessna.ano);
		System.out.println("Envergadura: " + cessna.envergadura);
		cessna.turnOn();
		cessna.speedUp();
		cessna.landing();
		cessna.turnOff();
	}

}
