/* Algorithmization
 * ������������, ������� 3
 * ��������� ������� ����������� �������������� � ��������� ������ �������
 *  ��������� ����� ���������� ������� ������������
 * ������� ��� ������ ����������� �������������� 
 */


package by.epam.algorithm.decomp;

//import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Decomp3 {

	public static void main(String[] args) {
		
		double square;
		int numAngle;
		double length;
		double sumAngle;
		double angle;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ����� ������ ����������� ��������������"); 
		double n = S.nextDouble();
		
		if (n < 3||n % 1 != 0) {
			
			System.out.println("���������� ����� ������ ���������� ����� ������ ������ ����."
					+ "\n ��������� ��������� ������ � ��������� �����"); 
			return;
		} else {
			
			numAngle = (int)n;
		}
		System.out.println("������� ������ ������� ����������� ��������������"); 
		length = S.nextDouble();
		
		sumAngle = 180*(numAngle-2);
		angle = sumAngle/numAngle;
		square = numAngle * squareAngle(length, angle);
		DecimalFormat Dec = new DecimalFormat ("#.##");
		String SQ = Dec.format(square);
		System.out.println("������� ����������� "+numAngle+"-��������� �� �������� "+ length + " ����� " + SQ); 
		
	}
		
	public static double squareAngle (double length, double angle) {
		
		double S;
		
		double alpha;
		double alphaRad;
		
		alpha = (180-angle)/2;
		alphaRad = Math.toRadians(alpha);
		S = (length*length)/(4*(Math.tan(alphaRad)));	
		return S;
	}
}
