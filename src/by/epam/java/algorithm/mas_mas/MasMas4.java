/* Algorithmization
 * ������� ��������, ������� 4
 * ������������ ���������� ������� �� �������. ������� ������� ������ � ����� �������������.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas4 {

	public static void main(String[] args) {
		
		int n;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������� ������� � ���� ������� �������������� �����"); 
		n = S.nextInt();
		int[][] N = new int[n][n]; 
		
		for (int i = 0; i < n; i++) {
			
			for (int y = 0; y < n; y = y + 2) {
				
				N[y][i] = i + 1;
				N[y + 1][i] = n - i;  
			}
		}
		/*
		 * ���������� ����� ������������� ��� �������� �������
		 */

		for (int l = 0; l < n; l++) // ���� ������
		{
			for (int m = 0; m < n; m++) // ���� ������� � ������
			{
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
	}
}