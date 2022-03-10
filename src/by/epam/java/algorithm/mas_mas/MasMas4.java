/* Algorithmization
 * Массивы массивов, задание 4
 * сформировать квадратную матрицу по образцу. Порядок матрицы чётный и задан пользователем.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas4 {

	public static void main(String[] args) {
		
		int n;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите порядок матрицы в виде чётного положительного числа"); 
		n = S.nextInt();
		int[][] N = new int[n][n]; 
		
		for (int i = 0; i < n; i++) {
			
			for (int y = 0; y < n; y = y + 2) {
				
				N[y][i] = i + 1;
				N[y + 1][i] = n - i;  
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