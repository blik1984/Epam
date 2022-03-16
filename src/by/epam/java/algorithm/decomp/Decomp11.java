
/* Algorithmization
 * Декомпозиция, задание 11
 * В каком из двух чисел больше цифр
 */

/*
 * Корректно работает для чисел с количеством знаков 18-19 шт (до 9 223 372 036 854 775 807) для целых
 * и 16 штук для дробных. Если нужно больше, то число нужно изначально передавать в типе String или
 * использовать BigDecimal.
 */

package by.epam.java.algorithm.decomp;

import java.util.ArrayList;

public class Decomp11 {
	
	public static void main(String[] args) {
		
		double Val1 = 961514178;
		double Val2 = -9100041178.6518;
		double Val11;
		double Val12;
		
		int size1;
		int size2;
		Val11 = Math.abs(Val1);
		Val12 = Math.abs(Val2);

		size1 = size(Val11);
		size2 = size(Val12);
		if (size1 ==0 ||size2 == 0) {
			System.out.println("Числа слишком большие. Посчитать количество цифр в данном приложении невозможно");
			return;
		}else {
			if (size1>size2) {
			
				System.out.println("число "+Val1 + " имеет бОльшее количество цифр в записи = " + size1);
			} else if (size2>size1) {
			
				System.out.println("число "+Val2 + " имеет бОльшее количество цифр в записи = " + size2);
			} else if (size1 == size2) {
			
				System.out.println("числа имеют одинаковое количество цифр в записи = " + size1);
			}
		}
	}
	
	/*
	 * Метод считает количество цифр в записанном числе. Максимальное количество знаков 18-19 штук
	 * для целых и 16 знаков для дробных. Использовались примитивные числовые типы.
	 */
	public static int size(double Val) {
		
		ArrayList<Integer> mas = new ArrayList<>();
		long Val2;
		int size;
				
		while (Val%1!=0) {
			Val = Val*10;
		}
		Val2 = (long)Val;
		
		do {
		int N = (int)Val2%10;
		
		mas.add(0,N);
		Val2 = Val2/10;
		} while (Val2>0);
		
		size = mas.size();
		
		return size;
	}
}
