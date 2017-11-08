package Zadaca_08_11_2017;

import java.util.Scanner;

public class Zadatak_br_2 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		int negativni = 0;
		int pozitivni = 0;

		int zbir = 0;

		System.out.print("Molimo unesite cijele brojeve.Broj nula prekida niz : ");
		int korisnik;

		while ((korisnik = unos.nextInt()) != 0) {

			;

			if (korisnik < 0)
				negativni++;
			else
				pozitivni++;

			zbir += korisnik;

		}

		System.out.println("Broj pozitivnih borjeva koji ste unijeli iznosi : " + pozitivni);
		System.out.println("Broj negativnih brojeva koji ste unijeli iznosi : " + negativni);
		System.out.println("Ukupan zbir unesinih brojeva iznosi : " + zbir);
		System.out.println("Prosjek svih brojeva iznosi : " + (zbir / (negativni + pozitivni)));
		unos.close();
	}

}
