package br.com.Atividade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentodeExcecoes {

	public static void main(String[] args) {

		try {
		Scanner scanner= new Scanner (System.in);

		System.out.println("Digite seu nome");
		String nome = scanner.next();
		
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		scanner.close();
}

catch (InputMismatchException e) {
	System.out.println("Que pena... Aconteceu alguma problema, confire se sua idade está com valor numérico");
	
}
		

}

}
