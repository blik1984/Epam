/* Algorithmization
 * ���������� �������, ������� 3
 * � ������� �������������� ����� ��������� ���������� �������������, ������������� � �������
 */

package by.epam.java.algorithm.mas1;

public class mas1_3 {
	
	public static void main(String[] args) {
		
		double[] N = { 3, 5, -8, 0, 0, 0, 9, 12, -5, -1 }; // ������� ������ �� ������ ���������
		int count1 = 0; // ������� �������������
		int count2 = 0; // ������� �������������
		int count3 = 0; // ������� �������
		
		for (int i = 0; i < N.length; i++) // �������� �� ���� �� ���������� �������� �������
		{
			if (N[i] > 0) // ��������� �� ���������������
			{
				count1++;
			} else if (N[i] < 0) // �� ���������������
			{
				count2++;
			} else if (N[i] == 0) // �� ������� ��������
			{
				count3++;
			}
		}
		System.out.println("���������� ������������� ��������� = " + count1);
		System.out.println("���������� ������������� ��������� = " + count2);
		System.out.println("���������� ������� ��������� = " + count3);
	}
}