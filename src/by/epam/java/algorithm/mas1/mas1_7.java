/* Algorithmization
 * ���������� �������, ������� 7
 * � ������� �� 2n ��������� ����� max(a_1+a_2n, a_2+a_2n-1,...a_n+a_n+1)
 */

package by.epam.java.algorithm.mas1;

public class mas1_7 {

	public static void main(String[] args) {
		
		double sum;
		int N1;
		
		double[] N = { 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, 12, 13, 14, 15, 16, 17, 18, 19 }; // ������� ������
		sum = Double.NEGATIVE_INFINITY; // ����� ��������� �������� ����� ��� �������� � ���� �������������
		N1 = N.length - 1; // ���������� ������ ���������� ��������
		
		for (int i = 0; i * 2 <= N.length; i++) { 

			double sum1;
			sum1 = N[i] + N[N1]; 
			System.out.println(" =  " + sum1); // ������� ����� ��� ������������
			
			if (sum < sum1) // ���� ����� ���������� ����� ������ ��� ���������, �� �������� �.
			{
				sum = sum1;
			}
			N1--; // ��������� ������ �������� � "���" �������
		}
		System.out.println("max =  " + sum);
	}
}