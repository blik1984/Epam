/* Algorithmization
 * Массивы массивов, задание 15
 * найти наибольший элемент матрицы и заменить все нечётные элементы матрицы на него
 * предположим что матрица состояит из целых чисел
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas15 {

	public static void main(String[] args) {
		
		int[][] N = new int[10][10];
		
		for (int i = 0; i < N.length; i++) { // заполняем матрицу
			
			for (int j = 0; j < N[0].length; j++) {
				
				double p;
				p= Math.random() * 100;
				N[i][j] = (int) p;
			}
		}
		System.out.println("Матрица до изменения");
		
		for (int l = 0; l < N.length; l++) { // выводим начальную матрицу
			
			for (int m = 0; m < N[0].length; m++) {
				
				if (N[l][m] < 10) {
					
					System.out.print(N[l][m] + "  ");
				} else {
					
					System.out.print(N[l][m] + " ");
				}
			}
			System.out.println("");
		}
		
		int maxVal = N[0][0];
		
		for (int i = 0; i < N.length; i++) { // ищем максимальное значение
			
			for (int j = 0; j < N[0].length; j++) {
				
				if (N[i][j] > maxVal) {
					
					maxVal = N[i][j];
				}
			}
		}
		
		for (int i = 0; i < N.length; i++) { // заменяем нечётные значения
			
			for (int j = 0; j < N[0].length; j++) {
				
				if (N[i][j] % 2 != 0) {
					
					N[i][j] = maxVal;
				}
			}
		}
		
		System.out.println("Максимальное значение матрицы - " + maxVal);
		System.out.println("Матрица после изменения");
		
		for (int l = 0; l < N.length; l++) { // выводим изменённую матрицу
			
			for (int m = 0; m < N[0].length; m++) {
				
				if (N[l][m] < 10) {
					
					System.out.print(N[l][m] + "  ");
				} else {
					
					System.out.print(N[l][m] + " ");
				}
			}
			System.out.println("");
		}
	}
}
