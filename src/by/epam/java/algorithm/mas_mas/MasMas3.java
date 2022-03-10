/* Algorithmization
 * Массивы массивов, задание 3
 * вывести на экран заданную строку и заданный столбец.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas3 {

	public static void main(String[] args) {

		int[][] N = { // задаём матрицу
				{ 1, 2, 9, 4, 8 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 2 }, 
				{ 12, 11, 10, 9, 8 }, 
				{ 7, 6, 5, 4, 2 } 
				};
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите номер строки от 1 до " + (N.length)); 
																			
		int k;
		int p;
		
		k= S.nextInt();
		System.out.println("Введите номер столбца от 1 до " + (N[0].length));
		p = S.nextInt();
		System.out.println("Строка № " + k);
		
		for (int i = 0; i < N.length; i++) {	// выводим заданную строку в виде строки
		
			System.out.print(N[k - 1][i] + ", ");
		}
		
		System.out.println("");
		System.out.println("Столбец № " + p);
		
		for (int i = 0; i < N[0].length; i++) {		// выводим заданный столбец в виде столбца
		
			System.out.println(N[i][p - 1]); //
		}
	}
}