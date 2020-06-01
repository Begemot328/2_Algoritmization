package by.module2.task412;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 *	являются числа, сумма цифр которых равна К и которые не большее N.
 * 
 */
public class Task412 {

	public static void main(String[] args) {
		int n;
		int k;
		int[] array;
		
		n = 0;
		k = 0;
		array = new int[100];				
		Scanner input = new Scanner(System.in);
		// Ввод чисел	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		k  = (int) CommonTools.readBetween(input, "k", Types.INT, CommonTools.ZERO, 
				CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Формирование массива чисел	
		try {
			array = getSpecialNumbers(n, k);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 		Вывод результата
		System.out.println("Искомые числа:");
		for (int i = 0; i < n; i++) {
			if (array[i] == 0) {
				break;
			}
			System.out.println(i + ". " + array[i]);
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
	
	public static int[] getSpecialNumbers(int n, int k) throws IOException {
		int[] array;
		int counter;
		
		array = new int[n];
		counter = 0;
		
		if (k <= 1 || n <= 1) {
			throw new IOException("Wrong arguments");
		}
		for (int i = 0; i <= n; i++) {
			if (getDigitsSum(i) == k) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}
}	