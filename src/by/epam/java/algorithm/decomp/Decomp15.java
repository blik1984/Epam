
/*
* Algorithmization
 * Декомпозиция, задание 15
 *Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность.
 */


package by.epam.java.algorithm.decomp;

import java.util.ArrayList;

public class Decomp15 {

	public static void main(String[] args) {
		
		ArrayList<Integer> mas = new ArrayList<>();
		int n = 3;
		
		mas = mas(n);
		for(int i = 0; i<mas.size(); i++) {
			System.out.print(mas.get(i) + ", ");
		}
	}
	
	
	/*
	 * метод формирует массив чисел
	 */
	public static ArrayList<Integer> mas(int n) {
		
		ArrayList<Integer> mas = new ArrayList<>();
		int numStart;
		int numStop;
		numStart = (int)Math.pow(10, (n-1));
		numStop = (int)Math.pow(10, (n));
		for (int i = numStart; i<numStop; i++) {
			int flag = flag(i);
			if (flag ==1) {
				mas.add(i);
			}
		}
		return mas;
	}
	/*
	 * массив проверяет является ли последовательность цифр в числе строго возрастающей
	 */
	public static int flag (int i) {
		int flag = 1;
		ArrayList<Integer> mas = new ArrayList<>();
		while (i>0) {
			int x;
			x = i%10;
			mas.add(0,x);
			i = i/10;
		}
		for (int l = 0; l<(mas.size()-1); l++) {
			if (mas.get(l+1)<=mas.get(l)) {
				flag = 0;
				return flag;
			}
		}
		return flag;
	}
}
