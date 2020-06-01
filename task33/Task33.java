package by.module2.task33;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.3. Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
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
		System.out.println("Исходный массив");
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
		System.out.println("Отсортированный массив");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
	}

}
