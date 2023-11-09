package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Inserisci il nome
		System.out.print("Inserisci il tuo nome: ");
		String strName = in.nextLine();
		
		//Inserisci il cognome
		System.out.print("Inserisci il tuo cognome: ");
		String strSurname = in.nextLine();
		
		//inserisci il tuo colore preferito
		System.out.print("Inserisci il tuo colore preferito: ");
		String strColor = in.nextLine();
		
		//Inserisci il giorno di nascita
		System.out.print("Inserisci il tuo giorno di nascità: ");
		String strDay = in.nextLine();
		int intDay=Integer.valueOf(strDay);
		
		//Inserisci il mese di nascita
		System.out.print("Inserisci il tuo giorno di nascità: ");
		String strMouth = in.nextLine();
		int intMouth=Integer.valueOf(strMouth);
		
		//Inserisci	l'anno di nascita
		System.out.print("Inserisci il tuo giorno di nascità: ");
		String strYear = in.nextLine();
		int intYear=Integer.valueOf(strYear);
		
		//Addiziono la data di nascita
		int add=intDay + intMouth + intYear;
		
		System.out.print(strName + "-" + strSurname+ "-" + strColor + "-" + add);
		
	}
}
