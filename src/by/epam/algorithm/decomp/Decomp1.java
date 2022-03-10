/* Algorithmization
 * ƒекомпозици€, задание 1
 * 1. Ќаписать метод дл€ нахождени€ наибольшего общего делител€ двух натуральных чисел и
 * наименьшего общего кратного этих чисел. 
 * 
 */

package by.epam.algorithm.decomp;

import java.util.Scanner;

public class Decomp1 {
	
	public static void main(String[] args) {
		
		double n1;
		double n2;
		int NOD;
		int NOK;
		int N1;
		int N2;
		
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("¬ведите первое натуральное число"); 
		n1 = S.nextDouble();
		if (n1<1||n1%1 != 0) {
			
			System.out.println("„исло не €вл€етс€ натуральным. «апустите программу заново и выберите натуральное число"); 
			return;
		}
		System.out.println("¬ведите второе натуральное число"); 
		n2 = S.nextDouble();
		if (n2<1||n2%1 != 0) {
			
			System.out.println("„исло не €вл€етс€ натуральным. «апустите программу заново и выберите натуральное число"); 
			return;
		}
		N1 = (int)n1;
		N2 = (int)n2;
		
		int N[] = { N1, N2};
		
		if (N1 == N2) {
			NOD = N1;
			NOK = N1;
		} else {
			
		NOD = NOD (N);
		NOK = NOK (N, NOD);
		}
		System.out.println("Ќаибольший общий делитель чисел "+ N1 + " и "+ N2 + " равен " + NOD); 
		System.out.println("Ќаименьшее общее кратное "+ N1 + " и "+ N2 + " равно " + NOK); 
	}
	
	
	/*
	 * ћетод определ€ет наибольший общий делитель дл€ любого количества натуральных чисел
	 * ¬ метод передаЄтс€ массив натуральных чисел
	 */
	public static int NOD (int N[] ) {
		
		int minN = 0;			//начальный делитель
		int flag;				//переключатель
		
		for (int i = 0; i< (N.length-1); i++) {		//выбираем наименьшее число из представленных
			
			if (N[i+1]<N[i]) {
				
				minN = N[i];
			} else  {
			
			minN = N[i+1];
			}
		}
		do {		//провер€ем делимость всех чисел на выбранный делитель
			flag = 1;
			minN = minN-1;
			
			for (int l = 0; l< N.length; l++) {
					
				if (N[l] % minN != 0) {
					l = N.length;
					flag = 0;
					//t++;
				}
			}
		} while (flag==0);
		
		return minN;
	}
	
	/*
	 * ћетод определ€ет наименьшее общее делимое дл€ двух натуральных чисел
	 * при известном наибольшем общем делителе.
	 * ¬ метод передаЄтс€ массив натуральных чисел и Ќќƒ.
	 * ћожно сделать определение Ќќ  перебором и тогда можно будет определ€ть дл€ любого количества чисел
	 */
	private static int NOK (int N[], int NOD) {
		
		int Ret;
		int multN = 1;
		
		for (int i = 0; i<N.length; i++) {
			
			multN = multN * N[i];
		}
		Ret = multN / NOD;
		
		return Ret;
	}
}
