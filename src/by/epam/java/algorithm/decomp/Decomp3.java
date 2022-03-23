/* Algorithmization
 * Декомпозиция, задание 3
 * Вычислить площадь правильного шестиугольника с известной длиной стороны
 *  используя метод вычисления площади треугольника
 * Сделано для любого правильного многоугольника 
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
		System.out.println("Введите число сторон правильного многоугольника"); 
		double n = S.nextDouble();
		
		if (n < 3||n % 1 != 0) {
			
			System.out.println("Количество углов должно выражаться целым числом больше двух."
					+ "\n Запустите программу заново и повторите выбор"); 
			return;
		} else {
			
			numAngle = (int)n;
		}
		System.out.println("Введите размер стороны правильного многоугольника"); 
		length = S.nextDouble();
		
		sumAngle = 180*(numAngle-2);
		angle = sumAngle/numAngle;
		square = numAngle * squareAngle(length, angle);
		DecimalFormat Dec = new DecimalFormat ("#.##");
		String SQ = Dec.format(square);
		System.out.println("Площадь правильного "+numAngle+"-угольника со стороной "+ length + " равна " + SQ); 
		
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
