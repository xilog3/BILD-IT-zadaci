package Zadaca_08_11_2017;
import java.util.Scanner;

public class Zadatak_br_4 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
	    System.out.print("Molimo unesite vas broj : ");
	    int broj = unos.nextInt();
	    int broj2;
	    int rikverc=0;
	    while ( broj != 0){
	    	broj2 = broj % 10;
	    	rikverc = rikverc * 10 + broj2;
	    	broj = broj/10;
	    	
	    }
System.out.println("Vas obrnuti broj je : " + rikverc);

unos.close();
	}

}
