/* Algorithmization
 * Одномерные массивы, задание 4
 * поменять местами наибольший и наименьший элемент массива
 */

package by.epam.java.algorithm.mas1;

public class mas1_4 {
	
	public static void main(String[] args) {
		
		double[] N = { 3, 5, -8, 0, 0, 0, 9, 12, -5, -1 }; 
		double countMin = 0; 
		int indexMin = 0; 
		double countMax = 0; 
		int indexMax = 0; 
		
		for (int i = 0; i < N.length; i++) 
		{
			if (countMin > N[i]) 
			{
				countMin = N[i];
				indexMin = i;
			}
		}
		for (int i = 0; i < N.length; i++) 
		{
			if (countMax < N[i]) 
			{
				countMax = N[i];
				indexMax = i;
			}
		}
		N[indexMin] = countMax; 
		N[indexMax] = countMin;
		
		for (int i = 0; i < N.length; i++) //выводим изменённый массив
		{
			System.out.print(N[i] + ", ");
		}
	}
}
