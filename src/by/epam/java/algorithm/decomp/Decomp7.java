
/* Algorithmization
 * Декомпозиция, задание 7
 * Написать метод, который суммирует факториалы всех нечётных чисел от 1 до 9.
 */

/*
 * Реализован выбор: чётные, нечётные, все. С любой границей начала и окончания диапазона.
 * Хотя учитывая размер INT смысла в этом немного)))
 */


package by.epam.java.algorithm.decomp;

import java.util.Scanner;

public class Decomp7 {

	public static void main(String[] args) {
		
	int startBorder;
	int stopBorder;
	int stepFlag;
	int step = 1;
	int sumFactorial = 0;
	String stepVal = null;
	
	System.out.println("Начало диапазона."); 
	startBorder = chekIntPositive();
	System.out.println("Конец диапазона."); 
	stopBorder = chekIntPositive();
	
	while (stopBorder<startBorder) {
		
		System.out.println("Конец диапазона должен быть больше или равен " + startBorder + "Повторите выбор."); 
		stopBorder = chekIntPositive();
	}
	
	System.out.println("Нечётные - введите 1. Чётные - введите 2. Все числа - введите 3."); 
	stepFlag = chekIntPositive();
	while (stepFlag>3) {
		System.out.println("Нечётные - введите 1. Чётные - введите 2. Все числа - введите 3."); 
		stepFlag = chekIntPositive();
	}
	
	if (stepFlag == 1) {
		stepVal = "нечётных";
	} else if (stepFlag == 2) {
		stepVal = "чётных";
	}else if (stepFlag == 3) {
		stepVal = "всех";
	}
	
	if (stepFlag == 1) {
		
		step = 2;

		if ( startBorder % 2 == 0) {
			startBorder = startBorder +1;
		}
	} else if (stepFlag == 2) {
		
		step = 2;

		if (startBorder % 2 != 0) {
			
			startBorder = startBorder +1;
		}
	}
	
	for (int i = startBorder; i<=stopBorder; i = i+step) {
		
		double check;
		check = sumFactorial/10 + factorial(i)/10;
		
		if ( check > (2147483647/10)) {
			System.out.println("Значение слишком большое, его невозможно посчитать в данном приложении"); 
			return;
		}

		sumFactorial = sumFactorial + factorial(i);
	}
	
	System.out.println("Сумма факториалов " + stepVal + " чисел от " + startBorder + 
			" до " + stopBorder + " равна " + sumFactorial); 
	}
	
	/*
	 * Проверка на положительное и целое
	 */
	public static int chekIntPositive () {
		
		int val;
		double num;
		
	@SuppressWarnings("resource")
	Scanner S = new Scanner(System.in);
	System.out.println("Введите число"); 
	num = S.nextDouble();
	while (num<1||num%1 != 0) {
		
		System.out.println("Число должно быть целым положительным. Повторите выбор"); 
		num = S.nextDouble();
	}
	val = (int)num;
	return val;
	}
	
	/*
	 * Определяем факториал переданного числа
	 */
	public static int factorial (int val) {
		
		int factorial = 1;
		
		for (int i = 1; i <= val; i++) {
			
			factorial = factorial * i;
		}
		return factorial;
	}
}
