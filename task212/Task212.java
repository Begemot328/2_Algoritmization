

package by.module2.task212;

import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.common.CommonTools;
import by.module2.common.Types;
import by.module2.task11.Task11;

public class Task212 {

	public static void main(String[] args) {
		Number a[][] = new Number[30][30];
		Number b[][] = new Number[30][30];
		int n;
		int m;
		
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
		
// 		Сортировка
		b = CommonTools.sortArrayRows(a, n, m);
		
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
