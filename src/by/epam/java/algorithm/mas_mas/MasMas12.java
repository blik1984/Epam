/* Algorithmization
 * Массивы массивов, задание 12
 * отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas12 {

	public static void main(String[] args) {

		int[][] N = new int[10][10]; 
		
		for (int I = 0; I < N.length; I++) { 
			
			for (int J = 0; J < N[0].length; J++) { 
				
				double p = Math.random() * 16;
				N[I][J] = (int) p;
			}
		}
		System.out.println("Исходная матрица"); 
		for (int l = 0; l < N.length; l++) {
			
			for (int m = 0; m < N[0].length; m++) {
				
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < N.length; i++) { // сортируем по возрастанию. Использована логика, описанная в сортировке
											 // Шелла в разделе про сортировки (как я понимаю это гномья сортировка)
			for (int n = 0; n < N[0].length - 1;) { 
				
				if (N[i][n] <= N[i][n + 1]) { // если последующий больше или равен, просто идём мимо
				
					n++;
				} else {	// если последующий меньше, то переставляем и отступаем назад.
				
					int Prom;
					Prom = N[i][n];
					N[i][n] = N[i][n + 1];
					N[i][n + 1] = Prom;
					n--;
					if (n < 0) {		// контролируем чтобы не отступить в отрицательные индексы
						n = 0;
					}
				}
			}
		}
		System.out.println("\nСтроки по возрастанию");
		for (int l = 0; l < N.length; l++) // выводим матрицу со строками, сортированными по возрастанию.
		{
			for (int m = 0; m < N[0].length; m++) {
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
		for (int i = 0; i < N.length; i++) // сортируем по убыванию
		{
			for (int n = 0; n < N[0].length - 1;) // работаем от первого до предпоследнего элемента. Т.е. предпоследний
													// будем сравнивать с предпоследний+1
			{ 										// если работать до последнего, то его пытается сравнить с несуществующим
													// следующим.
				if (N[i][n] >= N[i][n + 1]) // если последующий больше или равен, просто идём мимо
				{
					n++;
				} else // если последующий меньше, то переставляем и отступаем назад.
				{
					int Prom;
					Prom = N[i][n];
					N[i][n] = N[i][n + 1];
					N[i][n + 1] = Prom;
					n--;
					if (n < 0) // контролируем чтобы не отступить в отрицательные индексы
					{
						n = 0;
					}
				}
			}
		}
		System.out.println("\nСтроки по убыванию");
		for (int l = 0; l < N.length; l++) // выводим матрицу со строками, сортированными по убыванию.
		{
			for (int m = 0; m < N[0].length; m++) {
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
	}
}