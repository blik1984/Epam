/* Algorithmization
 * ���������� �������, ������� 1
 * ����� ����� ��������� �������, ������� ������ ��������� �����.
 */

package by.epam.java.algorithm.mas1;

import java.util.Scanner;

public class mas1_1 {
	
	public static void main(String[] args) {
		
		int n1;
		int K;
		int sum = 0;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������ �������"); 
		n1 = S.nextInt();
		int[] N = new int[n1];
		System.out.println("������� ��������"); 
		K = S.nextInt();
		
		for (int i = 0; i < N.length; i++) // 
		{
			N[i] = i; 
						
			if (N[i] % K == 0) 
			{
				sum = sum + N[i];
			}
		}
		System.out.println("����� ��������� ������� ������� " + K + " = " + sum);
	}
}
