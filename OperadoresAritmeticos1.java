package aulas;

import java.util.Scanner;

public class OperadoresAritmeticos1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;

		System.out.println("Por favor, digite um número inteiro aleatório:");
		firstNumber = leia.nextInt();
		System.out.println("\nPor favor, digite um segundo número:");
		secondNumber = leia.nextInt();
		int result = (firstNumber + secondNumber);
		System.out.println("\nO resultado da soma entre " + firstNumber + " e " + secondNumber + " é " + result + ".");

		leia.close();

	}

}
