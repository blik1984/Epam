/* Algorithmization
 * ���������� �������, ������� 2
 * ��������  �������� �������, ������� ������ ��������� ����� ���� ������
 */

package by.epam.java.algorithm.mas1;

import java.util.Scanner;

public class mas1_2 {
	
	public static void main(String[] args) {
		
		int n1;
		double Z;
		int count = 0; // ������� �����
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������ �������"); 
		n1 = S.nextInt();
		double[] N = new double[n1];
		System.out.println("������� Z"); 
		Z = S.nextDouble();
		
		
		for (int i = 0; i < N.length; i++) 
		{
			N[i] = i; 
			
			if (N[i] > Z) 
				
			{
				N[i] = Z; 
				count++; 
			}
		}
		System.out.println("���������� ������������ ����� = " + count);
	}
}
