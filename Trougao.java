package sestipaket;

import java.util.Scanner;

public class Trougao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String trougao = "";
		System.out.println("Br zvezdica: ");
		n = sc. nextInt();
		for ( int j = 0 ; j < n ; j++ ) {
			trougao += "*";
			System.out.println(trougao);
		}
	}
}
