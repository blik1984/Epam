
/* Algorithmization
 * Декомпозиция, задание 9
 * Даны длины сторон четырёхугольника X,Y,Z,T. Угол между сторонами X и Y прямой.
 * Необходимо найти площадь прямоугольника.
 */

/*
 *Изначально предполагаем что прямоугольник существует и проверку проводить не нужно.
 */

/*
 * Прямоугольник может быть выпуклым, невыпуклым. Частный случай невыпуклого - самопересекающийся. 
 * И при одинаковых сторонах это будут разные площади.
 * Реализовано для выпуклых. Для просто невыпуклого посчитать не сложно, но как невыпуклые отделить
 * от самопересекающихся я не знаю, а для самопересекающихся моей математики не хватает.
 */

package by.epam.java.algorithm.decomp;

public class Decomp9 {
	
	public static void main(String[] args) {

	int X = 5;
	int Y = 6;
	int Z = 5;
	int T = 5;
	double hypotenuse;
	double square1;
	double square2;
	double squareSum;
	
	hypotenuse = hypotenuse(X,Y);
	square1 = square(X,Y,hypotenuse);
	square2 = square(Z,T,hypotenuse);
	squareSum = square1 + square2;
	
	System.out.println ("Площадь выпуклого четырёхугольника равна " + squareSum);
	
	}
	public static double hypotenuse (int X, int Y) {
		double H;
		H = Math.sqrt(X*X + Y*Y);
		return H;
	}
	
	public static double square (int X, int Y, double H) {
		
		double S;
		double p;
		
		p = (X+Y+H)/2;
		S = Math.sqrt(p*(p-X)*(p-Y)*(p-H));
		return S;
	}
}

