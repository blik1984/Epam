/* Algorithmization
 * Массивы массивов, задание 5
 * сформировать квадратную матрицу по образцу. Порядок матрицы чётный и задан пользователем.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas5 {

	public static void main(String[] args) {
		
		int n;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите порядок матрицы в виде чётного положительного числа"); 
		n = S.nextInt();
		
		int[][] N = new int[n][n]; 
		
		for (int i = 0; i < n; i++) {
			for (int y = 0; y < n - i; y++) {
				
				N[i][y] = i + 1;
			}
		}
		
		/*
		 * дальнейшая часть предназначена для проверки задания
		 */
		for (int l = 0; l < n; l++) // берём строку
		{
			for (int m = 0; m < n; m++) // берём столбцы в строке
			{
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
	}
}
