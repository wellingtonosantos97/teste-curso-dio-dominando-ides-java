package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("Digite o primeiro número: ");
		a = leitor.nextInt();
		System.out.print("Digite o segundo número: ");
		b = leitor.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Resultado da soma: " +soma);
		System.out.println("Resultado da subtração: " +subtracao);
		System.out.println("Resultado da multiplicação: " +multiplicacao);
		System.out.println("Resultado da divisão: " +divisao);

	}

	public static double soma(double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
}
