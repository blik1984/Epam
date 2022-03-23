/* Algorithmization
 * Одномерные массивы, задание 6
 * найти сумму элементов массива вещественных чисел, чей индекс является простым числом
 */

package by.epam.java.algorithm.mas1;

public class mas1_6 {

	public static void main(String[] args) {
		
		double[] N = { 0, 3, 0, 3, 4, 5, 4, 9, 8, 9, 10, 11, -6, 13, 0, 15, 16, 12, 3.2, 19.1 }; 
		double sum = 0; 
		
		for (int i = 1; i < N.length; i++) 
		{
			if (check(i)) // если цифра индекса прошла проверку на простоту, то суммируем
			{
				sum = sum + N[i];
				System.out.println(i+" - "+ N[i]);
			}
		}
		System.out.print("Сумма =  " + sum);
	}

	static boolean check(int n) {
		
		if (n == 1) {
			
			return false; 
			}
		
		for (int i = 2; i * i <= n; i++) {
			
			if (n % i == 0) {
				
				return false; 
				
			} 
		}
			return true; 
	}
}
