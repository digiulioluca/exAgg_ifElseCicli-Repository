/*
Scrivi un programma che calcola la somma separata dei numeri pari e dispari in un intervallo specificato.

Specifiche:
Chiedi all’utente due numeri interi, uno come limite inferiore e uno come limite superiore.
Calcola la somma dei numeri pari e dei numeri dispari nell’intervallo tra i due numeri (inclusi).
Stampa separatamente:
Somma dei pari.
Somma dei dispari.

Requisiti:
Usa un ciclo per scorrere l’intervallo.
Usa if per distinguere numeri pari e dispari.
Usa due variabili separate per accumulare le somme.
*/
package main;

import java.util.Scanner; //import Scanner

public class sommaPariDispari {

	public static void main(String[] args) {
		// DICHIARAZIONE VARIABILI
		int min; // numeri da far inserire all'utente
		int max;
		int sommaPari = 0;
		int sommaDispari = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci due numeri: uno per il limite inferiore, l'altro per il limite superiore.");
		min = scanner.nextInt();
		max = scanner.nextInt();
		scanner.close();

		for (int c = min; c <= max; c++) {
			if (c % 2 == 0) {
				sommaPari = sommaPari + c;
			} else {
				sommaDispari = sommaDispari + c;
			}
		}

		System.out.println(
				"Somma dei numeri pari: " + sommaPari + ".\naSomma dei numeri dispari: " + sommaDispari + ".");

	}

}
