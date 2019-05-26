package fr.tableaux.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05SuiteFibonacci {

	private final static int F0 = 0;
	private final static int F1 = 1;
	private static Scanner scan = new Scanner(System.in);
	
	protected void finalize() {
		scan.close();
	}
	
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.println("Veuillez choisir un rang");
				int rang = scan.nextInt();
				int res = fibonacci(F0, F1, rang);
				System.out.println("Fibonacci rang " + rang + " vaut " + res);
				return;
			} catch(InputMismatchException ime) {
				System.out.println("Veuillez entrer un nombre");
				scan.nextLine();
			}
		}
	}
	
	private static int fibonacci(int fa, int fb, int rang) {
		if(rang == 0) {
			return fa;
		}
		if(rang == 1) {
			return fb;
		}
		int fn = fa + fb;
		for(int i = 3; i <= rang; i++) {
			fa = fb;
			fb = fn;
			fn = fa + fb;
		}
		return fn;
	}

}
