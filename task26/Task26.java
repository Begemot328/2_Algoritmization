

package by.module2.task26;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 
 */
public class Task26 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		final int ONE = 1;
		
		// Ввод размерности массива				
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Введите n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				m = n / 2;
				if ((m * 2) == n) {
					break;
				} else {
					System.out.println(n + " не четное");
				}
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		input.close(); 
// 		Заполнение массива		
		for (int i = 0; i <= m; i++) {
			for (int j = i; j < n - i; j++) {
				a[i][j] = ONE;
				a[(n - i - 1)][j] = ONE;
			}
		}
//		Вывод массива		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "	");
			}
			System.out.println();
		}
	}
}
