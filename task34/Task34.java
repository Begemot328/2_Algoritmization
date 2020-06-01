package by.module2.task34;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.4. Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai ai+1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * 
 */
public class Task34 {

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
