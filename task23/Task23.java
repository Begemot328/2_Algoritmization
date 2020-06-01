

package by.module2.task23;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 * 
 */
public class Task23 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		int k;
		int p;
		
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
		while (true) {
			System.out.println("Введите m");
			if (input.hasNextInt()) {
				m  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
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
		
		while (true) {
			System.out.println("Введите k");
			if (input.hasNextInt()) {
				k  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		
		if (k <= n) {
			k--;	
			for (int i = 0; i < n; i++) {
				System.out.println("A[" + i + "]" + "[" + k + "]= " + a[i][k]);
			}
		} else {
			System.out.println("Вне массива");
		}
		
		while (true) {
			System.out.println("Введите p");
			if (input.hasNextInt()) {
				p  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		
		if (p <= m) {
			p--;	
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + p + "]" + "[" + j + "]= " + a[p][j] + "      ");
			}
		} else {
			System.out.println("Вне массива");
		}
		input.close();
	}
}
