
/* Algorithmization
 * Декомпозиция, задание 5
 * В массиве чисел выбрать второй по величине и вывести
 */

/*
 * Можно вывести произвольное по величине число
 */

package by.epam.algorithm.decomp;

import java.util.Scanner;
import java.util.ArrayList;

public class Decomp5 {

	public static void main(String[] args) {
		
		double num;
		int numVal;
		int sortN[];
		
		int N [] = {50,3,9,4,-5,6,5,2,6,54,841,19,864,-841,6842,428,824,428,817,874,89,1,8,5,6,62000};
		
		sortN = val(N);
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Укажите которое по величине число от №1 до №" + (sortN.length) + " необходимо вывести"); 
		num = S.nextDouble();
		if (num<1||num%1 != 0) {
			
			System.out.println("Число должно быть целым положительным. Перезапустите программу и повторите выбор"); 
			return;
		}
		
		if (num>sortN.length) {
			System.out.println("Количество различных значений равно " + (sortN.length) + 
					" , перезапустите программу и повторите выбор"); 
			return;
		}
		
		numVal = (int)num;
		
		System.out.println("Искомое значение = " + sortN[numVal-1]); //из отсортированного массива выбираем любое 
																	// по величине значение
	}
	
	/*
	 * Метод сортирует элементы массива по убыванию, при этом дубли удаляются.
	 */
	public static int[] val (int N[]) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(N[0]);
		
		for (int i = 1; i < N.length; i++) {	//сортируем с убыванием, выбрасываем дубли
			
			int Prom = N[i];
			
			for (int k = 0; k<=A.size();) {
				
				if  (k == A.size()) {
					A.add(Prom);
					k = (A.size()+2);				
				} else if (Prom < A.get(k)) {
					k++;
				} else if (Prom>A.get(k)) {
					
					A.add(k, Prom);
					k = (A.size()+2);
				} else if (Prom == A.get(k)) {
					k = (A.size()+2);				
				}
			}
		}
		
		int sortN[] = new int [A.size()]; //преобразуем в массив
		
		for (int i = 0; i<A.size(); i++) {
		sortN[i] = A.get(i);
		}
		return sortN;
	}
}
