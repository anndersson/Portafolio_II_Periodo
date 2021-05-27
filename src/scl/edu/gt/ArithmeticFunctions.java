package scl.edu.gt;

import java.util.Scanner;

public class ArithmeticFunctions {
	
	public static double sumar(double numeral1,double numeral2) {
		double resultado = numeral1 +numeral2;
		return resultado;
		
	}
	public static void sumar() {
	
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num_1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num_2: ");
	double num2 = numeral1.nextDouble();
	
	double resultado = num1 + num2;
	
	System.out.println("El resultado es: " + resultado);
	
	}
	
	public static void restar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numeral1.nextDouble();
		
		double resultado = num1 - num2;
		
		System.out.println("El resultado es: " + resultado);
		
	}
	
	public static void multiplicar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numeral1.nextDouble();
		
		double resultado = num1 * num2;
		
		System.out.println("El resultado es: " + resultado);
		
	}
	
	public static void dividir() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numeral1.nextDouble();
		
		double resultado = num1 / num2;
		
		System.out.println("El resultado es: " + resultado);
	}

	public static void residuo() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numeral1.nextDouble();
		
		double resultado = num1 % num2;
		
		System.out.println("El resultado es: " + resultado);
	}
	public static void help() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numeral1.nextDouble();
		
	}
}
