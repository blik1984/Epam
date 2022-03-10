/* Algorithmization
 * ������� ��������, ������� 14
 * ������������ ��������� ������� m*n, ��������� ������� 0 � 1. 
 * � ������ ������� ���������� ���������� ����� 1 ������ ���� ����� 
 * ������ �������
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas14 {

	public static void main(String[] args) 
	{
		int m;
		int n;
		
		do {
			m = (int) (Math.random() * 50);
			n = (int) (Math.random() * 50);
			
			while (n == 0) {
				
				n = (int) (Math.random() * 50);
			}
		} while (m < n);
		
		System.out.println(m);
		System.out.println(n);
		
		int[][] N = new int[m][n];
		
		for (int i = 0; i < n; i++) {
			
			for (int j = (n - i - 1); j < n; j++) {
				
				N[i][j] = 1;
			}
		}
		
		for (int l = 0; l < m; l++) {
			
			for (int i = 0; i < n; i++) {
				
				System.out.print(N[l][i] + " ");
			}
			System.out.println("");
		}
	}
}