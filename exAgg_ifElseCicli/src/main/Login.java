/*
Predefinisci un username e una password (ad esempio admin e 1234).
Chiedi all’utente di inserire username e password.
Verifica se corrispondono a quelli memorizzati:
Se corretti, stampa "Accesso riuscito".
Se errati, consenti un massimo di 3 tentativi.
Dopo 3 tentativi falliti, stampa "Accesso bloccato".
Requisiti:
Usa variabili per username e password predefiniti.
Usa un ciclo per i tentativi.
Usa if per confrontare le credenziali.
 */
package main;

import java.util.Scanner;	//import Scanner

public class Login {

	public static void main(String[] args) {
		//DICHIARAZIONE VARIABILI
		String userPre = "admin";	//valori predefiniti
		String pwPre = "1234";
		String user;	//valori da far inserire all'utente
		String pw;
		int maxTent = 3;	//numero massimo di tentativi
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("LOGIN AREA non mod. \nInserisci nome utente e password: ");
		
		for(int c = 1; c <= maxTent; c++) {	//ciclo for 
			user = scanner.nextLine();
			pw = scanner.nextLine();
			if (user.equals(userPre) && pw.equals(pwPre)) {	//metodo equals per confrontare le stringhe
				System.out.println("Accesso riuscito.");
				break;	//break per uscire dal ciclo
			} else if (c == maxTent) {
				System.out.println("Accesso bloccato.");
			} else {
				System.out.println("Accesso non riuscito. Reinserire nome utente e password: ");
			}
		}
		
		scanner.close();

	}

}
