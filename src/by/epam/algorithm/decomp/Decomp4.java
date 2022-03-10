/* Algorithmization
 * Декомпозиция, задание 4
 * На плоскости с помощью координат заданы точки. Определить между какими точками наибольшее расстояние
 */

package by.epam.algorithm.decomp;

import java.lang.Math;

public class Decomp4 {

	public static void main(String[] args) {

		int N [] = {50,3,9,4,5,6,5,2,6,54,841,19,864,841,6842,428,824,428,817,874,89,1,8,5,6,6200};
		
		double maxDist = 0;
		
		int numPoint1 = 0;
		int numPoint2 = 0;
		int xPoint1 = 0;
		int xPoint2 = 0;
		int yPoint1 = 0;
		int yPoint2 = 0;
		
		for (int i = 0; i<N.length; i = i+2) {
			
			int X = N[i];			//предположим что координаты выражены целыми числами
			int Y = N[i+1];
			
			for (int l = i+2; l<N.length; l = l+2) {
				
				int X1 = N[l];
				int Y1 = N[l+1];
				double distPoint;
				
				distPoint = distPoint(X, Y, X1, Y1);
				
				if (distPoint>maxDist) {
					
					maxDist = distPoint;
					numPoint1 = (i/2)+1;
					numPoint2 = (l/2)+1;
					xPoint1 = N[i];
					yPoint1 = N[i+1];
					xPoint2 = N[l];
					yPoint2 = N[l+1];
				}
			}
		}
			System.out.println ("Наибольшее расстояние между точками №" + numPoint1 + " (" + xPoint1 + ", " + yPoint1 + ") "
				+ "\nи №" + numPoint2 + " ("+ xPoint2 + ", " + yPoint2 + ") = " + maxDist);
	}
	
	public static double distPoint (int X, int Y, int X1, int Y1) {
		
		double distPoint;
		
		distPoint = Math.sqrt(Math.pow(X - X1, 2) + Math.pow (Y - Y1, 2));
		
		return distPoint;
	}
}
