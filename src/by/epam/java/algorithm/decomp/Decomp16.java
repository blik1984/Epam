
/*
* Algorithmization
 * Декомпозиция, задание 16
 *Найти сумму n-значных чисел, которые содержат только нечётные цифры.
 *Определить сколько чётных цифр в полученой сумме.
 */

package by.epam.java.algorithm.decomp;

import java.util.ArrayList;

public class Decomp16 {

	public static void main(String[] args) {
		
		int sum;
		int n = 5;
		int numEven;
		
		sum = sum(n);
		numEven = numEven(sum);
		
		System.out.println("Сумма = " + sum);
		System.out.println("Количество чётных цифр в итоговой сумме - " + numEven);
	}
	
	/*
	 * метод суммирует числа прошедшие проверку
	 */
	public static int sum(int n) {
		
		int numStart;
		int numStop;
		int sum = 0;
		numStart = (int)Math.pow(10, (n-1));
		numStop = (int)Math.pow(10, (n));
		for (int i = numStart; i<numStop; i++) {
			int numEven = numEven(i);
			if (numEven == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		return sum;
	}
	
	/*
	 * метод считает количество чётных цифр в числе
	 */
	public static int numEven (int i) {
		int count = 0;
		ArrayList<Integer> mas = new ArrayList<>();
		while (i>0) {
			int x;
			x = i%10;
			mas.add(0,x);
			i = i/10;
		}
		for (int l = 0; l<mas.size(); l++) {
			if (mas.get(l)%2 == 0) {
				count++;
			}
		}
		return count;
	}
}
