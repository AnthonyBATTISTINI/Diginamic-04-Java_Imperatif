package fr.tableaux.console;

public class Ex01TestArrayDisplay {
	
	public static void main(String[] args) {
		int[] array = TestArray.array;
		
		for(int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[array.length-1-i] + " ");
		}
		System.out.println();
		
		for(int value : array) {
			if(value > 3) {
				System.out.print(value + " ");
			}
		}
		System.out.println();
		
		for(int value : array) {
			if(value%2 == 0) {
				System.out.print(value + " ");
			}
		}
		System.out.println();
		
		int max = Integer.MIN_VALUE;
		for(int value : array) {
			if(value > max) {
				max = value;
			}
		}
		System.out.print("max : " + max);
		System.out.println();
		
		int min = Integer.MAX_VALUE;
		for(int value : array) {
			if(value < min) {
				min = value;
			}
		}
		System.out.print("min : " + min);
		System.out.println();
		
	}

}
