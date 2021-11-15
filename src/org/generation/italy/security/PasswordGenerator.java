package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		String colore;
		String cognome;
		
		nome = "Mario";
		cognome = "Rossi";
		colore = "turchese";
		
		int ggNascita = 05;
		int mmNascita = 12;
		int aaNascita = 1982;
		
		int sommaNascita = (ggNascita + mmNascita + aaNascita);
		
		System.out.println("Password generata: " + nome + "-" + cognome + "-" + colore + "-" + sommaNascita);
		
		

	}

}
