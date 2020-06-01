package by.module2.task416;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * 
 */
public class Task416 {

	public static void main(String[] args) {
		int n;
		int[] array;
		int sum;
		int evenQuantity;
		
		n = 0;
		sum = 0;
		evenQuantity = 0;
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
		// Подсчет суммы	
		for (int i = 0; i < array.length - 1; i++) {
			sum += array[i];
			System.out.println(array[i]);
		}
		try {
			evenQuantity = getOddEvenQuantity(sum, false);
		} catch (IOException e) {
			e.printStackTrace();
		}			
		// 		Вывод результата
		System.out.println("Сумма чисел равна " + sum + " и содержит " + evenQuantity + " четных цифр");
		System.out.println("That's all, folks!");
	}
	
	private static int[] getSpecialNumbers(int n) throws IOException {
		int[] array;
		int[] arrayDigits;
		int counter;
		int LeftBorder;
		int RightBorder;
		boolean isOdd;
		
		
		array = new int[10000];
		arrayDigits = new int[n];
		counter = 0;
		LeftBorder = 0;
		RightBorder = 0;
		
		LeftBorder = (int) Math.pow(10, n - 1);
		RightBorder = (int) Math.pow(10, n) - 1;
		if (n <= 0) {
			throw new IOException("Wrong arguments");
		}
		for (int i = LeftBorder; i <= RightBorder; i++) {
			arrayDigits = CommonTools.getDigits(i);		 
			if (getOddEvenQuantity(i, true) == n) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}
	
	private static int getOddEvenQuantity(int n, boolean isOdd) throws IOException {
		int quantity;
		int[] arrayDigits;
		arrayDigits = new int[Integer.toString(n).length()];
		quantity = 0;
		
		if (n <= 1) {
			throw new IOException("Wrong arguments");
		}
		arrayDigits = CommonTools.getDigits(n);
		for (int j = 0; j < arrayDigits.length; j++) {
			if (isOdd && arrayDigits[j] % 2 != 0  
				|| !isOdd && arrayDigits[j] % 2 == 0) {
				quantity++;
			}
		}
		return quantity;
	}
}	
