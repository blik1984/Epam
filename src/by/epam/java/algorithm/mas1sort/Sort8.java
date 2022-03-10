/* Algorithmization
 * Одномерные массивы сортировки, задание 8
 * Даны дроби, числитель и знаменатель натуральные числа. Привести к общему знаменателю, отсортировать по возрастанию
 */

package by.epam.java.algorithm.mas1sort;

public class Sort8 {

	public static void main(String[] args) {

		
		int[] N = {95,2,1, 6, 9, 11, 45,5,19, 26, 28, 3, 46, 6, 6, 9,2,9,3,7,9,2,95,8,5,6};	//0 и чётные - числитель, нечётные - знаменатель
		int denominator = 1;
		int maxVal = 0;
		int Count = 0;
		int t = 1;
		
		System.out.println("\nИсходные дроби: ");
		for (int i = 1; i < N.length; i = i+2) {
			
			System.out.print(N[i-1]+"/"+N[i] + ", ");
		}
		
		for (int i = 1; i < N.length; i = i+2) {	//ищем максимальный знаменатель
			
			if (N[i]>maxVal) {
				maxVal = N[i];
			}
		}
		System.out.println("\nМаксимальный знаменатель: " + maxVal);
		
		do {						//ищем наименьший общий делитель
									//если просто перемножить знаменатели, то очень быстро выходим за int
			denominator = maxVal * t;	
			
			for (int k = 1; k < N.length; ) {
				
				if (denominator%N[k] != 0) {
					k = N.length;
					t++;
					Count = 0;
					
					if ((maxVal*(t/10)) > (2147483647/10)) {	//и даже ища наименьший делитель
																//легко выскочить за int
				
						System.out.println("\nОбщий знаменатель определить невозможно, используйте"
						+ " другой тип данных");
						return;
						}
					
				} else {
					
					k = k+2;
					Count = 1;
				}
			}
		} while (Count == 0);
		
		System.out.println("\nОбщий знаменатель: " + denominator);
		
		for (int i = 1; i < N.length; i = (i+2)) {		//приводим дроби к общему знаменателю
			
			N[i-1] = N[i-1] * (denominator/N[i]);
			N[i] = denominator;
		}
		
		System.out.println("\nДроби с общим знаменателем: ");
		
		for (int i = 1; i < N.length; i = i+2) {
			
			System.out.println(N[i-1]+"/"+N[i] + ", ");
		}
		
		for (int i = 0; i < N.length-2; ) { //сортируем

			if (N[i] <= N[i+2]) { 	
				i = i+2;
				
			} else {				

				int Prom;
				Prom = N[i];
				N[i] = N[i+2];
				N[i+2] = Prom;
				i = i-2;
				if (i < 0) {		
					i = 0;
				}
			}
		}
		
		System.out.println("\nСортированные дроби с общим знаменателем: ");
		
		for (int i = 1; i < N.length; i = i+2) {
			
			System.out.println(N[i-1]+"/"+N[i] + ", ");
		}
	}
}