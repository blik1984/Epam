/* Algorithmization
 * Одномерные массивы, задание 3
 * в массиве действительных чисел посчитать количество положительных, отрицательных и нулевых
 */

package by.epam.java.algorithm.mas1;

public class mas1_3 {
	
	public static void main(String[] args) {
		
		double[] N = { 3, 5, -8, 0, 0, 0, 9, 12, -5, -1 }; // создали массив из десяти элементов
		int count1 = 0; // счётчик положительных
		int count2 = 0; // счётчик отрицательных
		int count3 = 0; // счётчик нулевых
		
		for (int i = 0; i < N.length; i++) // работаем от ноля до последнего элемента массива
		{
			if (N[i] > 0) // проверяем на положительность
			{
				count1++;
			} else if (N[i] < 0) // на отрицательность
			{
				count2++;
			} else if (N[i] == 0) // на нулевое значение
			{
				count3++;
			}
		}
		System.out.println("Количество положительных элементов = " + count1);
		System.out.println("Количество отрицательных элементов = " + count2);
		System.out.println("Количество нулевых элементов = " + count3);
	}
}