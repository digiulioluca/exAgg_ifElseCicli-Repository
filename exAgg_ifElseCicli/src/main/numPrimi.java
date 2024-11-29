/*
Scrivi un programma che verifica se un numero è primo.

Specifiche:
Chiedi all’utente un numero intero positivo.
Determina se il numero è primo (un numero è primo se è divisibile solo per 1 e per sé stesso).
Stampa il risultato: "Il numero X è primo" o "Il numero X non è primo".

Requisiti:

Usa un ciclo per verificare i divisori del numero da 2 fino a numero−1.
Usa un if per verificare se esiste un divisore.
Usa una variabile booleana per memorizzare lo stato di "primo" o "non primo".
 */ 
package main;

import java.util.Scanner;	//import Scanner

public class numPrimi {

	public static void main(String[] args) {
		//DICHIARAZIONE VARIABILE
		int numero;	//numero da far inserire all'utente
		boolean primo = true;	//booleana per memorizzare lo stato dei numeri primi
		int c;	//contatore per il ciclo for
		
		Scanner scanner = new Scanner(System.in);
		
		do {	//il ciclo non si concluderà fino all'inserimento di un numero ritenuto valido (da 2 in poi)
			System.out.println("Inserisci un numero intero positivo da 2 in su: ");
			numero = scanner.nextInt();
			
			if (numero < 2) {
				System.out.println("Numero non valido. Riprovare.");
			}
		} while (numero < 2);
		
		scanner.close();
		
		for (c = 2; c < numero; c++) {	/*ciclo for:
										se il modulo del numero inserito prima della fine del ciclo
										(numero - 1) restituirà 0, il valore di 'primo' cambierà in false,
										ergo, numero non primo*/
			if (numero%c == 0) {
				primo = false;
				break;
			}
		}
		
		if (primo == true) {	//se il valore di true non è cambiato, il numero è primo.
			System.out.println (numero + " è un numero primo.");
		} else {
			System.out.println (numero + " non è un numero primo.");
		}

	}

}
