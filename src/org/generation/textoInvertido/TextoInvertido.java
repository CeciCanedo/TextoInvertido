package org.generation.textoInvertido;

import java.util.Scanner;

public class TextoInvertido {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Introduce una frase y la veras en modo espejo");
		String frase= scanner.nextLine();
	
		//
		char[] letraPorLetra= new char[frase.length()];
		
		//divide la frase letra por letra
		for (int i=0; i<frase.length(); i++){
			letraPorLetra[i]= frase.charAt(i);
		}
		
		//recorre el array en reversa
		for (int i= frase.length() - 1; i>=0; i-- ) {
			System.out.print(frase.charAt(i));
		}
		
		scanner.close();
	}

}
