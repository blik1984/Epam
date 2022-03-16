
/*
* Algorithmization
 * Декомпозиция, задание 14
 * Условия задачи неверно описывают числа Армстронга. 
 * В задаче описано что сначала нужно суммировать цифры, а потом сумму возводить в степень.
 * Верно: сначала возводить в степень отдельные цифры, а потом суммировать.
 * Реализован верный алгоритм.
 * Найти все числа Армстронга от 1 до k.
 */

package by.epam.java.algorithm.decomp;

import java.util.Scanner;
import java.util.ArrayList;

public class Decomp14 {

	public static void main(String[] args) {
		
		ArrayList<Integer>masArmNum = new ArrayList<>();
		double num;
		int k;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Укажите конец диапазона в виде целого положительного числа >>"); 
		num = S.nextDouble();
		while (num<1||num%1 != 0) {
			
			System.out.println("Число должно быть целым и положительным. Повторите выбор  >>");
			num = S.nextDouble();
		}
		k = (int)num;
		masArmNum = masArmNum(k);
		
		for (int i = 0; i<masArmNum.size(); i++) {
			System.out.print(masArmNum.get(i) + ", ");
		}
	}
	
	/*
	 * Метод формирует массив чисел 
	 */
		public static ArrayList<Integer> masArmNum(int k) {
	
		ArrayList<Integer>masArmNum = new ArrayList<>();

		for (int i = 1; i<=k; i++) {
			
			int armNum = chekArm(i);
			if (armNum==1) {
				masArmNum.add(i);
			}
		}
		return masArmNum;
	}
	
	/*
	 * Метод проверяет является ли число числом Армстронга
	 */
	public static int chekArm(int i) {
	
		ArrayList<Integer>masNum = new ArrayList<>();
		int power;
		int num = 0;
		int armNum = 0;
		int promI = i;
	
		while (promI>0) {
			
			int x;
			x = promI%10;
			masNum.add(x);
			promI = promI/10;
		}
		power = masNum.size();
	
		for (int l = 0; l<masNum.size(); l++) {
		
			num = (int)(num + Math.pow(masNum.get(l), power));
		}
		if (num == i) {
			armNum = 1;
		}
		return armNum;
	}
}
