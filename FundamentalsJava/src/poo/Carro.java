package poo;

import java.util.Random;

public class Carro {
		int ano;
		String cor;
		
		public Carro() {
			Random generator = new Random();
			int chassi = generator.nextInt(1000);
			System.out.println("Chassi: " + chassi);
		}
		
		public Carro(int ano, String cor) {
			this.ano = ano;
			this.cor = cor;
		}
		
		void turnOn() {
			System.out.println("engine ON...");
		}
		
		void turnOff() {
			System.out.println("engine OFF.");		
	}
		
		void speedUp() {
			System.out.println("speed up the car");		
	}

}
