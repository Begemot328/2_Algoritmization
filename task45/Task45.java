package by.module2.task45;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 45 Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 * 
 * 
 */
public class Task45 {

	public static void main(String[] args) {
		int n;
		double max;
		double secondMax;
		Number[] a;
		
		n = 0;
		a = new Number[100];
		max = CommonTools.MIN_DOUBLE;
		secondMax = CommonTools.MIN_DOUBLE;
		
		Scanner input = new Scanner(System.in);
		// Ввод размерностей массива			
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 		Заполнение массива точек		
		a = CommonTools.makeArray(input, n, "A", Types.DOUBLE, 
				CommonTools.MIN_DOUBLE, CommonTools.MAX_DOUBLE, true, true);
		input.close();
		// 		Нахождение максимального значение	
		max = findMax(n, a);
		secondMax = findSecondMax(n, a, max);
		// 		Вывод результата
		System.out.println("Второе максимальное число составляет " + secondMax);	
	}
	
	public static double findDistance(Number[] pointA, Number[] pointB) {
		double distance;
		
		distance = 0;
		System.out.println("pointA " + (int)pointA[0] + "  " + (int)pointA[1]);
		System.out.println("pointB " + (int)pointB[0] + "  " + (int)pointB[1]);
		distance = Math.sqrt(Math.pow((int) pointA[0] - (int) pointB[0],2) 
				+ Math.pow((int) pointA[1] - (int) pointB[1],2));
		System.out.println("distance " + distance);
		return distance;
	}
	
	public static double findMax(int n, Number[] a) {
		double max;
		
		max = 0;		
		max = CommonTools.MIN_DOUBLE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max,(double) a[i]);
		}		
		return max;
	}
	
	public static double findSecondMax(int n, Number[] a, double max) {
		double secondMax;
		
		secondMax = CommonTools.MIN_DOUBLE;
		for (int i = 0; i < n; i++) {
			if ((double) a[i] != max) {
				secondMax = Math.max(secondMax,(double) a[i]);
			}
		}		
		return secondMax;
	}
	
	public static void erase(double x, Number[] a) {
		
		for (int i = 0; i < a.length; i++) {
			if ((double) a[i] == x) {
				a[i] = 0;
			}
		}		
	}
}

	