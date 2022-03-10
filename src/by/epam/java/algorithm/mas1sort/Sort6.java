/* Algorithmization
—ортировка Ўелла.  ак подсказали в чатиках описанный алгоритм это гномь€ сортировка.
«адача выполнено в соответствии с описанным в задании алгоритмом.
 */

package by.epam.java.algorithm.mas1sort;

public class Sort6 {

	public static void main(String[] args) {

		int[] N = { 7, 5, -8, 0, 4, 5, 9, 12, -5, -1, 8, 6, 23, 95, -8, 3, 4, 5, 3, 3, 3, 5 };
		
		System.out.println("Ќачальна€ последовательность: ");
		
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
		for (int i = 0; i < N.length-1; ) { 

			if (N[i] <= N[i+1]) { 	// если последующий больше или равен, просто идЄм мимо
				i++;
				
			} else {				// если последующий меньше, то переставл€ем и отступаем назад.

				int Prom;
				Prom = N[i];
				N[i] = N[i+1];
				N[i+1] = Prom;
				i--;
				if (i < 0) {		// контролируем чтобы не отступить в отрицательные индексы
					i = 0;
				}
			}
		}
		
		System.out.println("\nќтсортированна€ последовательность: ");
		
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
	}
}

