/*
Scrivi un programma che verifica se un numero intero positivo è "perfetto".

Specifiche:
Chiedi all’utente un numero intero positivo.
Un numero è perfetto se la somma dei suoi divisori propri (escluso il numero stesso) è uguale al numero stesso.
Esempio: 6 è perfetto perché i suoi divisori propri sono 1, 2 e 3, e 1+2+3 = 6
Stampa "Il numero X è perfetto" o "Il numero X non è perfetto".
Requisiti:
Usa un ciclo per calcolare i divisori del numero.
Usa una variabile per accumulare la somma dei divisori.
Usa un if per confrontare la somma con il numero.
 */
package main;

import java.util.Scanner;	//import Scanner

public class numPerfetto {

	public static void main(String[] args) {
		//DICHIARAZIONE VARIABILI
		int numero;	//numero da far inserire all'utente
		int sommaDiv = 0;	//contenitore per la somma dei divisori
		int c; //contatore ciclo for
		
		Scanner scanner = new Scanner(System.in);
		
		do {	//il ciclo non si concluderà fino all'inserimento di un numero ritenuto valido (da 1 in su)
			System.out.println("Inserisci un numero intero positivo: ");
			numero = scanner.nextInt();
			
			if (numero < 1) {
				System.out.println("Numero non valido. Riprovare.");
			}
		} while (numero < 1);
		
		scanner.close();
		
		for (c = 1; c < numero; c++) {
			if (numero%c == 0) {	//se il modulo restituisce 0, somma dei divisori aumenta del valore di c
				sommaDiv = sommaDiv + c;
			}
		}
	
		if (sommaDiv == numero) {	//stampa finale
			System.out.println(numero + " è un numero perfetto.");
		} else {
			System.out.println(numero + " non è un numero perfetto.");
		}
	}

}
