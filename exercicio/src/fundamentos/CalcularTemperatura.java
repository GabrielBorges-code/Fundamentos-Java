package fundamentos;

import java.util.Scanner;

public class CalcularTemperatura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int temp = 32;
		final double calc = 1.8;
		
		System.out.print("Valore em Celsius: ");
		double iptCelsius = input.nextDouble();
		
		double convCParaFahren = iptCelsius * calc + temp;
		
		System.out.println("valor em Fahrenheit: " + convCParaFahren);
		
		System.out.print("Valor em Fahrenheit: ");
		double inputFahren = input.nextDouble();
		
		double convFahrenParaC = (inputFahren - temp) / calc;
		System.out.println("valor em Celsius: " + convFahrenParaC);
		
		input.close();

	}

}
