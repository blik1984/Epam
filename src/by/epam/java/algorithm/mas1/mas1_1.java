/* Algorithmization
 * Одномерные массивы, задание 1
 * Найти сумму элементов массива, которые кратны заданному числу.
 */

package by.epam.java.algorithm.mas1;

import java.util.Scanner;

public class mas1_1 {
	
	public static void main(String[] args) {
		
		int n1;
		int K;
		int sum = 0;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите размер массива"); 
		n1 = S.nextInt();
		int[] N = new int[n1];
		System.out.println("Введите делитель"); 
		K = S.nextInt();
		
		for (int i = 0; i < N.length; i++) // 
		{
			N[i] = i; 
						
			if (N[i] % K == 0) 
			{
				sum = sum + N[i];
			}
		}
		System.out.println("Сумма элементов массива кратных " + K + " = " + sum);
	}
}

