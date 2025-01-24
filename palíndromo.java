/*Crie um programa que receba uma palavra ou número e verifique se é um palíndromo.*/

import java.util.Scanner;

public class palíndromo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite uma palavra: ");
		String palavra = entrada.nextLine();
		
		if (palidromo(palavra)) {
			System.out.println("A palavra é um palindormo!");
		}else {
			System.out.println("a palavra não é um palindromo");
		}
		
		entrada.close();

	}


public static boolean palidromo(String texto) {
	int inicio =0;
	int fim = texto.length() -1;
	
	while (inicio<fim) {
		if (texto.charAt(inicio) != texto.charAt(fim)) {
			return false;
		}
		inicio++;
		fim--;
	}
	return true;
	
	}
}