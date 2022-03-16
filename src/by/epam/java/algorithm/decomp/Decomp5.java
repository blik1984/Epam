
/* Algorithmization
 * ������������, ������� 5
 * � ������� ����� ������� ������ �� �������� � �������
 */

/*
 * ����� ������� ������������ �� �������� �����
 */

package by.epam.java.algorithm.decomp;

import java.util.Scanner;
import java.util.ArrayList;

public class Decomp5 {

	public static void main(String[] args) {
		
		double num;
		int numVal;
		int sortN[];
		
		int N [] = {50,3,9,4,-5,6,5,2,6,54,841,19,864,-841,6842,428,824,428,817,874,89,1,8,5,6,62000};
		
		sortN = val(N);
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������� �� �������� ����� �� �1 �� �" + (sortN.length) + " ���������� �������"); 
		num = S.nextDouble();
		if (num<1||num%1 != 0) {
			
			System.out.println("����� ������ ���� ����� �������������. ������������� ��������� � ��������� �����"); 
			return;
		}
		
		if (num>sortN.length) {
			System.out.println("���������� ��������� �������� ����� " + (sortN.length) + 
					" , ������������� ��������� � ��������� �����"); 
			return;
		}
		
		numVal = (int)num;
		
		System.out.println("������� �������� = " + sortN[numVal-1]); //�� ���������������� ������� �������� ����� 
																	// �� �������� ��������
	}
	
	/*
	 * ����� ��������� �������� ������� �� ��������, ��� ���� ����� ���������.
	 */
	public static int[] val (int N[]) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(N[0]);
		
		for (int i = 1; i < N.length; i++) {	//��������� � ���������, ����������� �����
			
			int Prom = N[i];
			
			for (int k = 0; k<=A.size();) {
				
				if  (k == A.size()) {
					A.add(Prom);
					k = (A.size()+2);				
				} else if (Prom < A.get(k)) {
					k++;
				} else if (Prom>A.get(k)) {
					
					A.add(k, Prom);
					k = (A.size()+2);
				} else if (Prom == A.get(k)) {
					k = (A.size()+2);				
				}
			}
		}
		
		int sortN[] = new int [A.size()]; //����������� � ������
		
		for (int i = 0; i<A.size(); i++) {
		sortN[i] = A.get(i);
		}
		return sortN;
	}
}
