/* Algorithmization
 * ������� ��������, ������� 9
 * �  ������� ��������������� ����� ��������� ����� � ������ ������� � ���������� ������������ �� ���.
 */

package by.epam.java.algorithm.mas_mas;

public class MasMas9 {

	public static void main(String[] args) {

		double[][] N = { 
				{ 1, 2, 9, 4, 8 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 2 }, 
				{ 12, 11, 10, 9, 8 }, 
				{ 7, 6, 5, 4, 2 } 
				};
		
		int NumColumn = 0; 	
		double MaxSumColumn = 0; 
		
		for (int i = 0; i < N[0].length; i++) {
			
			double S = SumColumn(N, i); 
			System.out.println("����� � ������� �" + (i + 1) + "  =  " + S); // ������� ������ ����� ��� ������������
																				// ��������
			if (MaxSumColumn < S) {
				
				MaxSumColumn = S;
				NumColumn = i;
			}
		}
		System.out.println("������������ ����� � ������� �" + (NumColumn + 1) + "  =  " + MaxSumColumn); 
	}

	/*
	 * ����� ������� ����� ��������� �������, ������� � ����� ������ � �����
	 * �������� �������
	 */
	public static double SumColumn(double N[][], int n) {
		
		double SumColumn = 0;
		for (int i = 0; i < N[0].length; i++) {
			
			SumColumn = SumColumn + N[i][n];
		}
		return SumColumn;
	}
}