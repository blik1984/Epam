/* Algorithmization
 * Одномерные массивы, задание 10
 * сжать массив удалив каждый второй элемент (освободившиеся элементы заполнить нулями). Дополнительный массив не использовать.
 */

package by.epam.java.algorithm.mas1;

//вариант 1. Ноль ставим на место удалённого элемента

/*public class mas1_10 {
	
	public static void main(String[] args) {
		
		int[] N = { 7, 5, -8, 0, 4, 5, 9, 12, -5, -1, 8, 6, 23, 95, -8, 3, 4, 5, 3, 3, 3, 5 }; 
		
		for (int i = 0; i < N.length; i++) 
		{
			for (int n = 1; n < N.length; n = n + 2) // берём второй элемент и затем работаем через один
			{
				N[n] = 0; // 
			}
			System.out.print(N[i] + ", "); 
		}
	}
}
*/

//вариант 2. Все нолики сдвигаем в конец массива

public class mas1_10 {
	
	public static void main(String[] args) {
		
		int[] N = { 7, 5, -8, 0, 4, 5, 9, 12, -5, -1, 8, 6, 23, 95, -8, 3, 4, 5, 3, 3, 3, 5, 33 }; 
		
		int count = 1;
		
			for (int n = 2; n < N.length; n = n + 2) 
			{
				N[count] = N[n]; 
				count++;
			}
			for (int l = count; l<N.length; l++)
				N[l] = 0;
			for (int i = 0; i < N.length; i++) 
		{
			System.out.print(N[i]+", "); 
		}
	}
}
