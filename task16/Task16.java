

package by.module2.task16;

import java.util.Scanner;

import by.module2.task11.Task11;


/*  @author Yury Zmushko
 * 	Task 1.6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 * 
 */
public class Task16 {

	public static void main(String[] args) {
		int A[] = new int[100];
		int n;
		int sum;
		
		n = 5;
		sum = 0;

		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			while (true) {
				System.out.println("Введите A[" + i + "]");
				if (input.hasNextInt()) {
					A[i]  = input.nextInt();
					break;
				} else {
						System.out.println(input.next() + " не число");
				}
			}	
		}
		input.close();
		for (int j = 0; j < n; j++) {
			if(ifSimple(A[j])) {
				System.out.println("Простое число A[" + j + "]=" + A[j]);
			}
		}
	}
	
	public static boolean ifSimple(int x) {
		for (int i = 2; i < (x); i++) {
			if (Task11.checkMultiple(x, i)) {
				return false;
			}
		}
		if (x == 1) {
			return true;
		}
		return true;
	}
}
