package poo;

public class Ferrari {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 1963;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.turnOn();
		ferrari.speedUp();
		ferrari.turnOff();

	}

}
