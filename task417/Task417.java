package by.module2.task417;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 * 
 */
public class Task417 {

	public static void main(String[] args) {
		int n;
		int[] array;
		int sum;
		int evenQuantity;
		int counter;
		
		n = 0;
		sum = 0;
		counter = 0;
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
		do {
			// Формирование массива чисел	
			try {			
				array = CommonTools.getDigits(n);
			} catch (IOException e) {
				e.printStackTrace();
			}
			sum = 0;
			// Подсчет суммы	
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			n -= sum;
			counter++;
		} while (n > 0);		
		// 		Вывод результата
		System.out.println("Операция проведена " + counter + " раз");
		System.out.println("That's all, folks!");
	}
}	
