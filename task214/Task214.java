

package by.module2.task214;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.common.CommonTools;
import by.module2.common.Types;
import by.module2.task29.*;

/*  @author Yury Zmushko
 * 	Task 2.14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число 
 * единиц равно номеру столбца.
 * 
 */
public class Task214 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n; 								//число строк
		int m;								//число столбцов
		int bound;
		int onesCount;
		
		bound = 1;
		m = 0;
		n = 0;
		onesCount = 0;
		Scanner input = new Scanner(System.in);
		
// Ввод размерностей массива				
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		m  = (int) CommonTools.readBetween(input, "m", Types.INT, CommonTools.ZERO, 
											n, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
// заполнение массива		
		Random random = new Random();
		
		for (int j = 0; j < m; j++) {		
			onesCount = 0;
				for (int i = 0; i < n; i++) {
				a[i][j] = random.nextInt(bound + 1);
				if (a[i][j] == 1) {
					onesCount++;
				}
				if (onesCount > j) {
					a[i][j] = 0;
				}
			}
		}
		
//		Вывод массива		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}	
}
