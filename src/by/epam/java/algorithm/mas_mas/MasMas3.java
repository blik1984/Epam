/* Algorithmization
 * ������� ��������, ������� 3
 * ������� �� ����� �������� ������ � �������� �������.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas3 {

	public static void main(String[] args) {

		int[][] N = { // ����� �������
				{ 1, 2, 9, 4, 8 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 2 }, 
				{ 12, 11, 10, 9, 8 }, 
				{ 7, 6, 5, 4, 2 } 
				};
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ����� ������ �� 1 �� " + (N.length)); 
																			
		int k;
		int p;
		
		k= S.nextInt();
		System.out.println("������� ����� ������� �� 1 �� " + (N[0].length));
		p = S.nextInt();
		System.out.println("������ � " + k);
		
		for (int i = 0; i < N.length; i++) {	// ������� �������� ������ � ���� ������
		
			System.out.print(N[k - 1][i] + ", ");
		}
		
		System.out.println("");
		System.out.println("������� � " + p);
		
		for (int i = 0; i < N[0].length; i++) {		// ������� �������� ������� � ���� �������
		
			System.out.println(N[i][p - 1]); //
		}
	}
}