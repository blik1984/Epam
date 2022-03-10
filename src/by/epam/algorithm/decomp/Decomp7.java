
/* Algorithmization
 * ������������, ������� 7
 * �������� �����, ������� ��������� ���������� ���� �������� ����� �� 1 �� 9.
 */

/*
 * ���������� �����: ������, ��������, ���. � ����� �������� ������ � ��������� ���������.
 * ���� �������� ������ INT ������ � ���� �������)))
 */


package by.epam.algorithm.decomp;

import java.util.Scanner;

public class Decomp7 {

	public static void main(String[] args) {
		
	int startBorder;
	int stopBorder;
	int stepFlag;
	int step = 1;
	int sumFactorial = 0;
	String stepVal = null;
	
	System.out.println("������ ���������."); 
	startBorder = chekIntPositive();
	System.out.println("����� ���������."); 
	stopBorder = chekIntPositive();
	
	while (stopBorder<startBorder) {
		
		System.out.println("����� ��������� ������ ���� ������ ��� ����� " + startBorder + "��������� �����."); 
		stopBorder = chekIntPositive();
	}
	
	System.out.println("�������� - ������� 1. ׸���� - ������� 2. ��� ����� - ������� 3."); 
	stepFlag = chekIntPositive();
	while (stepFlag>3) {
		System.out.println("�������� - ������� 1. ׸���� - ������� 2. ��� ����� - ������� 3."); 
		stepFlag = chekIntPositive();
	}
	
	if (stepFlag == 1) {
		stepVal = "��������";
	} else if (stepFlag == 2) {
		stepVal = "������";
	}else if (stepFlag == 3) {
		stepVal = "����";
	}
	
	if (stepFlag == 1) {
		
		step = 2;

		if ( startBorder % 2 == 0) {
			startBorder = startBorder +1;
		}
	} else if (stepFlag == 2) {
		
		step = 2;

		if (startBorder % 2 != 0) {
			
			startBorder = startBorder +1;
		}
	}
	
	for (int i = startBorder; i<=stopBorder; i = i+step) {
		
		double check;
		check = sumFactorial/10 + factorial(i)/10;
		
		if ( check > (2147483647/10)) {
			System.out.println("�������� ������� �������, ��� ���������� ��������� � ������ ����������"); 
			return;
		}

		sumFactorial = sumFactorial + factorial(i);
	}
	
	System.out.println("����� ����������� " + stepVal + " ����� �� " + startBorder + 
			" �� " + stopBorder + " ����� " + sumFactorial); 
	}
	
	/*
	 * �������� �� ������������� � �����
	 */
	public static int chekIntPositive () {
		
		int val;
		double num;
		
	@SuppressWarnings("resource")
	Scanner S = new Scanner(System.in);
	System.out.println("������� �����"); 
	num = S.nextDouble();
	while (num<1||num%1 != 0) {
		
		System.out.println("����� ������ ���� ����� �������������. ��������� �����"); 
		num = S.nextDouble();
	}
	val = (int)num;
	return val;
	}
	
	/*
	 * ���������� ��������� ����������� �����
	 */
	public static int factorial (int val) {
		
		int factorial = 1;
		
		for (int i = 1; i <= val; i++) {
			
			factorial = factorial * i;
		}
		return factorial;
	}
}
