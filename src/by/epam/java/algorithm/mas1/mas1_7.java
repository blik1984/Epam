/* Algorithmization
 * Одномерные массивы, задание 7
 * в массиве из 2n элементов найти max(a_1+a_2n, a_2+a_2n-1,...a_n+a_n+1)
 */

package by.epam.java.algorithm.mas1;

public class mas1_7 {

	public static void main(String[] args) {
		
		double sum;
		int N1;
		
		double[] N = { 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, 12, 13, 14, 15, 16, 17, 18, 19 }; // создали массив
		sum = Double.NEGATIVE_INFINITY; // задаём начальное значение суммы для перебора в плюс бесконечность
		N1 = N.length - 1; // определяем индекс последнего элемента
		
		for (int i = 0; i * 2 <= N.length; i++) { 

			double sum1;
			sum1 = N[i] + N[N1]; 
			System.out.println(" =  " + sum1); // выводим сумму для самоконтроля
			
			if (sum < sum1) // если вновь полученная сумма больше уже имеющейся, то заменяем её.
			{
				sum = sum1;
			}
			N1--; // уменьшаем индекс элемента с "той" стороны
		}
		System.out.println("max =  " + sum);
	}
}