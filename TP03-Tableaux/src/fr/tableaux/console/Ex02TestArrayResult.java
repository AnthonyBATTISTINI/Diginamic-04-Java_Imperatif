package fr.tableaux.console;

public class Ex02TestArrayResult {

	public static void main(String[] args) {
		int[] array = TestArray.array;
		
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		System.out.print("moyenne : " + sum/array.length);
		System.out.println();
		
		final int VALUE = 15;
		Integer index = null;
		for(int i = 0; i < array.length && index == null; i++) {
			if(array[i] == VALUE) {
				index = i;
			}
		}
		System.out.print("array[" + index + "]=" + VALUE);
		System.out.println();
		
		int nbDoublon = 0;
		for(int i = 0; i < array.length-1; i++) {
			int nbOccurence = 1;
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					nbOccurence++;
				}
			}
			if(nbOccurence == 2) {
				nbDoublon++;
			}
		}
		System.out.print("nombre de doublon : " + nbDoublon);
		System.out.println();
	}

}
