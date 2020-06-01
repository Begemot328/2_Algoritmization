package by.module2.task33;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.3. —ортировка выбором. ƒана последовательность чисел. “ребуетс€ переставить элементы так,
 * чтобы они были расположены по убыванию. ƒл€ этого в массиве, начина€ с первого, выбираетс€ наибольший
 * элемент и ставитс€ на первое место, а первый - на место наибольшего. «атем, начина€ со второго, эта процедура
 * повтор€етс€. Ќаписать алгоритм сортировки выбором.
 * 
 */
public class Task33 {

	public static void main(String[] args) {
		int max;
		int temp;
		int n;
		int nMax;
		int [] array;
		
		array = new int[20];
		n = 10;
		nMax = 0;
		max = CommonTools.MIN_INT;

// заполнение массива
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(100);
		}
// вывод массива до сортировки		
		System.out.println("»сходный массив");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
// сортировка
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

// вывод массива после сортировки
		System.out.println();
		System.out.println("ќтсортированный массив");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
	}

}
