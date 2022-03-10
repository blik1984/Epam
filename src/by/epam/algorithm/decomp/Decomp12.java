
/* Algorithmization
 * ������������, ������� 12
 * ���� ����������� ����� � � N. ������������ ������, ���������� �������� �������� �����,
 * ����� ���� ������� ����� � � ������� �� ������ N.
 */

package by.epam.algorithm.decomp;

import java.util.ArrayList;

public class Decomp12 {

	public static void main(String[] args) {
		
		int K = 8;		//�������� ��������� ����� �� ������, �.�. �� ������� ��� �����������
		int N = 172;
		ArrayList<Integer> mas = new ArrayList<>();
		while (N>=1) {
			int Val = Val(K,N);
			if (Val>0) {
				mas.add(Val);
			}
			N--;
		}
		for (int i = 0; i<mas.size(); i++) {
			System.out.print(mas.get(i) + ", ");
		}
	}
	public static int Val(int K, int N) {
		
		int Val = N;
		ArrayList<Integer> mas1 = new ArrayList<>();
		int sum = 0;
		
		while (Val>0) {
			
			int x = Val%10;
			mas1.add(x);
			Val = Val/10;			
		}
		
		for (int i = 0; i< mas1.size(); i++) {
			
			sum = sum + mas1.get(i);
		}
		
		if (sum == K) {
			
		return N;
		} else {
	
		return 0;
		}
	}
}
