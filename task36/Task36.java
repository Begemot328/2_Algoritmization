package by.module2.task36;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. 
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai ai+1 , то продвигаются
 * на один элемент вперед. Если ai  ai+1 , то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 * 
 */
public class Task36 {

	public static void main(String[] args) {
		int counter;
		double temp;
		int n;
		double [] array;
		
		array = new double[20];
		n = 10;
		counter = 0;
		temp = 999;
		
		//	 заполнение массива
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextDouble();
		}
		// вывод массива до сортировки		
		System.out.println("Исходный массив");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
		System.out.println();
		
		// 	сортировка
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

		// 	вывод массива после сортировки
		System.out.println("Отсортированный массив");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
	}
}
