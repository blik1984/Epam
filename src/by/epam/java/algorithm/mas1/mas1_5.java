/* Algorithmization
 * Одномерные массивы, задание 5
 * вывести элементы массива целых чисел, которые по величине больше своего индекса
 */

package by.epam.java.algorithm.mas1;

public class mas1_5 {
	
	public static void main(String[] args) {
		
		double[] N = { 3, 5, -8, 0, 0, 0, 9, 12, -5, 15 }; 
		
		for (int i = 0; i < N.length; i++) 
		{
			if (N[i] > i) 
			{
				System.out.println("Элемент массива №" + i + " равен " + N[i] + " и его величина больше его индекса");
			}
		}
	}
}
