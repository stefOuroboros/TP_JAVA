package fr.operateurs.console;

public class TestArray1 {
	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		//Parcourir le tableau
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.print(" \n");
		//parcourir le tableau en sens inverse
		for (int i = array.length -1 ; i > -1; i--) {
			System.out.print(array[i] + " ");
		}
		
		System.out.print(" \n");
		//Afficher tous les nombres du tableau supérieurs à 3
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.print(" \n");
		//Afficher tous les nombres paires
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.print(" \n");
		
		//Afficher le nombre maximum
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.print(max);
		/*
		int resultat = Integer.MIN_VALUE; (MIN_VALUE = -2x10^21)
		int test = tab[i];
		*/
		System.out.print(" \n");
		
		//Afficher le nombre minimum
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.print(min);
	}
}