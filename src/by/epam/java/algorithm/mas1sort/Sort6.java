/* Algorithmization
���������� �����. ��� ���������� � ������� ��������� �������� ��� ������ ����������.
������ ��������� � ������������ � ��������� � ������� ����������.
 */

package by.epam.java.algorithm.mas1sort;

public class Sort6 {

	public static void main(String[] args) {

		int[] N = { 7, 5, -8, 0, 4, 5, 9, 12, -5, -1, 8, 6, 23, 95, -8, 3, 4, 5, 3, 3, 3, 5 };
		
		System.out.println("��������� ������������������: ");
		
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
		for (int i = 0; i < N.length-1; ) { 

			if (N[i] <= N[i+1]) { 	// ���� ����������� ������ ��� �����, ������ ��� ����
				i++;
				
			} else {				// ���� ����������� ������, �� ������������ � ��������� �����.

				int Prom;
				Prom = N[i];
				N[i] = N[i+1];
				N[i+1] = Prom;
				i--;
				if (i < 0) {		// ������������ ����� �� ��������� � ������������� �������
					i = 0;
				}
			}
		}
		
		System.out.println("\n��������������� ������������������: ");
		
		for (int i = 0; i < N.length; i++) {
			
			System.out.print(N[i]+", ");
		}
	}
}

