/* Algorithmization
Сортировка выбором
 */

package by.epam.java.algorithm.mas1sort;


public class Sort3 {

	public static void main(String[] args) {

		int[] N = {0, 6, 7, 9, 12, 17, 19, 19, 45, 82, 99, 107, 109, 110, 125, 159, 257, 336, 395, 692};
				
		System.out.println("Начальная последовательность: ");
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
		
		for (int i = 0; i<N.length; i++) {
			
			int valMax;
			int maxIndex = 0;
			int valProm = 0;
			
			valMax = N[i];
			
			for (int l = (i+1); l < (N.length); l++) {
				
				if (N[l] >= N[i]) {
					
					valMax = N[l];
					maxIndex = l;
				}
				
				valProm = N[i];
				N[i]=valMax;
				N[maxIndex]=valProm;
			}
		}
		
		System.out.println("\nОтсортированная последовательность: ");
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
	}
}
