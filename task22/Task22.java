

package by.module2.task22;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 * 
 */
public class Task22 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		int k;
		String space = "";
		final String pace = "          ";
		
		
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Введите n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				while (true) {
					System.out.println("Введите A[" + i + "]" + "[" + j + "]");
					if (input.hasNextInt()) {
						a[i][j]  = input.nextInt();
						break;
					} else {
						System.out.println(input.next() + " не число");
					}
				}
			}	
		}

		input.close();
		k = 0;
		for (int i = 0; i < n; i++) {
			System.out.println(space + "A[" + i + "]" + "[" + i + "]= " + a[i][i]);
			space += pace;
		}
	}
}
