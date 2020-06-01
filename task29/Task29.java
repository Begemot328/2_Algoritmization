

package by.module2.task29;

import java.util.Scanner;
import javax.imageio.IIOException;
import by.module2.common.CommonTools;
import by.module2.common.Types;
import by.module2.task11.Task11;


/*  @author Yury Zmushko
 * 	Task 2.9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой 
 * столбец содержит максимальную сумму.
 */
public class Task29 {

	public static void main(String[] args) {
		Number a[][] = new Number[30][30];
		int n;
		int m;
		float sum;
		float maxSum;
		int nMaxSum;
		
		maxSum = CommonTools.MIN_FLOAT;
		nMaxSum = 0;
		sum = 0;
		m = 0;
		n = 0;
		
		Scanner input = new Scanner(System.in);
		// Ввод размерностей массива				
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		m  = (int) CommonTools.readBetween(input, "m", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 		Заполнение массива		
		a = CommonTools.makeArray(input, n, m, "A", Types.FLOAT, CommonTools.ZERO, CommonTools.MAX_FLOAT, true, true);
		// 		Подсчет сумм и выбор максимальной
		for (int j = 0; j < m; j++) {
			sum = 0;
			for (int i = 0; i < n; i++) {
				sum += (float) a[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				nMaxSum = j;
			}
		}
		//		Вывод массива		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
		//		Вывод результата			
		System.out.println("Максимальная сумма - в столбце № " + nMaxSum 
							+ " и равна " + maxSum);
	}	
}
