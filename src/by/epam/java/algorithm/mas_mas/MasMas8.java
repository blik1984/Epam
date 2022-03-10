/* Algorithmization
 * Массивы массивов, задание 8
 * в числовой матрице поменять местами два столбца, которые указал пользователь.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas8 {

	public static void main(String[] args) {

		int n1;
		int n2;
		
		double[][] N = { 
				{ 1, 2, 9, 4, 8 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 2 }, 
				{ 12, 11, 10, 9, 8 }, 
				{ 7, 6, 5, 4, 2 } 
				};
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите номер первого столбца для замены от 1 до " + (N[0].length));
		n1 = S.nextInt();
		System.out.println("Введите номер второго столбца от 1 до " + (N[0].length));
		n2 = S.nextInt();
		
		double[][] Nprom = new double[N[0].length][1]; // создаём первый массив из одного столбца
		
		for (int iprom = 0; iprom < N[0].length; iprom++) {	// выносим первый заменяемый столбец в промежуточный массив
		
			Nprom[iprom][0] = N[iprom][n1 - 1];
		}
		
		for (int i = 0; i < N[0].length; i++) {	// переносим второй столбец на место первого
		
			N[i][n1 - 1] = N[i][n2 - 1];
		}
		
		for (int i = 0; i < N[0].length; i++) {	// заносим промежуточный столбец на место второго заменяемого
		
			N[i][n2 - 1] = Nprom[i][0];
		}
		
		/*
		 * выводим матрицу для проверки
		 */
		for (int l = 0; l < N[0].length; l++) {
			
			for (int m = 0; m < N[0].length; m++) {
				
				System.out.print(N[l][m] + "  ");
			}
			System.out.println("");
		}
	}
}