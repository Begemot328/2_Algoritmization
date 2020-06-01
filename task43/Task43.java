package by.module2.task43;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 43. Вычислить площадь правильного шестиугольника со стороной а, используя метод  вычисления площади 
 * треугольника.  
 */
public class Task43 {

	public static void main(String[] args) {
		double a;
		int n;
		double square;
		
		a = 0;
		n = 0;
		square = 0;
				
		// Ввод чисел 				
		Scanner input = new Scanner(System.in);
		try {
			a  =  (double) (float) CommonTools.readBetween(input, "a", Types.FLOAT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// вычисление площади
		
		square = calculateSquare(a, n);
		// 	вывод результатов
		System.out.println("результаты");
		System.out.println("площадь " + n + "-угольника со стороной " + a + " равна " + square);
	}
	
	public static double calculateSquare(double a, int n) {
		// метод вычисления площади правильного n-угольника со стороной a
		double square;
		double radius;
		
		radius = a / 2 / Math.cos(Math.PI * (0.5 - 1. / n));
		square = n * calculateSquareTriangle(radius, radius, Math.PI * 2. / n);
		return square;
	}
	
	public static double calculateSquareTriangle(double a, double b, double angle) {
		double square;
		
		square = a * b * Math.sin(angle) / 2.;
		System.out.println("square " + square);
		return square;
	}
}

	