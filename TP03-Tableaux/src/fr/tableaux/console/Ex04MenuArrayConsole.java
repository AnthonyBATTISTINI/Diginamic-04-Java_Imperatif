package fr.tableaux.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04MenuArrayConsole {

	private static int[] array = new int[1];
	private static int nbValue = 0;
	
	private static Scanner scan = new Scanner(System.in);
	
	protected void finalize() {
		scan.close();
	}
	
	public static void main(String[] args) {
		
		do {
			try {
				switch(menu()) {
				case 1:
					ajouter();
					break;
				case 2:
					afficher();
					break;
				case 3:
					System.out.println("Au revoir");
					return;
				default:
					System.out.println("Nombre invalide");
				}
			} catch(InputMismatchException ime) {
				System.out.println("Veuillez entrer un nombre");
				scan.nextLine();
			}
		} while(true);
		
	}
	
	private static int menu() {
		
		System.out.println("***** Menu du tableau *****");
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");
		System.out.println("3. Quitter");
		
		return scan.nextInt();
		
	}
	
	private static void ajouter() {
		if(array.length == nbValue) {
			int[] temp = new int[array.length*2];
			for(int i = 0; i < nbValue; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		
		System.out.println("Entrer le nombre à ajouter");
		array[nbValue] = scan.nextInt();
		nbValue++;
	}
	
	private static void afficher() {
		System.out.println("Liste des nombres");
		for(int i = 0; i < nbValue; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		scan.nextLine();
		scan.nextLine();
	}

}
