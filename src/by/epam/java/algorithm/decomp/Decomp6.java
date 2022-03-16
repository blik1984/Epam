/* Algorithmization
 * ������������, ������� 6
 * �������� �����, ������� ��������� �������� �� ��� ����� ������� ��������
 */

/*
 * ����� �������� ������� ��������, ���� �� ���������� ����� �������� (���) ����� 1. 
 * ������� ����������� ������ ��� ����� �����.
 * ����� ��� ����������� ��� ������ ���������� ����� ���� - Decomp1.NOD
 * ��������� �������� ��� ������ ������������� ���������� �����.
 */

package by.epam.java.algorithm.decomp;

import java.util.Scanner;

public class Decomp6 {

	public static void main(String[] args) {
		
		double num;
		int numVal;
		int answer;

		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ����� ���������� ����� ���������� ���������"); 
		num = S.nextDouble();
		while (num<1||num%1 != 0) {
			
			System.out.println("����� ������ ���� ����� �������������. ���������� �����"); 
			num = S.nextDouble();
		}
		
		numVal = (int)num;
		
		int N [] = new int [numVal];
		
		for (int i = 0; i< N.length; i++) {
			
			N[i] = number(i);
		}
		
		answer = Decomp1.NOD(N);
		
		if (answer == 1) {
			
			System.out.println("����� �������� ������� ��������"); 
		} else {
			
			System.out.println("����� �� �������� ������� ��������"); 
		}
	}
	
	/*
	 * �������� �� �����
	 */
	public static int number (int i) {
		
		double num;
		int number;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ����� �" + (i+1)); 
		num = S.nextDouble();
		while (num%1 != 0) {
			
			System.out.println("����� ������ ���� �����. ��������� �����"); 
			num = S.nextDouble();
		}
		
		number = (int)num;
		
		return number;
	}
}
