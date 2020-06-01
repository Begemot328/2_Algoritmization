package by.module2.task415;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
 * 
 */
public class Task415 {

	public static void main(String[] args) {
		int n;
		int[] array;
		
		n = 0;
		array = new int[100];				
		Scanner input = new Scanner(System.in);
		// Ввод чисел	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Формирование массива чисел	
		try {			
			array = getSpecialNumbers(n);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 		Вывод результата
		System.out.println("Искомые числа:");
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 0) {
				break;
			}
				System.out.println((i + 1) + ". "  + array[i]);
		}
		System.out.println("That's all, folks!");
	}
	
	public static boolean checkArrayRising(int[] a, boolean strictness) throws IOException {
		boolean isRising;
		isRising = true;
		
		if (a.length == 0 || a == null) {
			throw new IOException("Wrong arguments");
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a [i -1]) {
				isRising = false;
			} else if (a[i] == a[i -1] && strictness) {
				isRising = false;
			}
		}
		return isRising;
	}
	
	public static int[] getSpecialNumbers(int n) throws IOException {
		int[] array;
		int counter;
		int LeftBorder;
		int RightBorder;
		
		array = new int[100];
		counter = 0;
		LeftBorder = 0;
		RightBorder = 0;
		
		LeftBorder = (int) Math.pow(10, n - 1);
		RightBorder = (int) Math.pow(10, n) - 1;
		if (n <= 0) {
			throw new IOException("Wrong arguments");
		}
		for (int i = LeftBorder; i <= RightBorder; i++) {
			if (checkArrayRising(CommonTools.getDigits(i), true) 
					&& CommonTools.getDigits(i).length == n) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}
}	
