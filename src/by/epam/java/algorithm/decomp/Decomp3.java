/* Algorithmization
 * Äåêîìïîçèöèÿ, çàäàíèå 3
 * Âû÷èñëèòü ïëîùàäü ïðàâèëüíîãî øåñòèóãîëüíèêà ñ èçâåñòíîé äëèíîé ñòîðîíû
 *  èñïîëüçóÿ ìåòîä âû÷èñëåíèÿ ïëîùàäè òðåóãîëüíèêà
 * Ñäåëàíî äëÿ ëþáîãî ïðàâèëüíîãî ìíîãîóãîëüíèêà 
 */


package by.epam.java.algorithm.decomp;

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
		System.out.println("Ââåäèòå ÷èñëî ñòîðîí ïðàâèëüíîãî ìíîãîóãîëüíèêà"); 
		double n = S.nextDouble();
		
		if (n < 3||n % 1 != 0) {
			
			System.out.println("Êîëè÷åñòâî óãëîâ äîëæíî âûðàæàòüñÿ öåëûì ÷èñëîì áîëüøå äâóõ."
					+ "\n Çàïóñòèòå ïðîãðàììó çàíîâî è ïîâòîðèòå âûáîð"); 
			return;
		} else {
			
			numAngle = (int)n;
		}
		System.out.println("Ââåäèòå ðàçìåð ñòîðîíû ïðàâèëüíîãî ìíîãîóãîëüíèêà"); 
		length = S.nextDouble();
		
		sumAngle = 180*(numAngle-2);
		angle = sumAngle/numAngle;
		square = numAngle * squareAngle(length, angle);
		DecimalFormat Dec = new DecimalFormat ("#.##");
		String SQ = Dec.format(square);
		System.out.println("Ïëîùàäü ïðàâèëüíîãî "+numAngle+"-óãîëüíèêà ñî ñòîðîíîé "+ length + " ðàâíà " + SQ); 
		
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
