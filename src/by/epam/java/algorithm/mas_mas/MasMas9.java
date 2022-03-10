/* Algorithmization
 * Массивы массивов, задание 9
 * в  матрице неотрицательных чисел посчитать сумму в каждом столбце и определить максимальную из них.
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas9 {

	public static void main(String[] args) {

		double[][] N = { 
				{ 1, 2, 9, 4, 8 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 2 }, 
				{ 12, 11, 10, 9, 8 }, 
				{ 7, 6, 5, 4, 2 } 
				};
		
		int NumColumn = 0; 	
		double MaxSumColumn = 0; 
		
		for (int i = 0; i < N[0].length; i++) {
			
			double S = SumColumn(N, i); 
			System.out.println("Сумма в столбце №" + (i + 1) + "  =  " + S); // выводим каждую сумму для последующего
																				// контроля
			if (MaxSumColumn < S) {
				
				MaxSumColumn = S;
				NumColumn = i;
			}
		}
		System.out.println("Максимальная сумма в столбце №" + (NumColumn + 1) + "  =  " + MaxSumColumn); 
	}

	/*
	 * метод считает сумму элементов столбца, передаём в метод массив и номер
	 * текущего столбца
	 */
	public static double SumColumn(double N[][], int n) {
		
		double SumColumn = 0;
		for (int i = 0; i < N[0].length; i++) {
			
			SumColumn = SumColumn + N[i][n];
		}
		return SumColumn;
	}
}