package basic;

import java.util.Scanner;

public class Hours {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int startHour, finalHour, duration;
		
		startHour = sc.nextInt();
		finalHour = sc.nextInt();
		
		if (startHour < finalHour) {
			duration = finalHour - startHour;
		} else {
			duration = 24 - startHour + finalHour;
		}
		
		System.out.println("o jogo durou " + duration + " horas");
		
		sc.close();
	}

}
