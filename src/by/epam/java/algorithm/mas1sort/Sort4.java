/* Algorithmization
Сортировка обменами. Составить алгоритм. 
Посчитать количество перестановок.
В задании требуется расставить элементы по возрастанию, при этом задана уже возрастающа последовательность.
Потому предположим что исходная последовательность будет случайной.
 */

package by.epam.java.algorithm.mas1sort;


public class Sort4 {

	public static void main(String[] args) {

		int[] N = {0, 6, 9, 159, 12, 17, 395, 19, 19, 692, 7, 0, 82, 99, 109, 110, 45, 125, 257, 336, 107};
				
		int count = 0;
		int countCycle;
		System.out.println("Начальная последовательность: ");
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
		
		do {
			countCycle = 0;
			
			for (int i = 0; i<(N.length-1); i++) {
			
				if (N[i]>N[i+1]) {
		
					int nProm;
					nProm = N[i];
					N[i] = N[i+1];
					N[i+1] = nProm;
					count++;
					countCycle++;
					}
				}
			} while (countCycle!=0);
		
		System.out.println("\nОтсортированная последовательность: ");
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
		System.out.println("\nКоличество осуществленных перестановок = " + count);
	}
}