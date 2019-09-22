package sestipaket;

import java.util.Scanner;

public class Dijamant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String prazan = " ";
		String zvezdica = "*";
		System.out.println("Br zvedica: ");
		n = sc. nextInt();
		for (int i = 1 ; i < n; i++) {
			System.out.println (prazan.repeat(n-i) + zvezdica.repeat(2*i-1) );
		}
		for ( int i = n ; i > 0 ; i--) {
			System.out.println( prazan.repeat(n-i) + zvezdica.repeat(2*i-1));
		}
	}
}
