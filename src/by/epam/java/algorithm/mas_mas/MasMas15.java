/* Algorithmization
 * ������� ��������, ������� 15
 * ����� ���������� ������� ������� � �������� ��� �������� �������� ������� �� ����
 * ����������� ��� ������� �������� �� ����� �����
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas15 {

	public static void main(String[] args) {
		
		int[][] N = new int[10][10];
		
		for (int i = 0; i < N.length; i++) { // ��������� �������
			
			for (int j = 0; j < N[0].length; j++) {
				
				double p;
				p= Math.random() * 100;
				N[i][j] = (int) p;
			}
		}
		System.out.println("������� �� ���������");
		
		for (int l = 0; l < N.length; l++) { // ������� ��������� �������
			
			for (int m = 0; m < N[0].length; m++) {
				
				if (N[l][m] < 10) {
					
					System.out.print(N[l][m] + "  ");
				} else {
					
					System.out.print(N[l][m] + " ");
				}
			}
			System.out.println("");
		}
		
		int maxVal = N[0][0];
		
		for (int i = 0; i < N.length; i++) { // ���� ������������ ��������
			
			for (int j = 0; j < N[0].length; j++) {
				
				if (N[i][j] > maxVal) {
					
					maxVal = N[i][j];
				}
			}
		}
		
		for (int i = 0; i < N.length; i++) { // �������� �������� ��������
			
			for (int j = 0; j < N[0].length; j++) {
				
				if (N[i][j] % 2 != 0) {
					
					N[i][j] = maxVal;
				}
			}
		}
		
		System.out.println("������������ �������� ������� - " + maxVal);
		System.out.println("������� ����� ���������");
		
		for (int l = 0; l < N.length; l++) { // ������� ��������� �������
			
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