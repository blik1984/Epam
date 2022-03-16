
/* Algorithmization
 * Декомпозиция, задание 10
 * Дано натуральное число. Составить массив, элементами которого являются цифры этого числа
 */

/*
 * Предполагаем что цифры в массиве будут идти в том же порядке, что и в исходном числе
 */

package by.epam.java.algorithm.decomp;

import java.util.ArrayList;

public class Decomp10 {
	
	public static void main(String[] args) {
		
		int Val = 114178220;
		ArrayList<Integer> mas = new ArrayList<>();
		
		System.out.println (Val);

		do {
		int N[] = newVal(Val);
		mas.add(0,N[0]);
		Val = N[1];
		} while (Val>0);
		
		for (int i = 0; i<mas.size(); i++) {
			System.out.print (mas.get(i) + " ,");
		}
	}
	
	public static int[] newVal(int Val) {
		
		int N[] = new int [2];
		N[0] = (Val % 10);
		N[1] = Val/10;
		return N;
	}
}
