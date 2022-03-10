
/* Algorithmization
 * Декомпозиция, задание 11
 * В каком из двух чисел больше цифр
 */

/*
 * Работает для чисел с количеством знаков 18-19 шт (до 9 223 372 036 854 775 807).
 * Лучше использовать BigDecimal, но звучала мысль что нельзя.
 */

package by.epam.algorithm.decomp;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		double Val1 = 961514178;
		double Val2 = -910078.65221244286518;
		String s = " "+Val2;
		System.out.println(s);

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
	 * Метод считает количество цифр в записанном числе. 
	 */
	public static int size(double Val) {
		
		ArrayList<Integer> mas = new ArrayList<>();
		long Val2;
		double border =  0.1*9223372036854775807d;
		int size;
				
		while (Val%1!=0) {
			Val = Val*10;
			
			if (Val>border) {
				return 0;
			}
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
