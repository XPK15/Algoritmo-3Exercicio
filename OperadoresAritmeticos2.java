package aulas;

import java.util.Scanner;

public class OperadoresAritmeticos2 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	double primeiroBimestre = 0;
	double segundoBimestre = 0;
	double terceiroBimestre = 0;
	double quartoBimestre = 0;
	
	System.out.println("Por favor, digite suas notas obtidas ao longo deste ano.");
	System.out.println("\n1° Bimestre:");
	primeiroBimestre = leia.nextDouble();
	System.out.println("2° Bimestre:");
	segundoBimestre = leia.nextDouble();
	System.out.println("3° Bimestre:");
	terceiroBimestre = leia.nextDouble();
	System.out.println("4° Bimestre:");
	quartoBimestre = leia.nextDouble();
	
	double ArithmeticAverage = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
	
	System.out.println("A média de suas notas bimestrais é ‹" + ArithmeticAverage + "›.");
	
	leia.close();
}

}
