/* Algorithmization
 * ���������� ������� ����������, ������� 7
 * ���� ��� ����������� ������������������. ���������� ������� ����� ������ ������������������, � ������� ���������� �������� �������� ������ ������������������ 
 * ����� ������������ ������������������ ���� ���� �����������.
 */
/*
 *� ������� �� ������� ����� �� ��������� ����� �������� ��-�� ��� ����������� ���������.
 *�������� ��� �������� ����������� �� ������ � ���� ����� ����������, ����� ��������� ���� ����.
 */

package by.epam.java.algorithm.mas1sort;

import java.util.ArrayList;

import java.util.Arrays;

public class Sort7 {

	public static void main(String[] args) {

		ArrayList<Double> masA = new ArrayList<>();
		masA.addAll(Arrays.asList(1.0, 6.0, 9.0, 17.0, 19.0, 26.0, 28.0, 32.0, 46.0, 46.0, 86.0, 98.0));
		ArrayList<Double> masB = new ArrayList<>();
		masB.addAll(Arrays.asList(0.0, 6.0, 7.0, 9.0, 12.0, 17.0, 19.0, 19.0, 45.0, 82.0, 99.0, 107.0, -109.0, 110.8, 125.0, 159.0, 257.0, 336.0, 395.0, 692.0));
		Double Val2;
		Double Val1;
		
		ArrayList<Double> masBprom = new ArrayList<>();//������ ���������� �� ����, ������ ������ ������������� ������� 
		masBprom = masB;
		ArrayList<Double> masAprom = new ArrayList<>(); 
		masAprom = masA;
		
		for (int l = 0; l<masBprom.size(); l++) {
			int Count = masAprom.size();
			int Index = 0;
			Val2 = masBprom.get(l);
			
			for (int i = 0; i < masAprom.size(); i++) {

				Val1 = masAprom.get(i);
				
				if (Val2 <= Val1) {
					
					masAprom.add(i, Val2);
					Index = i;
 					i = masAprom.size();
				} 
				Count--;
				if (Count==0) {
					masAprom.add((i+1), Val2);
					Index = masAprom.size();
					i = masAprom.size();
				}
			}
			
			System.out.println("\n������� � " + (l+1) + " ���������� �������� �� ������� � " + Index + 
					"\n ����� ������������ ������������������ ����� ��������� ��������� �������: ");
			for (int i = 0; i < masAprom.size(); i++) {
				System.out.print(masAprom.get(i) + ", ");
			}
		}
	}
}