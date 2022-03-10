
/* Algorithmization
 * ������������, ������� 11
 * � ����� �� ���� ����� ������ ����
 */

/*
 * ��������� �������� ��� ����� � ����������� ������ 18-19 �� (�� 9 223 372 036 854 775 807) ��� �����
 * � 16 ���� ��� �������. ���� ����� ������, �� ����� ����� ���������� ���������� � ���� String ���
 * ������������ BigDecimal.
 */

package by.epam.algorithm.decomp;

import java.util.ArrayList;

public class Decomp11 {
	
	public static void main(String[] args) {
		
		double Val1 = 961514178;
		double Val2 = -9100041178.6518;
		double Val11;
		double Val12;
		
		int size1;
		int size2;
		Val11 = Math.abs(Val1);
		Val12 = Math.abs(Val2);

		size1 = size(Val11);
		size2 = size(Val12);
		if (size1 ==0 ||size2 == 0) {
			System.out.println("����� ������� �������. ��������� ���������� ���� � ������ ���������� ����������");
			return;
		}else {
			if (size1>size2) {
			
				System.out.println("����� "+Val1 + " ����� ������� ���������� ���� � ������ = " + size1);
			} else if (size2>size1) {
			
				System.out.println("����� "+Val2 + " ����� ������� ���������� ���� � ������ = " + size2);
			} else if (size1 == size2) {
			
				System.out.println("����� ����� ���������� ���������� ���� � ������ = " + size1);
			}
		}
	}
	
	/*
	 * ����� ������� ���������� ���� � ���������� �����. ������������ ���������� ������ 18-19 ����
	 * ��� ����� � 16 ������ ��� �������. �������������� ����������� �������� ����.
	 */
	public static int size(double Val) {
		
		ArrayList<Integer> mas = new ArrayList<>();
		long Val2;
		int size;
				
		while (Val%1!=0) {
			Val = Val*10;
		}
		Val2 = (long)Val;
		
		do {
		int N = (int)Val2%10;
		
		mas.add(0,N);
		Val2 = Val2/10;
		} while (Val2>0);
		
		size = mas.size();
		
		return size;
	}
}
