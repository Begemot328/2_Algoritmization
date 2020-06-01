package by.module2.task44;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 44 На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 
 * 
 * 
 */
public class Task44 {

	public static void main(String[] args) {
		int n;
		double maxDistance;
		int[] result;
		Number[][] coords;
		
		n = 0;
		result = new int[2];
		coords = new Number[2][100];
		maxDistance = 0;
		
		Scanner input = new Scanner(System.in);
		// Ввод размерностей массива точек			
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.MIN_INT, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 		Заполнение массива точек		
		coords = CommonTools.makeArray(input, n, 2, "Координаты точки", Types.INT, 
				CommonTools.ZERO, CommonTools.MAX_INT, false, true);
		input.close();
		// 		Нахождение максимального расстояния	
		result = findMaxDistance(n, coords);
		maxDistance = findDistance(coords[result[0]], coords[result[1]]);
		// 		Вывод результата
		System.out.println("Наибольшее расстояние - между точками " + result[0] 
							+ " и " + result[1] + " и составляет " + maxDistance);	
	}
	
	public static double findDistance(Number[] pointA, Number[] pointB) {
		double distance;
		
		distance = 0;
		distance = Math.sqrt(Math.pow((int) pointA[0] - (int) pointB[0],2) 
				+ Math.pow((int) pointA[1] - (int) pointB[1],2));
		return distance;
	}
	
	public static int[] findMaxDistance(int n, Number[][] coords) {
		int[] result;
		double maxResult;
		
		maxResult = 0;
		result = new int[2];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (findDistance(coords[i], coords[j]) > maxResult) {
					result[0] = i;
					result[1] = j;
					maxResult = findDistance(coords[i], coords[j]);
				}
			}
		}		
		return result;
	}
}

	