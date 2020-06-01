package by.module2.task49;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 49. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 * 
 */
public class Task49 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		double t;
		double square;
		double hypotenuse;
		
		x = 0;
		y = 0;
		z = 0;
		t = 0;
		square = 0;
						
		Scanner input = new Scanner(System.in);
		// Ввод чисел	
		try {
		x  = (double) CommonTools.readBetween(input, "x", Types.DOUBLE, 0, 
											CommonTools.MAX_DOUBLE, false, true);
		y  = (double) CommonTools.readBetween(input, "y", Types.DOUBLE, 0, 
											CommonTools.MAX_DOUBLE, false, true);
		z  = (double) CommonTools.readBetween(input, "z", Types.DOUBLE, 0, 
											CommonTools.MAX_DOUBLE, false, true);
		t  = (double) CommonTools.readBetween(input, "t", Types.DOUBLE, 0, 
											CommonTools.MAX_DOUBLE, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Нахождение площади
		try {
			hypotenuse = getHypotenuse(x, y);
			square = getSquareTriangle(hypotenuse, z, t);
			square += getSquareTriangle(hypotenuse, x, y);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 		Вывод результата
		System.out.println("Площадь  четырехугольника равна " + square);	
	}

	private static double getHypotenuse(double x, double y) throws IOException {
		double hypotenuse;
		
		hypotenuse = 0;
		if (x <= 0 || y <= 0) {
			throw new IOException("Wrong arguments");
		}
		hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return hypotenuse;
	}

	private static double getSquareTriangle(double v, double z, double t) throws IOException {
		double HalfPerimeter;
		double square;
		
		HalfPerimeter = 0;
		square = 0;
		if (v >= (z + t)  || z >= (v + t) || t >= (z + v) || z * v * t <= 0) {
			throw new IOException("Wrong arguments");
		}
		HalfPerimeter = (v + z + t) / 2;
		square = Math.sqrt(HalfPerimeter * (HalfPerimeter - v) 
				* (HalfPerimeter - z) * (HalfPerimeter - t));  
		return square;
	}

}	