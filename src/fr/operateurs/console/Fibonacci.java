package fr.operateurs.console;

import java.util.Scanner; 

public class Fibonacci {

	public static void main(String[] args) {
		
		//Détermine les règles régissant la suite de Fibonacci
		int a = 0;
		int b = 1;
		int val = a + b;
		
		//Récupère la donnée choisi par l'utilisateur
		System.out.println("Veuillez saisir le rang du nombre N");
		Scanner questionUser = new Scanner(System.in);
		int N = questionUser.nextInt();
		
		//Légende légende
		if (N == 0) {
			val = 0;
		} else if (N == 1) {
			val = 1;
		} else {
			for (int i = 4; i <= N; i++) {
				a = b;
				b = val;
				val = a + b;
				}
			}
		System.out.println("Le nombre correspondant au rang " + N + " est " + val + ".");
	}
}
