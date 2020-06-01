package by.module2.task413;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 * 
 */
public class Task413 {

	public static void main(String[] args) {
		int n;
		int[] array;
		
		n = 0;
		array = new int[100];				
		Scanner input = new Scanner(System.in);
		// Ввод чисел	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, 2, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Формирование массива чисел	
		try {
			array = getSimpleNumbers(n, 2 * n);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 		Вывод результата
		System.out.println("Искомые числа:");
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] == 0) {
				break;
			}
			if ((array[i + 1] - array[i]) == 2) {
				System.out.println("Простые числа-близнецы - " + array[i] + " и " + array[i + 1]);
			}
		}
		System.out.println("That's all, folks!");
	}

	public static int getDigitsSum(int n) {
		int sum = 0;
		
		String name = Integer.toString(n);
		for (int i = 0; i < name.length(); i++)
			sum += Integer.parseInt(name.charAt(i) + "");
		return sum;
	}
	
	public static int[] getSimpleNumbers(int n1, int n2) throws IOException {
		int[] array;
		int counter;
		int n;
		
		array = new int[n2 - n1];
		counter = 0;
		n = n2 - n1;
		if (n1 <= 1 || n2 <= 1 || n1 >= n2) {
			throw new IOException("Wrong arguments");
		}
		for (int i = n1; i <= n2; i++) {
			if (checkSimple(i)) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}
	
	public static boolean checkSimple(int n) {
		boolean result = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = false;
			}
		}
		return result;
	}
}	