/* Algorithmization
Сортировка вставками. 
Положение вставляемого элемента определять методом бинарного поиска, который вынести в отдельную функцию.
 */

/* 
 * Используем ArrayList т.к. он удобнее при вставке значений. Если массив представлен 
 * классическим массивом, то проще его конвертировать в ArrayList и обратно после 
 * завершения сортировки
 */

/* 
 * работает, но получилось очень громоздко
 */

package by.epam.java.algorithm.mas1sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort5 {

	private static int sortLength = 0;			//длина уже отсортированной последовательности
	
	public static void main(String[] args) {

		
		
		ArrayList<Double> N = new ArrayList<Double>();
		N.addAll(Arrays.asList(3.0, 0.1, 9.0, 159.0, 12.0, 17.0, 395.0, -19.0, 19.0, -692.0, 7.0, 0.0, 82.0, 99.0, 109.0, 110.0, 45.0, 125.0, 257.0, 336.0, 107.0, -19.0));		
		
		System.out.println("Начальная последовательность: ");
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
			N.remove(i+1);							//элемент при сортировке не перемещается, а копируется, потому удаляем "родитель"
			sortLength++;			
		}
		
		System.out.println("\nОтсортированная последовательность: ");
		for (int i = 0; i < N.size(); i++) {
			
			System.out.print(N.get(i) +", ");
		}
	}
	
	public static int indexInsert (Double Val, ArrayList<Double> N) {	
				
			int startIndex = 0;							//начало отсортированного диапазона
			int endIndex = (sortLength-1);				//окончание отсортированного диапазона			
			int workSortLength; 						//длина исследуемого диапазона
			int outIndex = 0;
			
			if (sortLength==0) {				//если мы взяли первый элемент несортированного диапазона, его некуда вставлять, он первый
				outIndex = 0;

			} else if (sortLength==1) {			//взяли второй элемент диапазона, его можно сравнить только с одним элементом
				
				if (Val <= N.get(0)) {
					outIndex = 0;
					
				} else if (Val>N.get(0)) {
					outIndex = 1;
				}

			} else if (sortLength>1) {
					
				int keyIndex;						//индекс центрального элемента исследуемого диапазона, при чётном размере он середина+1
				keyIndex = (sortLength/2);
				
				do {
					double Key = N.get(keyIndex);				//сам центральный элемент исследуемого диапазона
					workSortLength= endIndex-startIndex + 1;	//исследуемый диапазон размером от первого до последнего отсортированного индекса
					
						if (Val<Key) {							//если сортируемый элемент меньше центрального элемента
		
						endIndex = keyIndex-1;					//передвигаем верхнюю границу исследуемого диапазона вниз
						workSortLength = endIndex-startIndex + 1;	//новая длина исследуемого диапазона
						keyIndex = keyIndex - (workSortLength/2);	//новый центральный элемент
						
						} else if (Val>Key) {					//если сортируемый элемент больше центрального элемента

						startIndex = keyIndex+1;				//передвигаем нижнюю границу исследуемого диапазона вниз
						workSortLength= endIndex-startIndex + 1;
						keyIndex = keyIndex + (workSortLength/2);
						
						} else if (Val==Key) {					//если сортируемый элемент равен центральному элементу
							outIndex = keyIndex;				//закончили поиск
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

