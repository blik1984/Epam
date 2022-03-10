/* Algorithmization
 * ������� ��������, ������� 6
 * ������������ ���������� ������� �� ������� A[I,J]=sin((I^2-J^2)N). ������� ������� ����� �������������.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas7 {

	public static void main(String[] args) {

		int n;
		int count = 0;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������� ������� � ���� �������������� �����"); 
		n = S.nextInt();
		double[][] N = new double[n][n]; 
		
		for (int I = 0; I < n; I++) {
			
				for (int J = 0; J < n; J++) { 
					
					N[I][J] = Math.sin((I * I - J * J) / n);
					
					if (N[I][J] > 0) {
						
						count++;
					}
				}
			}
		/*
		 * ������� ������� ��� ��������
		 */
		for (int l = 0; l < n; l++) 
		{
			for (int m = 0; m < n; m++) 
			{
				System.out.printf("%.2f", N[l][m]);
				System.out.print("  ");
			}
			System.out.println("");
		}
		System.out.println("���������� ������������� ��������� � ������� = " + count);
	}
}