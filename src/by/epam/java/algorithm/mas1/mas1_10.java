/* Algorithmization
 * ���������� �������, ������� 10
 * ����� ������ ������ ������ ������ ������� (�������������� �������� ��������� ������). �������������� ������ �� ������������.
 */

package by.epam.java.algorithm.mas1;

//������� 1. ���� ������ �� ����� ��������� ��������

/*public class mas1_10 {
	
	public static void main(String[] args) {
		
		int[] N = { 7, 5, -8, 0, 4, 5, 9, 12, -5, -1, 8, 6, 23, 95, -8, 3, 4, 5, 3, 3, 3, 5 }; 
		
		for (int i = 0; i < N.length; i++) 
		{
			for (int n = 1; n < N.length; n = n + 2) // ���� ������ ������� � ����� �������� ����� ����
			{
				N[n] = 0; // 
			}
			System.out.print(N[i] + ", "); 
		}
	}
}
*/

//������� 2. ��� ������ �������� � ����� �������

public class mas1_10 {
	
	public static void main(String[] args) {
		
		int[] N = { 7, 5, -8, 0, 4, 5, 9, 12, -5, -1, 8, 6, 23, 95, -8, 3, 4, 5, 3, 3, 3, 5, 33 }; 
		
		int count = 1;
		
			for (int n = 2; n < N.length; n = n + 2) 
			{
				N[count] = N[n]; 
				count++;
			}
			for (int l = count; l<N.length; l++)
				N[l] = 0;
			for (int i = 0; i < N.length; i++) 
		{
			System.out.print(N[i]+", "); 
		}
	}
}