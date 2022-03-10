/* Algorithmization
 * ���������� ������� ����������, ������� 1
 * ���� ��� ���������� ������� ��������� �����. ���������� � ���� ������ �������� ������ � �������� ����� �������
 * �������������� ������ �� ������������.
 */
/*
 *���������� �� ������������ �������������� ������ �� ������ �������. �������� ������ ������� ����� ��� �������� ����������.
 *������ ���� ���������� ������ �������, �� ��� ������� ������ ������.
 *���� ��������� ��������� ��������� ����� �������.
 *1. ���������� ��� ������� � ArrayList. �� ��� �� ���� ������, �� �� ������. 
 *2. ������ ������� �������� ������������������ � ������� ��� �� ������ ������������� �������, ������� �� ���� �� �������������, �������� ������ ��������� �����.
 *3. ������������ Arraylist ��� ������� �������� ������.
 *4. ������������ ������ ������ ��� �����������, �� �� ������������ �������� ��� ������������� ��������.
 */
package by.epam.java.algorithm.mas1sort;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("�������� �������� ������� ���������� (1, 2, 3, 4)");
		int n = S.nextInt();
		if (n == 4) { // ���������� ������ �������������� ������
			int[] mas1 = { 1, 6, 9, 7, 12, 6, 8, 648, 8646, 84, 6, 8 };
			int[] mas2 = { 0, 6, 7, 0, 9, 9, 2, 7, 25, 96, 37, 15, 982, 9, 7, 9, 11, 59, 357, 636, 7, 5, 69 };
			int Point = 8; // ����� �������
			int[] MasOut = new int[mas1.length + mas2.length];
			for (int i = 0; i < MasOut.length; i++) {
				if (i < Point) {
					MasOut[i] = mas1[i];
				} else if (i >= Point) {
					if (i < (mas2.length + Point)) {
						MasOut[i] = mas2[i - Point];
					} else {
						MasOut[i] = mas1[i - mas2.length];
					}
				}
				System.out.print(MasOut[i] + ", ");
			}
		} else if (n == 3) { // ���������� ������ ������ ArrayList
			ArrayList<Integer> mas1 = new ArrayList<>();
			mas1.addAll(Arrays.asList(1, 6, 9, 7, 12, 6, 8, 648, 8646, 84, 6, 8));
			ArrayList<Integer> mas2 = new ArrayList<>();
			mas2.addAll(
					Arrays.asList(0, 6, 7, 0, 9, 9, 2, 7, 25, 96, 37, 15, 982, 9, 7, 9, 11, 59, 357, 636, 7, 5, 69));
			for (int i = mas2.size() - 1; i >= 0; i--) {
				Integer Val = mas2.get(i);
				mas1.add(8, Val);
			}
			for (int i = 0; i < mas1.size(); i++) {
				System.out.print(mas1.get(i) + ", ");
			}
		} else if (n == 2) { // ������� ������������������ � ������� ��� ����������� ������ �������
			int[] mas1 = { 1, 6, 9, 7, 12, 6, 8, 648, 8646, 84, 6, 8 };
			int[] mas2 = { 0, 6, 7, 0, 9, 9, 2, 7, 25, 96, 37, 15, 982, 9, 7, 9, 11, 59, 357, 636, 7, 5, 69 };
			int Point = 8; // ����� �������
			for (int i = 0; i < (mas1.length + mas2.length); i++) {
				if (i < Point) {
					System.out.print(mas1[i] + ", ");
				} else if (i >= Point) {
					if (i < (mas2.length + Point)) {
						System.out.print(mas2[i - Point] + ", ");
					} else {
						System.out.print(mas1[i - mas2.length] + ", ");
					}
				}
			}
		} else if (n == 1) { // ���������� ��� ������������ ������� � ArrayList

			ArrayList<Integer> masOut = new ArrayList<>();
			int[] mas1 = { 1, 6, 9, 7, 12, 6, 8, 648, 8646, 84, 6, 8 };
			int[] mas2 = { 0, 6, 7, 0, 9, 9, 2, 7, 25, 96, 37, 15, 982, 9, 7, 9, 11, 59, 357, 636, 7, 5, 69 };
			int Point = 8; // ����� �������
			for (int i = 0; i < (mas1.length + mas2.length); i++) {
				if (i < Point) {
					masOut.add(i, mas1[i]);
				} else if (i >= Point) {
					if (i < (mas2.length + Point)) {
						masOut.add(i, mas2[i - Point]);
					} else {
						masOut.add(i, mas1[i - mas2.length]);
					}
				}
			}
			for (int x = 0; x < masOut.size(); x++) {
				System.out.print(masOut.get(x) + ", ");
			}
		} else {
			System.out.print("������� ������ ������� ����������. ��������� ��������� ������ � ��������� �����");
		}
	}
}