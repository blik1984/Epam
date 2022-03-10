/* Algorithmization
 * ������������, ������� 2
 * 1. �������� ����� ��� ���������� ����������� ������ �������� ������ ����������� ����� 
 */

package by.epam.algorithm.decomp;

import java.util.Scanner;

public class Decomp2 {
	
	public static void main(String[] args) {
		
		
		int NOD;
		
		int N[] = new int [4];
		
		System.out.println("������� "+ N.length + " ����������� �����"); 

		
		for (int i = 0; i<N.length; i++) {
			
			double Prom = valN(i);
			
			if (Prom < 1||Prom % 1 != 0) {
				
				System.out.println("����� �� �������� �����������. ��������� ��������� ������ � ��������� �����"); 
				return;
			} else {
				N[i] = (int)Prom;
			}
		}
		
		NOD = Decomp1.NOD(N);
		
		System.out.println("���������� ����� �������� ����� " + NOD); 
	}
	
	
	/*
	 * ����� ��������� ������ � ����������
	 */
	
	private static double valN (int i) {
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ����� � " + (i+1)); 
		double n = S.nextDouble();
		return n;
	}
}
