package by.module2.task35;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.5. Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1,a2,ai - упорядоченная последовательность, т. е.
 * a1 a2 an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 * 
 */
public class Task35 {

	public static void main(String[] args) {
		int max;
		int temp;
		int n;
		int nMiddle;
		int [] array;
		
		array = new int[20];
		n = 10;
		nMiddle = 0;
		max = CommonTools.MIN_INT;

		//	 заполнение массива
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(10) * (int) Math.pow(-1, random.nextInt(2));
		}
		// вывод массива до сортировки		
		System.out.println("Исходный массив");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
		System.out.println();
		// 	сортировка
		for (int i = 1; i < n; i++) {
			if (array[i] < array[i - 1]) {
				nMiddle = searchPlase(array, i);
				temp = array[i];
				for (int j = i; j > nMiddle; j--) {
					array[j] = array[j - 1];
				}
				array[nMiddle] = temp;
			}
		}

		// 	вывод массива после сортировки
		System.out.println("Отсортированный массив");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
	}

	private static int searchPlase(int[] array, int n) {
		int a;
		// в массиве находят место для элемента n такое, чтобы до него включительно массив шел по возрастанию		
		a = 0;
		for (int i = 1; i < n; i++) {
			if ((array[n] >= array[i - 1]) && (array[n] <= array[i])){
				a = i;
			}
		}
		return a;
	}
}
