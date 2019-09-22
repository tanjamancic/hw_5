package trecipaket;

import java.util.Scanner;

public class Savrseni {

	public static void main(String[] args) {
		/* Zadatak: Korisnik unosi brojeve u konzolu, 
		 * program cita brojeve sve dok korisnik ne unese 0, 
		 * kad unese 0, program treba da ispise koliko unetih brojeva su savrseni. 
		 * Broj je savrsen ako je jednak zbiru svojih deljenika(brojeva koji ga dele bez ostatka) 
		 */
		Scanner sc = new Scanner(System.in);
		int broj, m = 1 , sum = 0, sum2 = 0;
		System.out.println("Unesite broj: ");
		broj = sc.nextInt();
		while ( broj > 0 ) {
			m = 1;
			sum = 0;
			while ( broj > m ) {
				if ( broj % m == 0) sum +=m;
				m ++;
			}
			if (broj == sum) sum2++;
			System.out.println("Unesite broj: ");
			broj = sc.nextInt();
		}
			System.out.println("Savrsenih brojeva: " + sum2);
	}
}
