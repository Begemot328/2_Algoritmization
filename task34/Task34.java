package by.module2.task34;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.4. —ортировка обменами. ƒана последовательность чисел. “ребуетс€ переставить числа в
 * пор€дке возрастани€. ƒл€ этого сравниваютс€ два соседних числа ai и ai+1 . ≈сли ai ai+1 , то делаетс€
 * перестановка. “ак продолжаетс€ до тех пор, пока все элементы не станут расположены в пор€дке возрастани€.
 * —оставить алгоритм сортировки, подсчитыва€ при этом количества перестановок.
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
