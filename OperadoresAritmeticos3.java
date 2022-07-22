package aulas;

import java.util.Scanner;

public class OperadoresAritmeticos3 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	double creditPerHour = 0;
	int hoursPerMonth = 0;
	
	System.out.println("Por favor, digite, em reais, seu montante salarial por hora:");
	creditPerHour = leia.nextDouble();
	System.out.println("\nAgora, digite seu número de horas trabalhadas por mês:");
	hoursPerMonth = leia.nextInt();
	
	double totalCredit = creditPerHour * hoursPerMonth;
	
	System.out.println("Com base nos dados informados, seu salário mensal é de " + totalCredit + " reais.");
	
	
	leia.close();
}

}
