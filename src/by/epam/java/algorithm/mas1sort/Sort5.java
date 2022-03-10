/* Algorithmization
���������� ���������. 
��������� ������������ �������� ���������� ������� ��������� ������, ������� ������� � ��������� �������.
 */

/* 
 * ���������� ArrayList �.�. �� ������� ��� ������� ��������. ���� ������ ����������� 
 * ������������ ��������, �� ����� ��� �������������� � ArrayList � ������� ����� 
 * ���������� ����������
 */

/* 
 * ��������, �� ���������� ����� ���������
 */

package by.epam.java.algorithm.mas1sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort5 {

	private static int sortLength = 0;			//����� ��� ��������������� ������������������
	
	public static void main(String[] args) {

		
		
		ArrayList<Double> N = new ArrayList<Double>();
		N.addAll(Arrays.asList(3.0, 0.1, 9.0, 159.0, 12.0, 17.0, 395.0, -19.0, 19.0, -692.0, 7.0, 0.0, 82.0, 99.0, 109.0, 110.0, 45.0, 125.0, 257.0, 336.0, 107.0, -19.0));		
		
		System.out.println("��������� ������������������: ");
		for (int i = 0; i < N.size(); i++) {
			
			System.out.print(N.get(i)+", ");
		}
		System.out.println(" ");

		
		for (int i = 0; i < N.size(); i++) {
			
			int Index;
			double Val;
			
			Val = N.get(i);
			
			Index = indexInsert(Val, N);
			
			N.add(Index , Val);
			N.remove(i+1);							//������� ��� ���������� �� ������������, � ����������, ������ ������� "��������"
			sortLength++;			
		}
		
		System.out.println("\n��������������� ������������������: ");
		for (int i = 0; i < N.size(); i++) {
			
			System.out.print(N.get(i) +", ");
		}
	}
	
	public static int indexInsert (Double Val, ArrayList<Double> N) {	
				
			int startIndex = 0;							//������ ���������������� ���������
			int endIndex = (sortLength-1);				//��������� ���������������� ���������			
			int workSortLength; 						//����� ������������ ���������
			int outIndex = 0;
			
			if (sortLength==0) {				//���� �� ����� ������ ������� ���������������� ���������, ��� ������ ���������, �� ������
				outIndex = 0;

			} else if (sortLength==1) {			//����� ������ ������� ���������, ��� ����� �������� ������ � ����� ���������
				
				if (Val <= N.get(0)) {
					outIndex = 0;
					
				} else if (Val>N.get(0)) {
					outIndex = 1;
				}

			} else if (sortLength>1) {
					
				int keyIndex;						//������ ������������ �������� ������������ ���������, ��� ������ ������� �� ��������+1
				keyIndex = (sortLength/2);
				
				do {
					double Key = N.get(keyIndex);				//��� ����������� ������� ������������ ���������
					workSortLength= endIndex-startIndex + 1;	//����������� �������� �������� �� ������� �� ���������� ���������������� �������
					
						if (Val<Key) {							//���� ����������� ������� ������ ������������ ��������
		
						endIndex = keyIndex-1;					//����������� ������� ������� ������������ ��������� ����
						workSortLength = endIndex-startIndex + 1;	//����� ����� ������������ ���������
						keyIndex = keyIndex - (workSortLength/2);	//����� ����������� �������
						
						} else if (Val>Key) {					//���� ����������� ������� ������ ������������ ��������

						startIndex = keyIndex+1;				//����������� ������ ������� ������������ ��������� ����
						workSortLength= endIndex-startIndex + 1;
						keyIndex = keyIndex + (workSortLength/2);
						
						} else if (Val==Key) {					//���� ����������� ������� ����� ������������ ��������
							outIndex = keyIndex;				//��������� �����
							workSortLength = 0;
						}
					
					} while (workSortLength>1);
				
				if (startIndex==endIndex) {	
					keyIndex = endIndex;
				}
				if (Val<=N.get(keyIndex)) {			//
				
					outIndex = keyIndex;
						
					} else if (Val>N.get(keyIndex)) {
						outIndex = keyIndex+1;
						
					}else  {
						outIndex = keyIndex;
					}
				}
			return outIndex;
			} 
		}

