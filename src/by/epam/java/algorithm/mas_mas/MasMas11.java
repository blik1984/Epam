/* Algorithmization
 * Массивы массивов, задание 11
 * сформировать  матрицу 10*20, заполнить случайными числами от 0 до 15 (будем считать что границы диапазона включены в допустимые значения и числа целые). 
 * Вывести на экран саму матрицу и номера строк в которых число пять встречается 3 и больше раз
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas11 {

	public static void main(String[] args) {

		int[][] N = new int[10][20]; 
		
		for (int I = 0; I < N.length; I++) {
			
			for (int J = 0; J < N[0].length; J++) { 
				
				double p;
				p = Math.random() * 16;
				N[I][J] = (int) p;
			}
		}
		for (int l = 0; l < N.length; l++) // выводим матрицу для проверки
		{
			for (int m = 0; m < N[0].length; m++) {
				if (N[l][m] < 10) {
					System.out.print(N[l][m] + "  ");
				} else {
					System.out.print(N[l][m] + " ");
				}
			}
			System.out.println("");
		}
		for (int J = 0; J < N[0].length; J++) // выводим номер столбца, если число 5 встречается 3 и более раз
		{
			int C = Count(N, J);
			
			if (C >= 3) {
				System.out.println("В столбце " + (J + 1) + " цифра 5 встречается 3 и более раза");
			}
		}
	}

	public static int Count(int N[][], int n)// метод считает количество элементов со значением 5 в каждом столбце
	{ 										// передаём в метод массив и номер текущего столбца
		int count = 0;
		
		for (int i = 0; i < N.length; i++) {
			
			if (N[i][n] == 5) {
				count++;
			}
		}
		return count;
	}
}