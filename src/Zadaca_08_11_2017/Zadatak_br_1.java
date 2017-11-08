package Zadaca_08_11_2017;

import java.util.Scanner;

public class Zadatak_br_1 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Molimo unesite vasu mjesecnu uplatu : ");
		double uplata = unos.nextDouble();
		
		System.out.print("Molimo unestie za koliko mjeseci zelite provjerit stanje : ");
		int brmjeseci = unos.nextInt();
		
		double iznosracuna = 0;
		double stopa = 1 + 0.00417;
		
		for (int i=0 ; i < brmjeseci ; i++){
			iznosracuna = (uplata + iznosracuna)*stopa;
		}
		System.out.println("Poslije " + brmjeseci + " vasae stanje na racunu ce iznositi " + iznosracuna);
unos.close();
	}

}
