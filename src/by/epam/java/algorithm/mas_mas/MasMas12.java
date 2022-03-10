/* Algorithmization
 * ������� ��������, ������� 12
 * ������������� ������ ������� �� ����������� � �������� �������� ���������
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas12 {

	public static void main(String[] args) {

		int[][] N = new int[10][10]; 
		
		for (int I = 0; I < N.length; I++) { 
			
			for (int J = 0; J < N[0].length; J++) { 
				
				double p = Math.random() * 16;
				N[I][J] = (int) p;
			}
		}
		System.out.println("�������� �������"); 
		for (int l = 0; l < N.length; l++) {
			
			for (int m = 0; m < N[0].length; m++) {
				
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < N.length; i++) { // ��������� �� �����������. ������������ ������, ��������� � ����������
											 // ����� � ������� ��� ���������� (��� � ������� ��� ������ ����������)
			for (int n = 0; n < N[0].length - 1;) { 
				
				if (N[i][n] <= N[i][n + 1]) { // ���� ����������� ������ ��� �����, ������ ��� ����
				
					n++;
				} else {	// ���� ����������� ������, �� ������������ � ��������� �����.
				
					int Prom;
					Prom = N[i][n];
					N[i][n] = N[i][n + 1];
					N[i][n + 1] = Prom;
					n--;
					if (n < 0) {		// ������������ ����� �� ��������� � ������������� �������
						n = 0;
					}
				}
			}
		}
		System.out.println("\n������ �� �����������");
		for (int l = 0; l < N.length; l++) // ������� ������� �� ��������, �������������� �� �����������.
		{
			for (int m = 0; m < N[0].length; m++) {
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
		for (int i = 0; i < N.length; i++) // ��������� �� ��������
		{
			for (int n = 0; n < N[0].length - 1;) // �������� �� ������� �� �������������� ��������. �.�. �������������
													// ����� ���������� � �������������+1
			{ 										// ���� �������� �� ����������, �� ��� �������� �������� � ��������������
													// ���������.
				if (N[i][n] >= N[i][n + 1]) // ���� ����������� ������ ��� �����, ������ ��� ����
				{
					n++;
				} else // ���� ����������� ������, �� ������������ � ��������� �����.
				{
					int Prom;
					Prom = N[i][n];
					N[i][n] = N[i][n + 1];
					N[i][n + 1] = Prom;
					n--;
					if (n < 0) // ������������ ����� �� ��������� � ������������� �������
					{
						n = 0;
					}
				}
			}
		}
		System.out.println("\n������ �� ��������");
		for (int l = 0; l < N.length; l++) // ������� ������� �� ��������, �������������� �� ��������.
		{
			for (int m = 0; m < N[0].length; m++) {
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
	}
}