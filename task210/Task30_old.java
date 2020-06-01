

package by.module2.task210;

import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.task11.Task11;
import by.module2.task29.Task29;

/*
public class Task30 {

	public static void main(String[] args) {
		float a[][] = new float[30][30];
		int n;

		n = 0;
		
		Scanner input = new Scanner(System.in);
		
// Ввод размерностей массива				
		try {
		n  = Task29.readIntPositive(input, "n");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
// 		Заполнение массива		
		a = Task29.makeArray(input, n, n,"A", Task29.MIN_FLOAT, Task29.MAX_FLOAT, true);	
		
//		Вывод массива		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}

// 		Выбор положительных элементов
		for (int j = 0; j < n; j++) {
			if (a[j][j] > 0) {
				System.out.print("A[" + j + "]" + "[" + j + "]= " + a[j][j] + "	");
			}
		}
	}
}
*/