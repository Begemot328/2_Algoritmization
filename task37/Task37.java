package by.module2.task37;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.7. Пусть даны две неубывающие последовательности действительных чисел. 
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 * 
 */
public class Task37 {

	public static void main(String[] args) {
		int counter;
		int counter1;
		int counter2;
		int n;
		int m;
		double temp;
		double [] array1;
		double [] array2;
		double [] array3;
		
		array1 = new double[20];
		array2 = new double[20];
		array3 = new double[20];
		n = 10;
		m = 5;
		counter = 0;
		temp = 999;
		counter1 = 0;
		counter2 = 0;
		
		//	 заполнение массивов
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array1[i] = random.nextDouble();
		}
		for (int i = 0; i < m; i++) {
			array2[i] = random.nextDouble();
		}
		// 	сортировка
		array1 = sortArray(array1, n);
		array2 = sortArray(array2, m);

		// 	вывод массивов после сортировки
		System.out.println("Отсортированный массив A");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array1[i] + "	");					
		}
		System.out.println();
		System.out.println("Отсортированный массив B");
		for (int i = 0; i < m; i++) {
			System.out.print("B[" + i + "]" + array2[i] + "	");					
		}
		System.out.println();
		//	объединение
		for (int i = 0; i < n + m; i++) {
			if (array1[counter1] <= array2[counter2]) {
				array3[i] = array1[counter1];
				counter1++;
			} else {
				array3[i] = array2[counter2];
				System.out.println("Вставка  B[" + counter2 + "]" + " на место A[" + i + "]");
				counter2++;
			}
		}
		// 	вывод массивов после сортировки
		System.out.println("Оъединенный массив");
		for (int i = 0; i < n + m; i++) {
			System.out.print("A[" + i + "]" + array3[i] + "	");					
		}
	}
	
	public static double[] sortArray(double[] array, int n) {
		double [] arraySorted;		
		int counter;
		double temp;
		arraySorted = new double[20];
		
		counter = 0;
		temp = 0;
		
		do {
			if (array[counter] <= array[counter + 1]) {
				counter++;
			} else {
				temp = array[counter];
				array[counter] = array[counter + 1];
				array[counter + 1] = temp;
				counter--;
			}
			if (counter < 0) {
				counter  = 0;
			}
		} while (counter < n - 1);
		return array;
	}
}
