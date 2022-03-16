/* Algorithmization
 * Декомпозиция, задание 6
 * Написать метод, который проверяет являются ли три числа взаимно простыми
 */

/*
 * Числа являются взаимно простыми, если их наибольший общий делитель (НОД) равен 1. 
 * Понятие применяется только для целых чисел.
 * Метод для определения НОД любого количества чисел есть - Decomp1.NOD
 * Реализуем проверку для любого произвольного количества чисел.
 */

package by.epam.java.algorithm.decomp;

import java.util.Scanner;

public class Decomp6 {

	public static void main(String[] args) {
		
		double num;
		int numVal;
		int answer;

		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Укажите какое количество чисел необходимо проверить"); 
		num = S.nextDouble();
		while (num<1||num%1 != 0) {
			
			System.out.println("Число должно быть целым положительным. Пповторите выбор"); 
			num = S.nextDouble();
		}
		
		numVal = (int)num;
		
		int N [] = new int [numVal];
		
		for (int i = 0; i< N.length; i++) {
			
			N[i] = number(i);
		}
		
		answer = Decomp1.NOD(N);
		
		if (answer == 1) {
			
			System.out.println("Числа являются взаимно простыми"); 
		} else {
			
			System.out.println("Числа не являются взаимно простыми"); 
		}
	}
	
	/*
	 * Проверка на целое
	 */
	public static int number (int i) {
		
		double num;
		int number;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите число №" + (i+1)); 
		num = S.nextDouble();
		while (num%1 != 0) {
			
			System.out.println("Число должно быть целым. Повторите выбор"); 
			num = S.nextDouble();
		}
		
		number = (int)num;
		
		return number;
	}
}
