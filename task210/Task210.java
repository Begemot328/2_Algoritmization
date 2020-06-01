

package by.module2.task210;

import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.common.CommonTools;
import by.module2.common.Types;
import by.module2.task11.Task11;
import by.module2.task29.*;

/*  @author Yury Zmushko
 * 	Task 2.10. Найти положительные элементы главной диагонали квадратной матрицы.
 * 
 */
public class Task210 {

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
		} catch (Exception e) {
			e.printStackTrace();
		}
// 		Заполнение массива		
		a = CommonTools.makeArray(input, n, n, "A", Types.FLOAT, CommonTools.MIN_FLOAT, CommonTools.MAX_FLOAT, true, true);
		
// 		Выбор положительных элементов
		for (int j = 0; j < n; j++) {
			if ((float)a[j][j] > 0) {
				System.out.println("A[" + j + "]" + "[" + j + "]= " + a[j][j] + "	больше нуля   ");
			}
		}
	}	
}
