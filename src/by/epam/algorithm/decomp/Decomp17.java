
/*
* Algorithmization
 * ������������, ������� 17
 *�� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ����.
 *������� ���������� ���������� ���������� ����� �������� ����.
 */
/*
 * ��������� ����� ������������ �������������. ���� ����� ����� �������������, 
 * ������ � ����� ������ ����� ��������� �����. 
 */

package by.epam.algorithm.decomp;

import java.util.ArrayList;


public class Decomp17 {

	public static void main(String[] args) {
		
		double n = 81;
		double workN = n;
		int count = 0;
		
		while (workN>0) {
			
			workN = workN-sumNum(workN);
			count++;
		}
		
		System.out.print("��� ���������� ����� " + n + " � ���� ���� ��������� ����� ��� ���� ���������� "
				+ "���������� " + count + " ���������� ���� ��������" );
	}
	
	/*
	 * ����� ��������� �������� �������
	 */
	public static int sumNum (double workN) {
		
		 int sumNum = 0;
		ArrayList<Integer> mas = new ArrayList<>();
		mas = intConvertToArray(workN);
		
		for (int i = 0; i<mas.size(); i++) {
			sumNum = sumNum + mas.get(i);
		}
		 return sumNum;
	}
	
	/*
	 * ����� ��������� ����� ����� �� ��������� ����� � ���������� � ������
	 */
	
	public static ArrayList<Integer> intConvertToArray (double workN) {
		
		ArrayList<Integer> mas = new ArrayList<>();
		int numInt = convertToInt(workN);
		do {
		int N = (int)numInt%10;
		
		mas.add(0,N);
		numInt = numInt/10;
		} while (numInt>0);
		
		return mas;
	}
	
	/*
	 * ����� ������� ������� (��� �����) �� �����.
	 */
	public static int convertToInt (double workN) {
		
		while (workN%1!=0) {
			workN = workN*10;
		}
		int numInt = (int)workN;
		return numInt;
	}
}
