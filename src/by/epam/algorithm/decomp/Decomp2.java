/* Algorithmization
 * Декомпозиция, задание 2
 * 1. Написать метод для нахождения наибольшего общего делителя четырёх натуральных чисел 
 */

package by.epam.algorithm.decomp;

import java.util.Scanner;

public class Decomp2 {
	
	public static void main(String[] args) {
		
		
		int NOD;
		
		int N[] = new int [4];
		
		System.out.println("Введите "+ N.length + " натуральных чисел"); 

		
		for (int i = 0; i<N.length; i++) {
			
			double Prom = valN(i);
			
			if (Prom < 1||Prom % 1 != 0) {
				
				System.out.println("Число не является натуральным. Запустите программу заново и повторите выбор"); 
				return;
			} else {
				N[i] = (int)Prom;
			}
		}
		
		NOD = Decomp1.NOD(N);
		
		System.out.println("Наибольший общий делитель равен " + NOD); 
	}
	
	
	/*
	 * Метод заполняет массив с клавиатуры
	 */
	
	private static double valN (int i) {
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите число № " + (i+1)); 
		double n = S.nextDouble();
		return n;
	}
}
