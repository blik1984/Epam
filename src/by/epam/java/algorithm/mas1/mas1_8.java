
/* Algorithmization
 * Одномерные массивы, задание 8
 * образовать навый массив из данного выбросив элементы, минимальные по величине
 */

package by.epam.java.algorithm.mas1;

public class mas1_8 {

	public static void main(String[] args) {

		double[] N = { 3, 5, -9, 0, 0, 0, 9, 12, -5, -1, 8, 1, 23, 95, -8, 4 };
		double countMin = 0; // промежуточное хранение минимального
		int numberMin = 0;

		for (int i = 0; i < N.length; i++) {
			
			if (countMin > N[i]) {

				countMin = N[i];
			}
		}
		for (int i = 0; i < N.length; i++) {
			if (N[i] == countMin) {
				numberMin++;
			}
		}
		double[] N2 = new double[N.length - numberMin];
		int k = 0;
		for (int i = 0; i < N.length; i++) {
			
			if (N[i] != countMin) {
				N2[k] = N[i];
				k++;
			}
			if (k == N2.length) {
				i = N.length;
			}
		}

		for (int i = 0; i < N2.length; i++) {

			System.out.println(N2[i] + ", ");
		}
	}
}
