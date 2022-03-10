/* Algorithmization
 * ������� ��������, ������� 2
 * ������� �� ����� �������� ���������� �������, ������� ����� �� ���������.
 */
/* ��������� � ��� ���.��� ���� ������� ������ �� �����.
 * ������� ����� ��������   ��-��	������� ���������
 * ����� 					��-��	�������� ���������
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas2 {

	public static void main(String[] args) {
		
		int[][] N = { 
				{ 1, 2, 9, 4, 8 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 2 }, 
				{ 12, 11, 10, 9, 8 }, 
				{ 7, 6, 5, 4, 2 } 
				};
		
		int Kol;
		Kol = N.length; // ���������� �����-��������
		
		System.out.println("������� ��������� ������� ");
		for (int i = 0; i < Kol; i++) {	// ������� ��������� ��-��
		
			System.out.println(N[i][i]); 
		}
		
		System.out.println("�������� ��������� ������� ");
		int n = 1;
		for (int i = 0; i < Kol; i++) {	// ������� ��������� ��-��
		
			System.out.println(N[Kol - n][i]); 
			n++;
		}
	}
}