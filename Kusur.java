package trecipaket;

import java.util.Scanner;

public class Kusur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cena, kolicina, zbir = 0;
		int a = 1, b, dato = 0, kusur;
		System.out.println("Unesite cenu za 1. proizvod: ");
		cena = sc.nextFloat();
		System.out.println("Unesite kolicinu za 1. proizvod: ");
		kolicina = sc.nextFloat();
		while ( cena != -1) {
			if (kolicina > 3) zbir += (cena * kolicina) * 0.9 ;
			else zbir += cena * kolicina;
			System.out.println("Unesite cenu za " + ++a +  ". proizvod ili (-1) ako nema vise proizvoda: ");
			cena = sc.nextFloat();
			if ( cena == -1 ) break; 
			b = a;
			System.out.println("Unesite kolicinu za " + b + ". proizvod: ");
			kolicina = sc.nextFloat();
		}
		int zbirr = Math.round(zbir);
		System.out.println("Ukupna cena proizvoda je: " + zbirr);
		String penz;
		System.out.println("Da li je kupac penzioner:");
		penz = sc.next();
		switch (penz) {
		case "da" : System.out.println("Nova cena svih proizvoda iznosi: " + (zbirr *= 0.9)); break;
		case "ne" : System.out.println("Cena ostaje nepromenjena."); break;
		default : System.out.println("Unesite da ili ne."); break;
		}
		
		System.out.println("Koliko Vam je novca dao kupac: ");
		dato = sc.nextInt();
		if (zbirr > dato) System.out.println("Nedovoljno novca za sve proizvode!");
		else {
			kusur = dato - zbirr;
			System.out.println("Kusur je:" + kusur);
			System.out.println("Da biste vratili najmanji broj kovanica potrebno je:");
			int k20 = 0, k10 = 0, k5 = 0, k2 = 0, k1 = 0;
			while ( kusur > 0 ) {
			if (kusur >= 20) {
				kusur -= 20;
				k20++;
			}
			else if (kusur >= 10) {
				kusur -= 10;
				k10++;
			}
			else if (kusur >= 5) {
				kusur -= 5;
				k5++;
			}
			else if (kusur >= 2) {
				kusur -= 2;
				k2++;
			}
			else if (kusur >= 1) {
				kusur -= 1;
				k1++;
			}
			}
				System.out.println(k20 + " od 20 din");
				System.out.println(k10 + " od 10 din");
				System.out.println(k5 + " od 5 din");
				System.out.println(k2 + " od 2 din");
				System.out.println(k1 + " od 1 din");
		}
		}

}
