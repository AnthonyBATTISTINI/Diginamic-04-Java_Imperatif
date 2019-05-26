package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	private static Scanner scan = new Scanner(System.in);
	
	protected void finalize() {
		scan.close();
	}
	
	public static void main(String[] args) {
		System.out.println("***** Application Opérateurs *****");
		System.out.println("Veuillez saisir le premier nombre...");
		int nombre1 = scan.nextInt();
		System.out.println("Veuillez saisir le second nombre...");
		int nombre2 = scan.nextInt();
		System.out.println(nombre1 + " + " + nombre2 + " = " + (nombre1+nombre2));
		System.out.println(nombre1 + " - " + nombre2 + " = " + (nombre1-nombre2));
		System.out.println(nombre1 + " * " + nombre2 + " = " + (nombre1*nombre2));
		System.out.println(nombre1 + " / " + nombre2 + " = " + (nombre1/nombre2));
		System.out.println(nombre1 + " % " + nombre2 + " = " + (nombre1%nombre2));
	}

}
