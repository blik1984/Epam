/* Algorithmization
 * ������� ��������, ������� 10
 * ����� ������������� �������� ������� ��������� ���������� �������.
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas10 {

	public static void main(String[] args) {

		double[][] N = { 
				{ 11, 2, 9, 4, 8 }, 
				{ 6, -7, 8, 9, 10 },
				{ 11, 12, 13, 14, 2 }, 
				{ 12, 11, 10, 9, 8 },
				{ 7, 6, 5, 4, 2 } 
				};
		for (int i = 0; i < N[0].length; i++) {
			
			if (N[i][i] > 0) // ������ ������ � ������� ������������� ���������
			{
				System.out.println(N[i][i]); // �������
			}
		}
	}
}