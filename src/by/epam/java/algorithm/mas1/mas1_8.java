/* Algorithmization
 * Одномерные массивы, задание 8
 * образовать навый массив из данного выбросив элементы, минимальные по величине
 */

package by.epam.java.algorithm.mas1;

import org.apache.commons.lang3.ArrayUtils;

public class mas1_8 {

	public static void main(String[] args) {

		double[] N = { 3, 5, -9, 0, 0, 0, 9, 12, -5, -1, 8, 1, 23, 95, -8, 4 };
		double countMin = 0; // промежуточное хранение минимального

		for (int i = 0; i < N.length; i++) {
			
			if (countMin > N[i]) {

				countMin = N[i];
			}
		}
		for (int i = 0; i < N.length; i++) {

			N = ArrayUtils.removeElement(N, countMin);
		}

		for (int i = 0; i < N.length; i++) {

			System.out.println(N[i] + ", ");
		}
	}
}
