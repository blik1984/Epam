/* Algorithmization
 * ������� ��������, ������� 11
 * ������������  ������� 10*20, ��������� ���������� ������� �� 0 �� 15 (����� ������� ��� ������� ��������� �������� � ���������� �������� � ����� �����). 
 * ������� �� ����� ���� ������� � ������ ����� � ������� ����� ���� ����������� 3 � ������ ���
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas11 {

	public static void main(String[] args) {

		int[][] N = new int[10][20]; 
		
		for (int I = 0; I < N.length; I++) {
			
			for (int J = 0; J < N[0].length; J++) { 
				
				double p;
				p = Math.random() * 16;
				N[I][J] = (int) p;
			}
		}
		for (int l = 0; l < N.length; l++) // ������� ������� ��� ��������
		{
			for (int m = 0; m < N[0].length; m++) {
				if (N[l][m] < 10) {
					System.out.print(N[l][m] + "  ");
				} else {
					System.out.print(N[l][m] + " ");
				}
			}
			System.out.println("");
		}
		for (int J = 0; J < N[0].length; J++) // ������� ����� �������, ���� ����� 5 ����������� 3 � ����� ���
		{
			int C = Count(N, J);
			
			if (C >= 3) {
				System.out.println("� ������� " + (J + 1) + " ����� 5 ����������� 3 � ����� ����");
			}
		}
	}

	public static int Count(int N[][], int n)// ����� ������� ���������� ��������� �� ��������� 5 � ������ �������
	{ 										// ������� � ����� ������ � ����� �������� �������
		int count = 0;
		
		for (int i = 0; i < N.length; i++) {
			
			if (N[i][n] == 5) {
				count++;
			}
		}
		return count;
	}
}