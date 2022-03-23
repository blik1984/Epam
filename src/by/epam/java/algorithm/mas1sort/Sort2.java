/* Algorithmization
 * Одномерные массивы сортировки, задание 2
 * Даны две неубывающие последовательности. Объединить их таким образом чтобы итоговая так же была неубывающей.
 * Дополнительный массив не использовать.
 */
/*
 *В задании не указано что последовательности это классические массивы, потому используем ArrayList. 
 *Работает как для неубывающих, так и для убывающих исходных последовательностей.
 */
package by.epam.java.algorithm.mas1sort;

import java.util.ArrayList;

import java.util.Arrays;

public class Sort2 {

	public static void main(String[] args) {

		ArrayList<Integer> mas1 = new ArrayList<>();
		mas1.addAll(Arrays.asList(1, 6, 9, 17, 19, 26, 28, 32, 46, 46, 86, 98));
		ArrayList<Integer> mas2 = new ArrayList<>();
		mas2.addAll(Arrays.asList(0, 6, 7, 9, 12, 17, 19, 19, 45, 82, 99, 107, -109, 110, 125, 159, 257, 336, 395, 692));
		Integer Val2;
		Integer Val1;
		int Count = mas2.size();
		while (Count > 0) {
			Val2 = mas2.get(0);
			for (int i = (mas1.size() - 1); i >= 0;) {

				Val1 = mas1.get(i);
				if (Val1 <= Val2) {
					
					mas1.add(i + 1, Val2);
					mas2.remove(0);
					i = -1;
				} else if (i == 0) {
					
					mas1.add(0, Val2);
					mas2.remove(0);
					i = -1;
				}
				i--;
			}
			Count--;
		}
		for (int i = 0; i < mas1.size(); i++) {
			System.out.print(mas1.get(i) + ", ");
		}
	}
}
