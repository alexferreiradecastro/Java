package poo;

public class Logan {
	
	public static void main(String[] args) { 
		Carro logan = new Carro();
		logan.ano = 2016;
		logan.cor = "Branco";
		System.out.println("Carro: Logan");
		System.out.println("Ano: " + logan.ano);
		System.out.println("Cor: " + logan.cor);
		logan.turnOn();
		logan.speedUp();
		logan.turnOff();
		
	}

}
