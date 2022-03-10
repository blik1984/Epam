/* Algorithmization
 * Массивы массивов, задание 16
 * построить магический квадрат
 * Реализовано построение магического квадрата любого нечётного размера,
 * а так же чётных размеров кратных 4.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas16 {
	
	public static void main(String[] args) {

		int n;
		int min;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите размерность магического квадрата");
		n = S.nextInt();
		System.out.println("Введите минимальное значение в магическом квадрате");
		min = S.nextInt();

		/* если порядок квадрата нечётный составляем по методу "террас" (алгоритм с
		* Wikipedia)
		 */
		if (n % 2 != 0) {
			
			int Ter;
			int k;
			int Dist;
			int x;
			int y;
			int count;
			
			Ter= n / 2; 	// определяем высоту одной террасы
			k = n * 3; 		// размер большой матрицы
			Dist = n - Ter; // количество пустых строк/столбцов с любой стороны
			int[][] N = new int[k][k]; // задаём матрицу в тройном размере
			x = Dist; 		// столбец для первой цифры
			y = Dist + n - 1; // строка для первой цифры
			count = 0; 		// сдвиг диагонали
			for (int z = min; z < ((n * n) + min); z++) { // строим ромб внутри большой матрицы
				
				N[y][x] = z;
				x++;
				y--;
				count++;
				if (count == n) {
					
					x = x - (n - 1);
					y = y + (n + 1);
					count = 0;
				}
			}
			// делим квадратную матрицу размера 3n на три матрицы 3n*n и суммируем их.
			int[][] A1 = new int[k][n];
			
			for (int i = 0; i < k; i++) {
				
				for (int b = 0; b < n; b++) {
					
					A1[i][b] = N[i][b] + N[i][b + n] + N[i][b + 2 * n];
				}
			}
			// делим полученную прямоугольную матрицу 3n*n на 3 квадратные размером n и
			// суммируем их.
			int[][] A2 = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int b = 0; b < n; b++) {
					A2[i][b] = A1[i][b] + A1[i + n][b] + A1[i + 2 * n][b];
				}
			}
			// выводим итог второго сложения, это и есть наш магический квадрат
			for (int l = 0; l < n; l++) {
				
				for (int m = 0; m < n; m++) {
					
					if (A2[l][m] < 10) {
						
						System.out.print(A2[l][m] + "  ");
					} else {
						
						System.out.print(A2[l][m] + " ");
					}
				}
				System.out.println("");
			}
		}
		
		/* если порядок квадрата кратен 4, то используем метод обобщённых латинских
		 квадратов, алгоритм взят с http://www.klassikpoez.narod.ru/latsov.htm
		*/
		else if (n % 4 == 0) {
			int[][] A = new int[n][n];
			int[][] B = new int[n][n];
			int[][] C = new int[n][n];
			
			// первый обобщенный латинский квадрат
			for (int y = n - 1; y >= 0; y--) {
				for (int x = 0; x < n; x++) {
					if (y >= (n / 2)) {
						if (x % 2 == 0) {
							A[y][x] = n - y - 1;
						} else {
							A[y][x] = y;
						}
					} else {
						if (x % 2 == 0) {
							
							A[y][x] = n - (n / 2 - y);
						} else {
							A[y][x] = n - (n / 2 + y + 1);
						}
					}
				}
			}
			
			// второй обобщенный латинский квадрат получаем из первого
			for (int y = 0; y < n; y++) {
				
				for (int x = 0; x < n; x++) {
					
					B[y][x] = A[n - x - 1][y];
				}
			}
			// итоговый магический
			for (int y = 0; y < n; y++) {
				
				for (int x = 0; x < n; x++) {
					
					C[y][x] = n * A[y][x] + B[y][x] + 1;
				}
			}
			// выводим итоговый магический
			for (int l = 0; l < n; l++) {
				
				for (int m = 0; m < n; m++) {
					
					if (C[l][m] < 10) {
						
						System.out.print(C[l][m] + "  ");
					} else {
						System.out.print(C[l][m] + " ");
					}
				}
				System.out.println("");
			}
		} else {
			System.out.println("Выберите другой размер квадрата");
		}
	}

}
