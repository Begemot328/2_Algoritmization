

package by.module2.task215;

import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.common.CommonTools;
import by.module2.common.Types;
import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 * 
 */
public class Task215 {

	public static void main(String[] args) {
		Number a[][] = new Number[30][30];
		Number b[][] = new Number[30][30];
		int n;
		int m;
		int max;
		
		m = 0;
		n = 0;
		max = CommonTools.MIN_INT;
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
		a = CommonTools.makeArray(input, n, m, "A", Types.INT, CommonTools.MIN_INT, CommonTools.MAX_INT, true, true);
		input.close();
		
//		Вывод массива
		System.out.println("Исходный массив");	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}		
		
// 		Поиск максимума
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((int) a[i][j] > max) {
					max = (int) a[i][j];
				}
			}
		}	
		
// 		Замена нечетных 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (((int) a[i][j]) % 2 != 0) {
					a[i][j] = max;
				}
			}
		}	
		
//		Вывод массива		
		System.out.println("Конечный массив");	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}	
}
