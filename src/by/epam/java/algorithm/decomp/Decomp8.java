
/* Algorithmization
 * Декомпозиция, задание 8
 * Написать метод, который суммирует три последовательных элемента моссива от k до m.
 */

/*
 * Реализовано суммирование произвольного количества элементов от k до m.
 */

package by.epam.java.algorithm.decomp;

import java.util.Scanner;

public class Decomp8 {

	public static void main(String[] args) {
		
		int startBorder;
		int quantityVal;
		int sum = 0;
		
		int N [] = {50,3,9,4,-5,6,5,2,6,54,841,19,864,-841,6842,428,824,428,817,874,89,1,8,5,6,62000,2147483646};

		
		System.out.println("В массиве " + N.length + " чисел. С какого числа суммируем?"); 
		startBorder = chekIndex(N);
		
		System.out.println("Сколько чисел суммируем? "); 
		quantityVal = checkQuantity(N, startBorder);
		
		for (int i = startBorder; i<(startBorder+quantityVal); i++) {
			
			int checkSum;
			int K[] = {sum, N[i]};
			checkSum = checkSum(K);
			if (checkSum == 1) {
				System.out.println("Приложение не может посчитать сумму, она слишком большая"); 
				return;
			}
			
			sum = sum+N[i];				 
		}
		
		System.out.println("Сумма " + quantityVal + " чисел начиная с " + (startBorder+1) + "-го равна " + sum); 
		
	}
	/*
	 * Проверка индекса на существование
	 */
	public static int chekIndex (int N[]) {
		
		int val;
		double num;
		
	@SuppressWarnings("resource")
	Scanner S = new Scanner(System.in);
	System.out.println("Введите число"); 
	num = S.nextDouble();
	while (num<=0||num%1 != 0) {
		
		System.out.println("Число должно быть целым и положительным. Повторите выбор"); 
		num = S.nextDouble();
	}
	
	while (num > N.length) {
		System.out.println("У нас нет столько цифр. Выберите номер цифру от 1 до " + (N.length +1)); 
		num = S.nextDouble();
	}
	
	val = (int)num-1;
	return val;
	}
	
	/*
	 *Проверка количества суммируемых чисел на возможность существования
	 */
	public static int checkQuantity (int N[], int startBorder) {
		
		double num;
		int quantityVal;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите число"); 
		num = S.nextDouble();
		while (num<=0||num%1 != 0) {
			
			System.out.println("Число должно быть целым и положительным. Повторите выбор"); 
			num = S.nextDouble();
		}
		while ((startBorder + num)>N.length) {
			
			System.out.println("Слишком большое число. Повторите выбор"); 
			num = S.nextDouble();
		}
		quantityVal = (int)num;
		return quantityVal;
	}
	
	/*
	 * Проверка суммы на выход за INT
	 */
	public static int checkSum (int K[]) {
		
		int checkSum = 0;
		double sum = 0;
		
		for (int i = 0; i < K.length; i++) {
			sum = sum + (K[i]/10);
		}
		if (sum > (2147483647/10)) {
			checkSum = 1;
		}
		
		return checkSum;
	}
}

