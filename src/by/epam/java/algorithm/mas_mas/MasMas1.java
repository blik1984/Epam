/* Algorithmization
 * Массивы массивов, задание 1
 * вывести на экран все нечётные столбцы матрицы, у которых первый элемент больше последнего.
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas1 {

	public static void main(String[] args) {
		int[][] N = { 
					{ 1, 2, 9, 4, 5, 7 },
					{ 6, 7, 8, 9, 10, 1 }, 
					{ 11, 12, 13, 14, 2, 5 }, 
					{ 12, 11, 10, 9, 8, 3 },
					{ 7, 6, 5, 4, 2, 8 } 
					};
		
		int Kol = N[0].length; 
		int Str = N.length; 
		int i = 0; 
		while (i < Kol) {
			if (N[0][i] > N[Str - 1][i]) {
				System.out.println("В столбце № " + (i + 1) + " первый элемент больше последнего. Вот этот столбец: ");
				for (int n = 0; n < Str; n++) {
					System.out.println(N[n][i]);
				}
			}
			i = i + 2; // перескакиваем чётные столбцы
		}
	}
}
