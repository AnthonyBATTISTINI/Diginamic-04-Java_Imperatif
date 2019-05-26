package fr.tableaux.console;

import java.util.Arrays;

public class Ex03TestArrayTri {

	public static void main(String[] args) {
		int[] array = TestArray.array;
		Arrays.sort(array);
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
