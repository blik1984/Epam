/* Algorithmization
 * ������� ��������, ������� 13
 * ������������� ������� ������� �� ����������� � �������� �������� ���������
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas13 {

	public static void main(String[] args) {

		int[][] N = new int[10][10]; 
		
		for (int I = 0; I < N.length; I++) { 
			
			for (int J = 0; J < N[0].length; J++) { //
				double p = Math.random() * 16;
				N[I][J] = (int) p;
			}
		}
		System.out.println("�������� �������"); // ������� �������� �������
		for (int l = 0; l < N.length; l++) {
			for (int m = 0; m < N[0].length; m++) {
				if (N[l][m] < 10) {
					System.out.print(N[l][m] + "  ");
				} else {
					System.out.print(N[l][m] + " ");
				}
			}
			System.out.println("");
		}
		for (int i = 0; i < N[0].length; i++) // ��������� �� �����������. ������������ ������, ��������� � ����������
												// ����� � ������� ��� ����������
		{
			for (int n = 0; n < N.length - 1;) { 
				
				if (N[n][i] <= N[n + 1][i]) // ���� ����������� ������ ��� �����, ������ ��� ����
				{
					n++;
				} else {   // ���� ����������� ������, �� ������������ � ��������� �����.
				
					int Prom;
					Prom = N[n][i];
					N[n][i] = N[n + 1][i];
					N[n + 1][i] = Prom;
					n--;
					if (n < 0) // ������������ ����� �� ��������� � ������������� �������
					{
						n = 0;
					}
				}
			}
		}
		System.out.println("\n������� �� �����������");
		
		for (int l = 0; l < N.length; l++) // ������� ������� �� ���������, �������������� �� �����������.
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
		for (int i = 0; i < N.length; i++) // ��������� �� ��������
		{
			for (int n = 0; n < N.length - 1;) { 
				
				if (N[n][i] >= N[n + 1][i]) {// ���� ����������� ������ ��� �����, ������ ��� ����
				
					n++;
				} else {	// ���� ����������� ������, �� ������������ � ��������� �����.
				
					int Prom;
					Prom = N[n][i];
					N[n][i] = N[n + 1][i];
					N[n + 1][i] = Prom;
					n--;
					if (n < 0) // ������������ ����� �� ��������� � ������������� �������
					{
						n = 0;
					}
				}
			}
		}
		System.out.println("\n������� �� ��������");
		
		for (int l = 0; l < N.length; l++) {// ������� ������� �� ���������, �������������� �� ��������.
		
			for (int m = 0; m < N[0].length; m++) {
				if (N[l][m] < 10) {
					System.out.print(N[l][m] + "  ");
				} else {
					System.out.print(N[l][m] + " ");
				}
			}
			System.out.println("");
		}
	}
}