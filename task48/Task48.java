package by.module2.task48;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 48 Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 * 
 */
public class Task48 {

	public static void main(String[] args) {
		int n;
		int k;
		int m;
		Number [] d;
		int sum;
		
		n = 0;
		k = 0;
		m = 0;
		sum = 0;
		d = new Integer[100];
				
		Scanner input = new Scanner(System.in);
		// Ввод чисел	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, 0, 
											CommonTools.MAX_INT, false, true);
		d = CommonTools.makeArray(input, n, "D", Types.INT, 0, 
								CommonTools.MAX_INT, false, true);
		k  = (int) CommonTools.readBetween(input, "k", Types.INT, 0, 
				n - 1, false, true);
		m  = (int) CommonTools.readBetween(input, "m", Types.INT, k, 
				n - 1, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Нахождение суммы
		try {
			sum = getLineSum(d, k, m);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 		Вывод результата
		System.out.println("Сумма элементов от " + k + " до " + m + " равна = " + sum);	
	}

	private static int getLineSum(Number[] d, int k, int m) throws IOException {
		int sum = 0;
		
		if (k > m || m > d.length) {
			throw new IOException("Wrong arguments");
		}
		for (int i = k; i <= m; i++ ) {
			sum += (int) d[i];
		}
		return sum;
	}
}	