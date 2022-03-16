/* Algorithmization
 * ������������, ������� 1
 * 1. �������� ����� ��� ���������� ����������� ������ �������� ���� ����������� ����� �
 * ����������� ������ �������� ���� �����. 
 * 
 */

package by.epam.java.algorithm.decomp;

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
		System.out.println("������� ������ ����������� �����"); 
		n1 = S.nextDouble();
		if (n1<1||n1%1 != 0) {
			
			System.out.println("����� �� �������� �����������. ��������� ��������� ������ � �������� ����������� �����"); 
			return;
		}
		System.out.println("������� ������ ����������� �����"); 
		n2 = S.nextDouble();
		if (n2<1||n2%1 != 0) {
			
			System.out.println("����� �� �������� �����������. ��������� ��������� ������ � �������� ����������� �����"); 
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
		System.out.println("���������� ����� �������� ����� "+ N1 + " � "+ N2 + " ����� " + NOD); 
		System.out.println("���������� ����� ������� "+ N1 + " � "+ N2 + " ����� " + NOK); 
	}
	
	
	/*
	 * ����� ���������� ���������� ����� �������� ��� ������ ���������� ����������� �����
	 * � ����� ��������� ������ ����������� �����
	 */
	public static int NOD (int N[] ) {
		
		int minN = 0;			//��������� ��������
		int flag;				//�������������
		
		for (int i = 0; i< (N.length-1); i++) {		//�������� ���������� ����� �� ��������������
			
			if (N[i+1]<N[i]) {
				
				minN = N[i];
			} else  {
			
			minN = N[i+1];
			}
		}
		do {		//��������� ��������� ���� ����� �� ��������� ��������
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
	 * ����� ���������� ���������� ����� ������� ��� ���� ����������� �����
	 * ��� ��������� ���������� ����� ��������.
	 * � ����� ��������� ������ ����������� ����� � ���.
	 * ����� ������� ����������� ��� ��������� � ����� ����� ����� ���������� ��� ������ ���������� �����
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
