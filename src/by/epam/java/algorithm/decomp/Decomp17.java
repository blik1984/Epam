
/*
* Algorithmization
 * Декомпозиция, задание 17
 *Из заданного числа вычли сумму его цифр. Из результата снова вычли сумму цифр.
 *Сколько повторений необходимо произвести чтобы получить ноль.
 */
/*
 * Начальное число предполагаем положительным. Если число будет отрицательным, 
 * неясно с каким знаком брать отдельные цифры. 
 */

package by.epam.java.algorithm.decomp;

import java.util.ArrayList;


public class Decomp17 {

	public static void main(String[] args) {
		
		double n = 81;
		double workN = n;
		int count = 0;
		
		while (workN>0) {
			
			workN = workN-sumNum(workN);
			count++;
		}
		
		System.out.print("Для приведения числа " + n + " к нулю путём вычитания суммы его цифр необходимо "
				+ "произвести " + count + " повторений этой операции" );
	}
	
	/*
	 * Метод суммирует элементы массива
	 */
	public static int sumNum (double workN) {
		
		 int sumNum = 0;
		ArrayList<Integer> mas = new ArrayList<>();
		mas = intConvertToArray(workN);
		
		for (int i = 0; i<mas.size(); i++) {
			sumNum = sumNum + mas.get(i);
		}
		 return sumNum;
	}
	
	/*
	 * Метод разбивает целое число на отдельные цифры и записывает в массив
	 */
	
	public static ArrayList<Integer> intConvertToArray (double workN) {
		
		ArrayList<Integer> mas = new ArrayList<>();
		int numInt = convertToInt(workN);
		do {
		int N = (int)numInt%10;
		
		mas.add(0,N);
		numInt = numInt/10;
		} while (numInt>0);
		
		return mas;
	}
	
	/*
	 * Метод убирает запятую (или точку) из числа.
	 */
	public static int convertToInt (double workN) {
		
		while (workN%1!=0) {
			workN = workN*10;
		}
		int numInt = (int)workN;
		return numInt;
	}
}
