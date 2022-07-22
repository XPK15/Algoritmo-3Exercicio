package aulas;

import java.util.Scanner;

public class OperadoresAritmeticos4 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	
	double fahrenheitTemperature = 0;
	double celsiusTemperature = 0;
	
	System.out.println("Bem-vindo à ferramenta de conversão.");
	System.out.println("\nPor favor, digite o valor atual da temperatura em graus Fahrenheits:");
	fahrenheitTemperature = leia.nextDouble();
	
	celsiusTemperature =  5 * ((fahrenheitTemperature - 32) / 9);
	
	System.out.println("A conversão da temperatura informada para graus Celsius é de " + celsiusTemperature + "°C.");
	
	
	leia.close();
}

}
