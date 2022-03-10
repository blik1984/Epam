
/*
* Algorithmization
 * Декомпозиция, задание 13
 * Два простых числа называются близнецами, если они отличаются на 2 (41 и 43).
 * Найти все пары близнецов от n  до  2n.
 */

package by.epam.algorithm.decomp;

import java.util.Scanner;
import java.util.ArrayList;

public class Decomp13 {

	public static void main(String[] args) {
		
		ArrayList<Integer>primeNum = new ArrayList<>();
		ArrayList<Integer>twins = new ArrayList<>();
		double num;
		int n;
		int n2;
		int count = 1;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Укажите начальное целое положительное число больше двух >>"); 
		num = S.nextDouble();
		while (num<=2||num%1 != 0) {
			
			System.out.println("Число должно быть целым и больше двух. Повторите выбор  >>");
			num = S.nextDouble();
		}
		n = (int)num;
		n2 = n*2;
		
		primeNum = primeNum(n, n2);
		twins = twins(primeNum);
		
		for (int i = 0; i<primeNum.size(); i++) {
			System.out.print(primeNum.get(i) + ", ");
		}
		for (int i = 0; i<twins.size(); i = i+2) {
			
			System.out.print("\nПара близнецов №" + count +" - "+ twins.get(i) + ", " + twins.get(i+1));
			count ++;
		}
	}
	
	/*
	 * метод находит все простые числа в заданном диапазоне
	 */
	public static ArrayList<Integer> primeNum (int n, int n2) {
	
	ArrayList<Integer>primeNum = new ArrayList<>();
	for (int i = n; i<=n2; i++) {
		int x;
		x = chekPrimeNum(i);
		if (x!=0) {
			primeNum.add(x);
		}
	}
	return primeNum;
	}
	
	/*
	 * метод проверяет число на простоту
	 */
	public static int chekPrimeNum(int i) {
		
		for (int l = 2; l<i; l++) {
			if ( i%l==0) {
				return 0;
			}
		}
		return i;
	}
	
	/*
	 * метод ищёт "близнецы" в массиве целых чисел
	 */
	public static ArrayList<Integer>twins( ArrayList<Integer>primeNum) {
		
		ArrayList<Integer>twins = new ArrayList<>();
		
		for(int i = 0; i< (primeNum.size()-1); i++) {
			if (primeNum.get(i) == (primeNum.get(i+1)-2)) {
				twins.add(primeNum.get(i));
				twins.add(primeNum.get(i+1));
			}
		}
		return twins;
	}
}
